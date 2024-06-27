import java.sql.; *//completed


public class JdbcDemo {

	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/######";
		String username="root";
		String password="";
		String query="select empName from employee where empId = 2;";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //completed
		Connection con = DriverManager.getConnection(url,username,password); //completed
		Statement st = con.createStatement(); //completed
		
		ResultSet rs = st.executeQuery(query); //completed
		
		rs.next();
		
		String name= rs.getString("empName"); //completed
		System.out.println(name); 
		
		st.close();  //completed
		con.close();  //completed
		
	}

}