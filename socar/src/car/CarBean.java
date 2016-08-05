package car;

public class CarBean {
	private String zone, model, payKm, oil, option, img;
	private int seq;
	
	

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPayKm() {
		return payKm;
	}

	public void setPayKm(String payKm) {
		this.payKm = payKm;
	}

	public String getOil() {
		return oil;
	}

	public void setOil(String oil) {
		this.oil = oil;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "seq=" + seq + ", zone=" + zone + ", model=" + model + ", payKm=" + payKm + ", oil=" + oil + ", option=" + option
				+ ", img=" + img + "\n";
	}
}