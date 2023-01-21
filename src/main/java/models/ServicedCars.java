package models;

public class ServicedCars {

	private long servicedCarsId;
	private long carServiceId;
	private long carsListId;
	private long price;
	
	public ServicedCars(long servicedCarsId, long carServiceId, long carsListId, long price) {
		this.servicedCarsId = servicedCarsId;
		this.carServiceId = carServiceId;
		this.carsListId = carsListId;
		this.price = price;
	}

	public ServicedCars() {}

	public long getServicedCarsId() {
		return servicedCarsId;
	}

	public void setServicedCarsId(long servicedCarsId) {
		this.servicedCarsId = servicedCarsId;
	}

	public long getCarServiceId() {
		return carServiceId;
	}

	public void setCarServiceId(long carServiceId) {
		this.carServiceId = carServiceId;
	}

	public long getCarsListId() {
		return carsListId;
	}

	public void setCarsListId(long carsListId) {
		this.carsListId = carsListId;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ServicedCars [servicedCarsId=" + servicedCarsId + ", carServiceId=" + carServiceId + ", carsListId="
				+ carsListId + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carServiceId ^ (carServiceId >>> 32));
		result = prime * result + (int) (carsListId ^ (carsListId >>> 32));
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + (int) (servicedCarsId ^ (servicedCarsId >>> 32));
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
		ServicedCars other = (ServicedCars) obj;
		if (carServiceId != other.carServiceId)
			return false;
		if (carsListId != other.carsListId)
			return false;
		if (price != other.price)
			return false;
		if (servicedCarsId != other.servicedCarsId)
			return false;
		return true;
	};
	
	
}
