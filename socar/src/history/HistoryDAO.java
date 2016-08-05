package history;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import car.CarBean;
import global.Constants;
import global.DatabaseFactory;
import global.Vendor;
import member.MemberService;
import member.MemberServiceImpl;

public class HistoryDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	private static HistoryDAO instance = new HistoryDAO();
	MemberService memTemp = MemberServiceImpl.getInstance();
	public static HistoryDAO getInstance() {
		return instance;
	}

	private HistoryDAO() {
		con = DatabaseFactory.createDatabase(
				Vendor.ORACLE, 
				Constants.USER_ID, 
				Constants.USER_PW).getConnection();
	}
	
	public int insert(CarBean car, int price) {
		int result = 0;
		String sql = "insert into history (hist_seq, rent_date, rent_zone, car_model, pay_km, car_image, id)"
				+ "values (hist_seq.nextval, ?, ?, ?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
			pstmt.setString(2, car.getZone());
			pstmt.setString(3, car.getModel());
			pstmt.setInt(4, price);
			pstmt.setString(5, car.getImg());
			pstmt.setString(6, memTemp.getSession().getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<HistoryBean> list(){
		
		String sql = "select * from history where id = ?";	//member의 세션이 필요
		List<HistoryBean> list = new ArrayList<HistoryBean>();
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memTemp.getSession().getId());
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				HistoryBean temp = new HistoryBean();
				temp.setRentDate(rs.getString("RENT_DATE"));
				temp.setRentZone(rs.getString("RENT_ZONE"));
				temp.setCarModel(rs.getString("CAR_MODEL"));
				temp.setImg(rs.getString("CAR_IMAGE"));
				temp.setPayKm(rs.getInt("PAY_KM"));
				list.add(temp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}