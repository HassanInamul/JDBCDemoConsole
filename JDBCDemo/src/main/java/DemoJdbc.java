import java.sql.*;
public class DemoJdbc {

	public static void main(String[] args) throws Exception {
		String url="jdbc:postgresql://localhost:5432/demo";
		String username="postgres";
		String password="root";
		int sid=7;
		String sname="hussain";
		int marks=67;
		String query="insert into student values(?,?,?)";
		Connection con= DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established");
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, sid);
		st.setString(2, sname);
		st.setInt(3,marks);
		//for insert,update,delete we use execute only
		st.execute();
		//for selection queries we use Resultset and executeQuery
//		ResultSet rs= st.executeQuery(query);
//		while(rs.next()) {
//			System.out.print(rs.getInt(1)+"-");
//			System.out.print(rs.getString(2)+"-");
//			System.out.print(rs.getInt(3));
//			System.out.println();
//		}
		con.close();
		System.out.println("Connection Closed");
	}

}
