import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.*;
public class GameRule extends Frame implements ActionListener
{
  private static final int TimeLimit=120;
  private static int size=5;	
  private static int points=0;	
  private static int noOfButtons=size*size;
  private static int rowCurrent,colCurrent;
  private static int timeCounter=TimeLimit;
  Color color1 = new Color(75,170,50);
  private Button buttons[][] = new Button[size][size];
  private Button previous=null;
  private Button current=null;
  private Button submitWord = new Button("Submit");
  private Button clearWord = new Button("Clear");
  private Button restartGame = new Button("New Game");  
  private TextField tf1 = new TextField(20);
  private TextField tf2 = new TextField(20);
  private TextField tfPoint = new TextField(10);
  private TextField tfTimeLeft = new TextField(10);
  private TextArea jta = new TextArea(8,10);
  private Panel panel1  = new Panel();
  private Panel panel2 = new Panel();
  private Panel panel3 = new Panel(); 
  private Panel panel4 = new Panel(); 
  
  public GameRule()
  {    
    rowCurrent=colCurrent=-1;
    setTitle("Word Game -- Designed by Murtaza Khan"); // Set the window title
    setSize(375,300); // setting width and height of frace
	
	panel1.setLayout(new GridLayout(5,5));
	addButtonsToPanel();      
    
    clearWord.addActionListener(this);
    submitWord.addActionListener(this);
    restartGame.addActionListener(this);
    
    tf1.setEditable(false);
    tf2.setEditable(false);
    jta.setEditable(false);
    tfPoint.setEditable(false);
    tfTimeLeft.setEditable(false);
    
    tfPoint.setText("Points "+points);    
    
    add("Center", panel1);
    
    panel2.setLayout(new FlowLayout());
    panel2.add(tf1);
    panel2.add(tfTimeLeft);       
    panel2.add(tfPoint);    
    add("North",panel2);
    
    panel3.setLayout(new FlowLayout());
    panel3.add(tf2);
    panel3.add(submitWord);
    panel3.add(clearWord);
    panel3.add(restartGame);
    add("South",panel3);  
	
    panel4.add(jta);       
    add("East",panel4);
    
    show();
  }   	

  public void addButtonsToPanel()
  {
  	String[] strAry=randomString(noOfButtons);
	int count=0;
    for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){
    		buttons[i][j] = new Button(strAry[count++]);    		
    		buttons[i][j].setBackground(color1);
    		panel1.add(buttons[i][j]);    		
    		buttons[i][j].addActionListener(this);    		
    	}
     }
  }
  
  public void EndGame()
  {
  	for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){
    		buttons[i][j].removeActionListener(this);    		    		
    	}
     }
    clearWord.removeActionListener(this);
    submitWord.removeActionListener(this);    
  }	
  
  public void setButtonsLabels()
  {
  	String[] strAry=randomString(noOfButtons);
	int count=0;
    for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){
    		buttons[i][j].setLabel(strAry[count++]);
    		buttons[i][j].setBackground(color1);    		
    	}
    }
  }
  
  public void addAllButtonLitener()
  {
  	for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){    		
    		buttons[i][j].addActionListener(this);    		
    	}
     }
    clearWord.addActionListener(this);
    submitWord.addActionListener(this);
    restartGame.addActionListener(this);
     
  }
  
  public void RestartGame()
  {
  	if(timeCounter<0)
  	{
  		addAllButtonLitener();
  		timeCounter=TimeLimit;  	
  		startTimer();
  	}
  	points=0;
  	previous=null;
  	current=null;
  	rowCurrent=colCurrent=-1;
  	tf1.setText("");
  	tf2.setText("");
  	tfPoint.setText("Points "+points);  	
  	jta.setText("");
  	setButtonsLabels();
  	timeCounter=TimeLimit;  	
  }
  
  public void WordClear()
  {
  	tf1.setText("");
  	tf2.setText("");
  	for (int i=0; i<size; i++){
  		for (int j=0; j<size; j++){
  			buttons[i][j].setBackground(color1);  			
  		}
  	}    		
  	previous=null;
  	current=null;  	
  }
  
  public void WordSubmit()
  {
  	String word=tf1.getText();
  	if (word.length()<3){  	
  		tf2.setText("Atleast 3 characters word");
  	}  		  	
  	else{
  		jta.append(word+"\n");
  		points=points+word.length();
  		tfPoint.setText("Points "+points);
  		WordClear();
  	}
  }
  
  
  	
  public void actionPerformed(ActionEvent ae)
  {
  	
  	if (ae.getSource() == restartGame){
  		RestartGame();
  		return;
  	}
  	if (ae.getSource() == clearWord){
  		WordClear();
  		return;	
  	}
  	
  	if (ae.getSource() == submitWord){
  		WordSubmit();
  		return;	
  	}
  	
  	int rowPrevious,colPrevious;
  	rowPrevious=rowCurrent;
  	colPrevious=colCurrent;
  	previous=current;
  	for (int i=0; i<size; i++){
    	for (int j=0; j<size; j++){
    		if (ae.getSource() == buttons[i][j]){
    			rowCurrent=i;
    			colCurrent=j;
    		}
    	}
      }
    if (previous==null)  
    {
    	current=buttons[rowCurrent][colCurrent];  
    	current.setBackground(Color.pink);
    	tf1.setText(tf1.getText()+current.getLabel());  	
    	tf2.setText("Legal Move");  	
    }
  	if (previous!=null)
  	{  		
  	    boolean flag=checkAdjacent(rowCurrent,rowPrevious,colCurrent,colPrevious);  	
  		if (flag)
  		{
  			current=buttons[rowCurrent][colCurrent];  
    		current.setBackground(Color.pink);
    		tf1.setText(tf1.getText()+current.getLabel());  	
    		tf2.setText("Legal Move");  	
  		}
  		else
  		{
  			rowCurrent=rowPrevious;
  			colCurrent=colPrevious;
  			tf2.setText("Illegal Move");  	
  		}
  	}
  }  
  public boolean checkAdjacent(int rowCurrent,int rowPrevious,int colCurrent,int colPrevious)
  {
  	boolean flag=false;
  	
  	if (rowCurrent==rowPrevious)
  	{
  		if (colCurrent==colPrevious-1 || colCurrent==colPrevious+1)
  		flag=true;
  	}
  	else if (rowCurrent==rowPrevious-1 || rowCurrent==rowPrevious+1 )
  	{
  		if (colCurrent==colPrevious-1 || colCurrent==colPrevious+1 || colCurrent==colPrevious )
  		flag=true; 
  	}
  	else
  	flag=false;
  	return flag;
  }
  
  public String[] randomString(int n)
  {
  	String [] strAry1={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
  	String [] strAry2 = new String[n];
  	int [] a = new int[n];
  	Random generator = new Random();
  	for (int i = 0; i < a.length; i++)
  	{
  		a[i] = generator.nextInt(26);
  		strAry2[i]=strAry1[a[i]];
  		//System.out.print(strAry2[i]+"\t");
  	}  		  	
  	return strAry2;
  }
  
  public void startTimer()
  {
  	TimeThreadClass t1 = new TimeThreadClass();
	t1.start();
  } 
  
  class TimeThreadClass extends Thread // inncer class
  {	
	public void run()
	{
	    	while (timeCounter>=0)
	  		{
	  			//System.out.println(timeCounter/60+":"+timeCounter%60);	
	  			tfTimeLeft.setText("Time "+timeCounter/60+":"+timeCounter%60);
	  			timeCounter--;
	  			if(timeCounter<0)
 				{
	  				EndGame();
			  	}		
	  			try{ Thread.sleep(1000); } catch(InterruptedException e){}
	  		}
		
	}
  }
  
  public static void main(String[] args)
  {
    GameRule gameObj = new GameRule();
  	gameObj.startTimer();    
  }
    
}

 
