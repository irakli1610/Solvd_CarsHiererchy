package models;

public class CarOwner {

	private long carOwnerId;
	private String numberOfCars;
	private long personId;
	
	
	public CarOwner(long carOwnerId, String numberOfCars, long personId) {
		this.carOwnerId = carOwnerId;
		this.numberOfCars = numberOfCars;
		this.personId = personId;
	}


	public CarOwner() {
	}


	public long getCarOwnerId() {
		return carOwnerId;
	}


	public void setCarOwnerId(long carOwnerId) {
		this.carOwnerId = carOwnerId;
	}


	public String getNumberOfCars() {
		return numberOfCars;
	}


	public void setNumberOfCars(String numberOfCars) {
		this.numberOfCars = numberOfCars;
	}


	public long getPersonId() {
		return personId;
	}


	public void setPersonId(long personId) {
		this.personId = personId;
	}


	@Override
	public String toString() {
		return "CarOwner [carOwnerId=" + carOwnerId + ", numberOfCars=" + numberOfCars + ", personId=" + personId + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carOwnerId ^ (carOwnerId >>> 32));
		result = prime * result + ((numberOfCars == null) ? 0 : numberOfCars.hashCode());
		result = prime * result + (int) (personId ^ (personId >>> 32));
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
		CarOwner other = (CarOwner) obj;
		if (carOwnerId != other.carOwnerId)
			return false;
		if (numberOfCars == null) {
			if (other.numberOfCars != null)
				return false;
		} else if (!numberOfCars.equals(other.numberOfCars))
			return false;
		if (personId != other.personId)
			return false;
		return true;
	}
	
	
	
}
