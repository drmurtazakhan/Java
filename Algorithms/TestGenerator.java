class TestGenerator{
	public static void main(String args[]){
		PositiveOddGenerator po1=new PositiveOddGenerator(3);
		System.out.println(po1.get());
		po1.next();
		System.out.println(po1.get());
		po1.next();
		System.out.println(po1.get());
		po1.next();
		System.out.println(po1.get());
		po1.reset();
		System.out.println(po1.get()+" Reset");
		System.out.println("______________________");
		FibonacciGenerator fo1= new FibonacciGenerator();
		System.out.println(fo1.get());
		fo1.next();
		System.out.println(fo1.get());
		fo1.next();
		System.out.println(fo1.get());
		fo1.next();
		System.out.println(fo1.get());
		fo1.next();
		System.out.println(fo1.get());
		fo1.reset();
		System.out.println(fo1.get()+" Reset");
		
		
	}			
}