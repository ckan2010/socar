package car;

import java.util.List;

public interface CarService {
	public void addCar(CarBean car);
	public List<CarBean> list();
	public List<CarBean> findBy(String model);
	public CarBean findBySeq(int seq);
}