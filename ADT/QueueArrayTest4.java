public class QueueArrayTest4{
	public static void main (String[] args)
	{
		QueueArray que = new QueueArray(4);
		//que.enqueue('b');
		//que.enqueue('c');
		//que.enqueue('f');
		que.enqueue('d');
		que.dequeue();
		que.printQueInFIFO();
		que.enqueue('k');
		que.printQueInFIFO();
	}
}
class QueueArray {
  private int maxSize;
  private char[] queArray;
  private int front, rear, nItems;

public QueueArray(int s) {
     front = 0;   rear = -1;  nItems = 0;
     maxSize = s;
     queArray = new char[maxSize];
  }
  
  public void enqueue(char j) {
     rear = (rear+1) % maxSize;
     queArray[rear] = j;
     nItems++;
  }
  
  public void dequeue() {
     nItems--;
     front = (front+1) % maxSize; 
  }
public char front() {
    return queArray[front];
  }  
  public boolean isEmpty() {
    return (nItems==0);
  }  
  public boolean isFull() {
     return (nItems==maxSize);
  }  
  public int size() {
     return nItems;
  }
  public void printQueInFIFO() {
  	if (nItems==0)
  	System.out.print("Queue is empty");
  	else if (front <= rear )
  	{
  		for (int i=front ; i<=rear ; i++ )
  		System.out.print(queArray[i]+" ");
  	}
  	else
  	{
  		for (int i=front ; i<maxSize ; i++ )
  		System.out.print(queArray[i]+" ");
  		for (int i=0 ; i<=rear ; i++ )
  		System.out.print(queArray[i]+" ");
  	}
  	System.out.println();
  }
}