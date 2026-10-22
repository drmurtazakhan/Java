public class QueueArrayString {
  private int maxSize;
  private String[] queArray;
  private int front, rear, nItems;

public QueueArrayString(int s) {
     front = 0;   rear = -1;  nItems = 0;
     maxSize = s;
     queArray = new String[maxSize];
  }
  
  public void enqueue(String j) {
     rear = (rear+1) % maxSize;
     queArray[rear] = j;
     nItems++;
  }
  
  public void dequeue() {
     nItems--;
     front = (front+1) % maxSize; 
  }
public String front() {
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