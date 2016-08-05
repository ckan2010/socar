package history;

import java.util.List;

import car.CarBean;

public interface HistoryService {
	public int addReserve(CarBean car, int rentTime);
	public List<HistoryBean> list();
}