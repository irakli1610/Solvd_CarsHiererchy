package models;

public class CarServices {

	private long carServiceId;
	private String carServiceName;
	
	public CarServices() {}

	public CarServices(long carServiceId, String carServiceName) {
		this.carServiceId = carServiceId;
		this.carServiceName = carServiceName;
	}

	public long getCarServiceId() {
		return carServiceId;
	}

	public void setCarServiceId(long carServiceId) {
		this.carServiceId = carServiceId;
	}

	public String getCarServiceName() {
		return carServiceName;
	}

	public void setCarServiceName(String carServiceName) {
		this.carServiceName = carServiceName;
	}

	@Override
	public String toString() {
		return "CarServices [carServiceId=" + carServiceId + ", carServiceName=" + carServiceName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carServiceId ^ (carServiceId >>> 32));
		result = prime * result + ((carServiceName == null) ? 0 : carServiceName.hashCode());
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
		CarServices other = (CarServices) obj;
		if (carServiceId != other.carServiceId)
			return false;
		if (carServiceName == null) {
			if (other.carServiceName != null)
				return false;
		} else if (!carServiceName.equals(other.carServiceName))
			return false;
		return true;
	};
	
	
}
