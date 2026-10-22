public class QueueArray {
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
}