package models;

public class ShopEmployee {
	
	private long shopEmployeeId;
	private int workingExperience;
	private int soldCars;
	private String position;
	private long carShopsId;
	private long personId;
	
	public ShopEmployee(long shopEmployeeId, int workingExperience, int soldCars, String position, long carShopsId,
			long personId) {
		this.shopEmployeeId = shopEmployeeId;
		this.workingExperience = workingExperience;
		this.soldCars = soldCars;
		this.position = position;
		this.carShopsId = carShopsId;
		this.personId = personId;
	}

	public ShopEmployee() {}

	public long getShopEmployeeId() {
		return shopEmployeeId;
	}

	public void setShopEmployeeId(long shopEmployeeId) {
		this.shopEmployeeId = shopEmployeeId;
	}

	public int getWorkingExperience() {
		return workingExperience;
	}

	public void setWorkingExperience(int workingExperience) {
		this.workingExperience = workingExperience;
	}

	public int getSoldCars() {
		return soldCars;
	}

	public void setSoldCars(int soldCars) {
		this.soldCars = soldCars;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public long getCarShopsId() {
		return carShopsId;
	}

	public void setCarShopsId(long carShopsId) {
		this.carShopsId = carShopsId;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "ShopEmployee [shopEmployeeId=" + shopEmployeeId + ", workingExperience=" + workingExperience
				+ ", soldCars=" + soldCars + ", position=" + position + ", carShopsId=" + carShopsId + ", personId="
				+ personId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carShopsId ^ (carShopsId >>> 32));
		result = prime * result + (int) (personId ^ (personId >>> 32));
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + (int) (shopEmployeeId ^ (shopEmployeeId >>> 32));
		result = prime * result + soldCars;
		result = prime * result + workingExperience;
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
		ShopEmployee other = (ShopEmployee) obj;
		if (carShopsId != other.carShopsId)
			return false;
		if (personId != other.personId)
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (shopEmployeeId != other.shopEmployeeId)
			return false;
		if (soldCars != other.soldCars)
			return false;
		if (workingExperience != other.workingExperience)
			return false;
		return true;
	};
	
	
	
}
