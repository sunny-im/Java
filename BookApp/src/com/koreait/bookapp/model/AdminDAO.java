package com.koreait.bookapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DAO ( Data Access Object : 오직 Create(insert), Read(select), Update Delete 작업만을 수 행하는 모델객체)
public class AdminDAO {
	String url = "jdbc:mysql://@localhost:3306/bigdata";
	String user = "root";
	String pass = "1234";

	// Admin 테이블에 레코드 넣기!!
	public int insert(Admin admin) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로드
			con = DriverManager.getConnection(url, user, pass); // 접속 시도
			if (con != null) {
				System.out.println("접속성공");

				String sql = "insert into admin(admin_id, id, name, pass,email)";
				sql += " values(seq_admin.nextval,?,?,?,?)";

				pstmt = con.prepareStatement(sql); // 쿼리 객체생성
				// 바인드변수에 값 할당하기 , 바인드변수는 1부터 시작
				pstmt.setString(1, admin.getId());
				pstmt.setString(2, admin.getName());
				pstmt.setString(3, admin.getPassword());
				pstmt.setString(4, admin.getPassword());

				result = pstmt.executeUpdate(); // 쿼리문에 의해 영향을 받은 레코드 수를 반환 (세팅하고 실행해야하므로 마지막에)
			} else {
				System.out.println("접속실패");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	// 존재하는 회원인지 여부 처리 메소드(로그인 처리)
	public Admin select(Admin admin) { // 해당 회원 정보를 반환시켜야 하므로 void가 아닌 Admin으로 변경
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Admin vo = null; // 반환하기 위해

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로드
			con = DriverManager.getConnection(url, user, pass);

			if (con != null) {
				System.out.println("접속성공");
				String sql = "select * from admin where id=? and pass=?";
				pstmt = con.prepareStatement(sql); // 쿼리 수행객체 얻기
				pstmt.setString(1, admin.getId()); // VO에 들어있는 ID 값
				pstmt.setString(2, admin.getPassword()); // VO에 들어있는 Password값

				rs = pstmt.executeQuery(); // select문 수행 후 그 결과를 Resultset으로 받음
				if (rs.next()) {
					System.out.println("레코드가 존재하므로 로그인 성공");
					// 로그인에 성공하면 어플리케이션은 해당 회원의 정보를 언제든 출력하거나 수정할 수 있게 해줘야 한다.
					// 따라서 이 메소드에 반환형으로 회원정보를 반환해주자!!
					vo = new Admin(); // empty 인스턴스 생성
					vo.setAdmin_id(rs.getInt("admin_id")); // pk담음
					vo.setId(rs.getString("id")); // id 담기
					vo.setPassword(rs.getString("pass")); // 비번담기
					vo.setName(rs.getString("name")); // 이름담기
					vo.setEmail(rs.getString("email")); // 이메일담기

				} else {
					System.out.println("레코드가 존재하지 않으므로 로그인 실패");
				}
			} else {
				System.out.println("접속실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return vo; // 객체반환
	}
}
