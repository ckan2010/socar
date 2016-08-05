package booking;

import java.util.List;

import car.CarBean;

public interface BookingService {
	public List<CarBean> socarSearch();
	public List<CarBean> findBySearch(String model);
	public CarBean findBySeq(int seq);
	public int reserve(int seq, int rentTime);
}