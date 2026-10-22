class PositiveOddGenerator extends AbstractGenerator{
	public PositiveOddGenerator(int current){
		super(current);
	}
		
	public void next(){
		current=current+2;
	}
}