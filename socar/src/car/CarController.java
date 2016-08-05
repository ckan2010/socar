package car;

import javax.swing.JOptionPane;

public class CarController {
	public static void main(String[] args) {
		CarService service = CarServiceImpl.getInstance();
		while(true){
			switch (JOptionPane.showInputDialog("1 : 차 추가하기")) {
			case "1":
				CarBean car = new CarBean();
				car.setImg(JOptionPane.showInputDialog("이미지 파일 이름"));
				car.setModel(JOptionPane.showInputDialog("차량명"));
				car.setZone(JOptionPane.showInputDialog("쏘카존"));
				car.setOil(JOptionPane.showInputDialog("유종"));
				car.setOption(JOptionPane.showInputDialog("옵션"));
				car.setPayKm(JOptionPane.showInputDialog("주행요금 원/km"));
				service.addCar(car);
				break;

			default:
				break;
			}
		}
	}
}