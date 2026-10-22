import java.sql.*;
public class SelectQuery1{
	private Connection con=null;
   	private Statement selectStatement;
	private ResultSet selectResult;
	public void connectToDB(){
      	try{
			System.out.println("Loading the driver ...");
         	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         	System.out.println("Connecting to database ...");
			con = DriverManager.getConnection("jdbc:odbc:Library1");
			if(con!=null)
			System.out.println("Connected to database ...");
		}
		catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}
		catch(ClassNotFoundException cnfe){
			System.out.println(cnfe.getMessage());
		}
	}
	public void closeDB(){
		try {
			if(con != null)
			con.close();
		}
		catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}
	}
	public void processBooksQuery(){
		//String  query = "select * from members";
		String  query = "select * from members where NumberOfBooks<=1";
		//String  query = "select * from members where NumberOfBooks>1";
		//String  query = "select * from books";
		//String  query = "select * from books order by author desc";
      	//String  query = "select * from books where author='Bashir Ghandi'";
      	//String  query = "select * from books where author='Bashir Ghandi' and title='Java made Easy'";
      	//String  query = "select * from books where borrowed";
      	//String  query = "select * from books where title like'java%'";
		try{
			selectStatement = con.createStatement();
			System.out.println("Sending Query to database Table ...\n");
			selectResult = selectStatement.executeQuery(query);
			System.out.println("The Query  :  "+query+"\n");
			System.out.println("Query results\n");
         	while(selectResult.next()){
				System.out.println(selectResult.getString("IDNumber")+"\t"+selectResult.getString("Name")+"\t"+selectResult.getString("NumberOfBooks"));
         	}
			selectResult.close();
		}
		catch(SQLException sqle){
         	System.out.println(sqle.getMessage());
		}
	}
	public static void main(String[] args){
		SelectQuery sq = new SelectQuery();
		sq.connectToDB();
		sq.processBooksQuery();
  		sq.closeDB();
  	}  
}