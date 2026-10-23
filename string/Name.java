public class Name
{
	public static void main(String[] args)
	{
		String firstName="Cay";
		String lastName="Horstman";
		
		String name =firstName +" " +lastName; //String Concatenation
		System.out.println(name);
		
		int lengthofname = name.length();     // String length
		System.out.println(lengthofname);
		
		String firstLetter = name.substring(0,1);            // substring
		String last3Letter = name.substring(lengthofname-3); // substring
		
		System.out.println("fisrt letter of name is :"+firstLetter);
		System.out.println("last three letters of name are :"+last3Letter);
		
		String nameCaps=name.toUpperCase();
		System.out.println("Name is caps is :"+nameCaps);
	}
}