public class TestMyQueue{
	public static void main(String[] args){
		MyQueue  queue = new MyQueue();
		
		for(int i = 0; i <= 5; i++)
		queue.enqueue(new Integer(i));
		for(int i = 0; i <= 5; i++)
		System.out.println(queue.dequeue());
		
	}
}