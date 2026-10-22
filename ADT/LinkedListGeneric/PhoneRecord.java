class PhoneRecord
{
	private String name;
	private String phoneNumber;
	public PhoneRecord(String n,String pn)
	{
		name=n;
		phoneNumber=pn;
	}
	public String toString ()
	{
		return name+" "+phoneNumber;
	}
}