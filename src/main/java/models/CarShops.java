package models;

public class CarShops {

	private long carShopsId;
	private String carShopName;
	private int soldCarsNumber;
	
	public CarShops(long carShopsId, String carShopName, int soldCarsNumber) {
		this.carShopsId = carShopsId;
		this.carShopName = carShopName;
		this.soldCarsNumber = soldCarsNumber;
	}

	public CarShops() {}

	public long getCarShopsId() {
		return carShopsId;
	}

	public void setCarShopsId(long carShopsId) {
		this.carShopsId = carShopsId;
	}

	public String getCarShopName() {
		return carShopName;
	}

	public void setCarShopName(String carShopName) {
		this.carShopName = carShopName;
	}

	public int getSoldCarsNumber() {
		return soldCarsNumber;
	}

	public void setSoldCarsNumber(int soldCarsNumber) {
		this.soldCarsNumber = soldCarsNumber;
	}

	@Override
	public String toString() {
		return "CarShops [carShopsId=" + carShopsId + ", carShopName=" + carShopName + ", soldCarsNumber="
				+ soldCarsNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carShopName == null) ? 0 : carShopName.hashCode());
		result = prime * result + (int) (carShopsId ^ (carShopsId >>> 32));
		result = prime * result + soldCarsNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarShops other = (CarShops) obj;
		if (carShopName == null) {
			if (other.carShopName != null)
				return false;
		} else if (!carShopName.equals(other.carShopName))
			return false;
		if (carShopsId != other.carShopsId)
			return false;
		if (soldCarsNumber != other.soldCarsNumber)
			return false;
		return true;
	};
	
	
}
