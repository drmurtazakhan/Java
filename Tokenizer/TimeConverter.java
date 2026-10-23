import java.util.StringTokenizer;
import java.io.*;

class TimeConverter {
	
	String currentTime;
	
	
	public TimeConverter (String currentTime) {
		this.currentTime = currentTime;
	}
	
	void convert(){
		StringTokenizer stok = new StringTokenizer(currentTime, ":APap");

		int hour =-1;
		String minutes = "";
		boolean invalidInput = false;
		
		if(stok.hasMoreTokens()){
			String temp = stok.nextToken(":").trim();
			hour = Integer.parseInt(temp);
			if(hour > 12) invalidInput = true;
		}
		
		if(stok.hasMoreTokens()){
			minutes = stok.nextToken(":APap").trim();
			if(minutes.length() == 1)
				minutes = "0" + minutes;
			if(Integer.parseInt(minutes) > 59)
				invalidInput = true;
			
		}
		
		if(stok.hasMoreTokens()){
			String temp = stok.nextToken("").trim();
			if(temp.equalsIgnoreCase("PM"))
				hour = (hour + 12)%24;
			else if(!temp.equalsIgnoreCase("AM"))
				invalidInput = true;
		}
		
		if(!invalidInput)
			currentTime = new String((hour<10?"0":"") + hour + ":" + minutes);
		else
			currentTime = "Invalid input";
	}
	public String toString(){
		return currentTime;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a valid time in 12 hour format (e.g. 12:13AM): ");
		String time = reader.readLine();
		TimeConverter timeConverter = new TimeConverter(time);
		System.out.println("Input : " + timeConverter);
		timeConverter.convert();
		System.out.println("Output: " + timeConverter);

	}
}
