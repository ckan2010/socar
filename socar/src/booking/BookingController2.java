package booking;

import javax.swing.JOptionPane;

import car.CarBean;

public class BookingController2 {
	public static void main(String[] args) {
		BookingService service = BookingServiceImpl.getInstance();
		
		while(true){
			switch (JOptionPane.showInputDialog("1 : 모든 차량 보기, 2 : 차량 검색, 3 : 예약하기")) {
			case "1":
				JOptionPane.showMessageDialog(null, service.socarSearch());
				break;
				
			case "2" : 
				JOptionPane.showMessageDialog(null, service.findBySearch(JOptionPane.showInputDialog("검색할 차량 이름")));
				break; 
				
			case "3" :
				service.reserve(Integer.parseInt(JOptionPane.showInputDialog("대여할 차량 SEQ")), 
						Integer.parseInt(JOptionPane.showInputDialog("대여 시간")));
				break;
			case "4":
				System.out.println("case4");
				break;
				
			default:
				break;
			}
		}
	}
}