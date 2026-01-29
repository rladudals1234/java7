package j0129_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C05 {

	public static void main(String[] args) {
		//Exception처리는
		//db접속
		//입출력
		//file처리
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ora_user";
		String pw = "1111";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//커넥션풀: DB연결개수
		try {
			//클래스 정보 가져오기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
			String query = "select * from member";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("pw");
				String name = rs.getString("name");
				System.out.println(id + "\t" + password + "\t" + name);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
