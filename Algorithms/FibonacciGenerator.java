class FibonacciGenerator extends AbstractGenerator{
	private int prv1=0;
	private int prv2=1;
	public FibonacciGenerator(){
		super(1);
	}
		
	public void next(){
		current=prv1+prv2;
		prv1=prv2;
		prv2=current;
		
	}
}