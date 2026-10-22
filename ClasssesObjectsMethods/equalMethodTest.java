/** 
 * Description: Program to Test equals Method of Object class. 
 * @author Murtaza Ali Khan 
 * Copy Right Murtaza Ali Khan 
 * Email: murtaza@ccse.kfupm.edu.sa 
 * This program does not imply any warranty direct of implied.
 */
class equalMethodTest
{	
	public static void main (String args[])
	{
		Student s1=new Student(111,"Ahmad");
		Student s2=new Student(111,"Ahmad");		
		Student s3=s1; // s3 and s1 refer to same object
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);		
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);		
	}
}
class Student
{
	private int id;
	private String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;		
	}
}
	

