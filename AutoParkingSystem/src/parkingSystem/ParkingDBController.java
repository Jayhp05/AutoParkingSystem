package parkingSystem; 
 
import java.sql.*; 
 
public class ParkingDBController {
	
	String url="jdbc:oracle:thin:@localhost:1521:xe"; 
	String userid="c##parking"; /* 12버전 이상은 c##을 붙인다. */ 
	String pwd="parking"; 
 
	Connection con; 
  
	public ParkingDBController() { 
		try { /* 드라이버를 찾는 과정 */
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			System.out.println ("드라이버 로드 성공"); 
		} 
   
		catch(ClassNotFoundException e) { 
			e.printStackTrace(); 
		} 
	} 
  
	public boolean startConnection() { 
		boolean ret = false; 
		try /* 데이터베이스를 연결하는 과정 */{  
			System.out.println ("데이터베이스 연결 준비 ..."); 
			con=DriverManager.getConnection(url, userid, pwd); 
			System.out.println ("데이터베이스 연결 성공"); 
			ret = true; 
		} 
		catch(SQLException e) { 
			e.printStackTrace(); 
			ret = false; 
		} 
		return ret; 
	} 
  
	public void ExeQry(String sql) { 
		try { 
			Statement stmt = con.createStatement(); 
			stmt.execute(sql);
		} 
		catch(SQLException e){ 
			e.printStackTrace(); 
		} 
	} 
} 