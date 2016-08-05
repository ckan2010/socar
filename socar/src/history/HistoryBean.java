package history;

public class HistoryBean {
	private String rentDate, rentZone, carModel, img;
	private int payKm;

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public String getRentZone() {
		return rentZone;
	}

	public void setRentZone(String rentZone) {
		this.rentZone = rentZone;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getPayKm() {
		return payKm;
	}

	public void setPayKm(int payKm) {
		this.payKm = payKm;
	}

	@Override
	public String toString() {
		return "HistoryBean [rentDate=" + rentDate + ", rentZone=" + rentZone + ", carModel=" + carModel + ", img="
				+ img + ", payKm=" + payKm + "]";
	}
}