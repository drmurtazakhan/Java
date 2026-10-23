

import java.io.*;

public class QuadTree {
QtNode startNode;
int[][] image;
int initialSize;
int depth = 0;
int maxDepth;
int numberOfNodes = 0;
int numberOfLeaves = 0;
int dummy;
  //----------------------------------------------------
  // Construct a quadtree from a given textfile
  // Fileformat:
  // Textfile, one number per line
  // first number: initial width (=height) of image
  // following numbers: the tree's grayvalues.
  // every leaf has a grayvalue between 0..255,
  // all other nodes' values are set to 256.
  // Hence it is possible to distinguish between leaves
  // and non-leaves by the grayvalue.
  // The nodes are loaded recursively: if a node is not
  // leaf, its 4 children are recursively loaded from
  // left to right.
  // Example:
  //        256
  //     /  | |  \
  //  100 256 110 203
  //    / | | \
  //  99 16 23 17
  //
  // would be constructed by the following file:
  // 256,256,100,256,99,16,23,17,110,203
  // (the file would contain one number per row, the first
  // '256' is the size, the following numbers define the tree)
  //----------------------------------------------------------
  public QuadTree(String filename){
    this.startNode = new QtNode();
    BufferedReader myInput = null;
    try{
      BufferedReader file = new BufferedReader(
          new FileReader(filename));

      initialSize = (new Integer(file.readLine())).intValue();
      numberOfNodes = 0;
      numberOfLeaves = 0;
      readRecursive(startNode, file);
    }catch(IOException e){
      System.out.println("Error: invalid fileformat or file not found\n");
      System.out.println(e.getMessage());
    }

    // eventually: fill all nodes with gray-values
    // these are used if the output of the tree is
    // not required in full depth (=resolution)
    fillGrayValues(startNode);
  }

  //----------------------------------------------------
  // Recursive construction of a quadtree
  // Required filestructure as described in constructor
  //----------------------------------------------------
  public void readRecursive(QtNode qtn, BufferedReader file)
  throws IOException{
    int g = (new Integer(file.readLine())).intValue();
    numberOfNodes++;

    // Leaf (g<256) ?
    if (g<256){
      numberOfLeaves++;
      if (g<0){
        throw (new IOException());
      }
      qtn.grayValue = g;
      qtn.leaf = true;
    }
    // else: Recursion !
    else{
      qtn.grayValue = 0;
      for (int i = 0; i<4; i++){
        qtn.children[i] = new QtNode();
        readRecursive(qtn.children[i],file);
      }
    }
  }

  //--------------------------------
  // treeToImageArray
  // create 2d-image array from tree
  //--------------------------------
  public int[][]toArray(){
   return toArray(Integer.MAX_VALUE);
  }

  public int[][] toArray(int max){
    dummy = 0;
    depth = 0;
    maxDepth = max; //traverse unitl depth of maxDepth
    int theArray[][] = new int[initialSize][initialSize];
    traverseTree(startNode,0,0,initialSize, theArray);
    System.out.println("Nodes visited for drawing:"+dummy);
    return theArray;
  }

  //-----------------------------------
  // the recursion needed for toArray[]
  //-----------------------------------
  public void traverseTree(QtNode node, int bsx, int bsy, int size, int[][]im){
    depth++;
    dummy++;
    if ((node.leaf)||(depth>maxDepth))
      fillArray(im,bsx,bsy,size,node.grayValue);
    else{
      size = size/2;
      traverseTree(node.children[0],bsx,bsy,size,im);
      traverseTree(node.children[1],bsx+size,bsy,size,im);
      traverseTree(node.children[2],bsx,bsy+size,size,im);
      traverseTree(node.children[3],bsx+size,bsy+size,size,im);
    }
    depth--;
  }

  //-----------------------------------------------
  // fill square area in array with grayvalue given
  //-----------------------------------------------
  public void fillArray(int[][]im, int bsx, int bsy, int size, int value){
    for (int y=bsy;y<bsy+size;y++)
      for (int x=bsx;x<bsx+size;x++)
        im[y][x]=value;
  }


  //------------------------------------------------------------------------
  // fill grayValue
  // recursively assign the grayValues of non-leaf-nodes the average
  // grayValue of their children.
  // What for ?
  // If the reconstruction of the image doesn't require the full resolution,
  // i.e. the tree is not traversed in it's full depth, some nodes which
  // are originally no leaves are treated as leaves, hence a grayvalue is
  // required.
  //-------------------------------------------------------------------------

  public void fillGrayValues(QtNode node){
    if (node.leaf)
      return;
    else{
      int g = 0;
      for (int i = 0; i<4;i++){
        fillGrayValues(node.children[i]);
        g += node.children[i].grayValue;
      }
      node.grayValue = g/4;
    }
  }

  //--------------------------------
  // toString
  //--------------------------------
  public String toString(){
    return("Quadtree: nodes:"+numberOfNodes+", leaves:"+numberOfLeaves);
  }
}