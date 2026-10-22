class MyNumber
{
	public static void main(String[] args)
	{
		double num,numRound,numCeil,numFloor;
		int numInteger;
		num=56.764;
		numRound=Math.round(num);
		numCeil=Math.ceil(num);
		numFloor=Math.floor(num);
		numInteger=(int)num;
		System.out.println("Round value is "+numRound);
		System.out.println("Ceil value is "+numCeil);
		System.out.println("Floor value is "+numFloor);
		System.out.println("Integer value is "+numInteger);
	}
}