package member;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;


public class MemberDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}

	private MemberDAO() {
	con = DatabaseFactory.createDatabase(Vendor.ORACLE, Constants.USER_ID, Constants.USER_PW).getConnection();
	}

	public int insert(MemberBean mem) {
		int result = 0;
		String sql = "insert into member(id, pw, name, birth, gender, phone, address, region, job, licence_val"
				+ ",licence_local, licence_num, licence_end, licence_start)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPw());
			pstmt.setString(3, mem.getName());
			pstmt.setString(4, mem.getBirth());
			pstmt.setString(5, mem.getGender());
			pstmt.setString(6, mem.getPhone());
			pstmt.setString(7, mem.getAddress());
			pstmt.setString(8, mem.getRegion());
			pstmt.setString(9, mem.getJob());
			pstmt.setString(10, mem.getLicenceVal());
			pstmt.setString(11, mem.getLicenceLocal());
			pstmt.setString(12, mem.getLicenceNum());
			pstmt.setString(13, mem.getLicenceEnd());
			pstmt.setString(14, mem.getLicenceStart());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result ==1) {
			System.out.println("DAO에서 가입 성공");
		}else{
			System.out.println("DAO에서 가입 실패");
		}
		return result;
	}

	public int update(MemberBean member) {
		int result = 0;
		String sql = "update member "
				+ "set pw = ?,phone = ?,address=?,region = ?,job = ?,licence_val=?,licence_num=?,licence_local=?,licence_start=?,licence_end=? "
				+ "where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getPhone());
			pstmt.setString(3, member.getAddress());
			pstmt.setString(4, member.getRegion());
			pstmt.setString(5, member.getJob());
			pstmt.setString(6, member.getLicenceVal());
			pstmt.setString(7, member.getLicenceNum());
			pstmt.setString(8, member.getLicenceLocal());
			pstmt.setString(9, member.getLicenceStart());
			pstmt.setString(10, member.getLicenceEnd());
			pstmt.setString(11, member.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public boolean login(MemberBean member) {
		boolean loginOk = false;
		if (member.getId() != null && this.existId(member.getId())) {
			MemberBean member1 = this.findById(member.getId());
			if (member1.getPw().equals(member.getPw())) {
				loginOk = true;
			}
		}
		return loginOk;
	}

	private boolean existId(String id) {
		int result = 0;
		boolean existOk = false;
		String sql = "select count(*) as count from member where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("count");
				System.out.println("ID카운트 결과"+result);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 1) {
			existOk = true;
		}
		return existOk;
	}

	public MemberBean findById(String findID) {
		String sql = "select * from member where id = ?";//read
		MemberBean temp = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, findID);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				temp = new MemberBean();
				temp.setId(rs.getString("ID"));
				temp.setPw(rs.getString("PW"));
				temp.setName(rs.getString("NAME"));
				temp.setPhone(rs.getString("PHONE"));
				temp.setAddress(rs.getString("ADDRESS"));
				temp.setRegion(rs.getString("REGION"));
				temp.setJob(rs.getString("JOB"));
				temp.setBirth(rs.getString("BIRTH"));
				temp.setGender(rs.getString("GENDER"));
				temp.setLicenceVal(rs.getString("LICENCE_VAL"));
				temp.setLicenceLocal(rs.getString("LICENCE_LOCAL"));
				temp.setLicenceEnd(rs.getString("LICENCE_END"));
				temp.setLicenceStart(rs.getString("LICENCE_START"));
				temp.setLicenceNum(rs.getString("LICENCE_NUM"));
				System.out.println("DAO에서 ID존재 체크 : "+temp.getId());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}

	public int leave(MemberBean member) {
		int result = 0;
		System.out.println(member.getId());
		System.out.println(member.getPw());
		String sql = "delete from member where id = ? and pw = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 1) {
			System.out.println("성공");
		}else{
			System.out.println("실패");
		}
		
		return result;
	}

	public List<MemberBean> list() {
		String sql = "select * from member";
		List<MemberBean> list = new ArrayList<MemberBean>();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberBean mem = new MemberBean();
				mem.setId(rs.getString("ID"));
				mem.setPw(rs.getString("PW"));
				mem.setName(rs.getString("NAME"));
				mem.setPhone(rs.getString("PHONE"));
				mem.setAddress(rs.getString("ADDRESS"));
				mem.setRegion(rs.getString("REGION"));
				mem.setJob(rs.getString("JOB"));
				mem.setBirth(rs.getString("BIRTH"));
				mem.setGender(rs.getString("GENDER"));
				mem.setLicenceVal(rs.getString("LICENCE_VAL"));
				mem.setLicenceLocal(rs.getString("LICENCE_LOCAL"));
				mem.setLicenceEnd(rs.getString("LICENCE_END"));
				mem.setLicenceStart(rs.getString("LICENCE_START"));
				mem.setLicenceNum(rs.getString("LICENCE_NUM"));
				list.add(mem);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}



	}


