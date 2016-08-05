package booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import car.CarBean;
import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

public class BookingDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	private static BookingDAO instance = new BookingDAO();
	
	public static BookingDAO getInstance() {
		return instance;
	}

	private BookingDAO() {
		con = DatabaseFactory.createDatabase(
			Vendor.ORACLE,
			Constants.USER_ID,
			Constants.USER_PW).getConnection();
	}

	public List<CarBean> findByModel(String model) {
		List<CarBean> list = new ArrayList<CarBean>();
		String sql = "select * from car where car_model = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, model);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				CarBean car = new CarBean();
				car.setImg(rs.getString("CAR_IMAGE"));
				car.setModel(rs.getString("CAR_MODEL"));
				car.setOil(rs.getString("CAR_OIL"));
				car.setOption(rs.getString("CAR_OPTION"));
				car.setPayKm(rs.getString("PAY_KM"));
				car.setZone(rs.getString("CAR_ZONE"));
				list.add(car);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public CarBean findBySeq(int seq) {
		CarBean car = null;
		String sql = "select * from car where car_seq = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				car = new CarBean();
				car.setImg(rs.getString("CAR_IMAGE"));
				car.setModel(rs.getString("CAR_MODEL"));
				car.setOil(rs.getString("CAR_OIL"));
				car.setOption(rs.getString("CAR_OPTION"));
				car.setPayKm(rs.getString("PAY_KM"));
				car.setZone(rs.getString("CAR_ZONE"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}
}