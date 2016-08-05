package car;

import java.util.List;

public class CarServiceImpl implements CarService {
	private static CarService instance = new CarServiceImpl();
	CarDAO dao = CarDAO.getInstnace();
	
	public static CarService getInstance() {
		return instance;
	}

	private CarServiceImpl() {
	}

	@Override
	public void addCar(CarBean car) {
		dao.insert(car);
	}

//	@Override
//	public List<CarBean> list() {
//		return dao.list();
//	}

	@Override
	public List<CarBean> findBy(String model) {
		return dao.findBy(model);
	}
	
	public List<CarBean> list(){
		return dao.list();
	}

	@Override
	public CarBean findBySeq(int seq) {
		return dao.findBySeq(seq);
	}
}