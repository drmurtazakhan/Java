import java.util.StringTokenizer;
import java.io.*;

class FullyQualifiedName {
	
	String fqn;
	String packageName;
	String className;
	
	public FullyQualifiedName (String fqn) {
		this.fqn = fqn;
	}
	
	void separate(){
		int splitPoint = fqn.lastIndexOf(".");
		String firstLetter = fqn.substring(splitPoint + 1, splitPoint + 2);
		if(firstLetter.equals(firstLetter.toUpperCase())){
			packageName = fqn.substring(0, splitPoint);
			className = fqn.substring(splitPoint + 1);
		}else{
			packageName = fqn;
			className = "";
		}
	}
	
	public String toString(){
		return "Fully Qualified Name: " + fqn 
			+ "\nPackage Name: " + packageName
			+ "\nClass Name: " + className;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a fully qualifed class or package name: ");
		String line = reader.readLine();
		FullyQualifiedName fqn = new FullyQualifiedName(line);
		fqn.separate();
		System.out.println(fqn);

	}
}
