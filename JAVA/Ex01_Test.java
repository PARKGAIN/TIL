package pack04.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_Test {
//Oracle<-> Java DataBase Connection
	//Connection <= 연결로를 만드는 객체(연결 객체)
	//PreparedStatement 어떤 데이터를 전송하기 위한 객체 (연결된 연결객체를 통해서 전송함)
	//ResultSet 전송하고 나서 응답을 받으면 그 결과를 담는 객체 (결과 객체)
	
	public static void main(String[] args) {
		Ex01_Test et = new Ex01_Test();
		//et.connectionTest();
		//et.connectionTest2();
		et.connectionTest3();
	}//main
	
	//Connection 연결 객체 사용해서 통신 되는지 체크
	public boolean connectionTest() {//url, user, password, Ojdbc Class(동적 로딩)
		
		//oracle.jdbc.driver.OracleDriver
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user="hanul";
		String password="0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //필요한 드라이버를 동적으로 로딩함.
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn.isClosed()) {	//is <= boolean을 리턴하는 네이밍룰
				System.out.println("닫힘");
			}else {
				System.out.println("열림");
				
				PreparedStatement ps = 
						conn.prepareStatement("select 1 num from dual ");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt("num")); // 아래것보다는 안전
					System.out.println(rs.getInt(1));// <= 이방식은 많이 위험함
				}
				
				conn.close();//통신을 닫음 ※ 동시에 접속할 수 있는 숫자가 정해져있음 
				if(conn.isClosed()) System.out.println("닫힘(내가 닫음)");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}//()
	public boolean connectionTest2() {
	//oracle.jdbc.driver.OracleDriver
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user="hanul";
			String password="0000";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver"); //필요한 드라이버를 동적으로 로딩함.
				Connection conn = DriverManager.getConnection(url, user, password);
				if(conn.isClosed()) {	//is <= boolean을 리턴하는 네이밍룰
					System.out.println("닫힘");
				}else {
					System.out.println("열림");
					
					PreparedStatement ps = 
							conn.prepareStatement("select 'PGI' name from dual ");
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getString("name")); // 아래것보다는 안전
						System.out.println(rs.getString(1));// <= 이방식은 많이 위험함
					}
					
					conn.close();//통신을 닫음 ※ 동시에 접속할 수 있는 숫자가 정해져있음 
					if(conn.isClosed()) System.out.println("닫힘(내가 닫음)");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return false;
	}
	
	public boolean connectionTest3() {
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user="hanul";
		String password="0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //필요한 드라이버를 동적으로 로딩함.
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn.isClosed()) {	//is <= boolean을 리턴하는 네이밍룰
				System.out.println("닫힘");
			}else {
				System.out.println("열림");
				Scanner sc = new Scanner(System.in);
				String name = sc.nextLine();
				
				PreparedStatement ps = 
						conn.prepareStatement("select '"+ name + "'result from dual ");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					
					System.out.println(rs.getString("result")); // 아래것보다는 안전
					System.out.println(rs.getString(1));// <= 이방식은 많이 위험함
				}
				
				conn.close();//통신을 닫음 ※ 동시에 접속할 수 있는 숫자가 정해져있음 
				if(conn.isClosed()) System.out.println("닫힘(내가 닫음)");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
