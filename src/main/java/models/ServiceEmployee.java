package models;

public class ServiceEmployee {

	private long serviceEmployeeId;
	private int workingExperience;
	private int servicedCars;
	private String position;
	private long personId;
	private long carServiceId;
	
	public ServiceEmployee(long serviceEmployeeId, int workingExperience, int servicedCars, String position,
			long personId, long carServiceId) {
		this.serviceEmployeeId = serviceEmployeeId;
		this.workingExperience = workingExperience;
		this.servicedCars = servicedCars;
		this.position = position;
		this.personId = personId;
		this.carServiceId = carServiceId;
	}

	public ServiceEmployee() {}

	public long getServiceEmployeeId() {
		return serviceEmployeeId;
	}

	public void setServiceEmployeeId(long serviceEmployeeId) {
		this.serviceEmployeeId = serviceEmployeeId;
	}

	public int getWorkingExperience() {
		return workingExperience;
	}

	public void setWorkingExperience(int workingExperience) {
		this.workingExperience = workingExperience;
	}

	public int getServicedCars() {
		return servicedCars;
	}

	public void setServicedCars(int servicedCars) {
		this.servicedCars = servicedCars;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public long getCarServiceId() {
		return carServiceId;
	}

	public void setCarServiceId(long carServiceId) {
		this.carServiceId = carServiceId;
	}

	@Override
	public String toString() {
		return "ServiceEmployee [serviceEmployeeId=" + serviceEmployeeId + ", workingExperience=" + workingExperience
				+ ", servicedCars=" + servicedCars + ", position=" + position + ", personId=" + personId
				+ ", carServiceId=" + carServiceId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carServiceId ^ (carServiceId >>> 32));
		result = prime * result + (int) (personId ^ (personId >>> 32));
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + (int) (serviceEmployeeId ^ (serviceEmployeeId >>> 32));
		result = prime * result + servicedCars;
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
		ServiceEmployee other = (ServiceEmployee) obj;
		if (carServiceId != other.carServiceId)
			return false;
		if (personId != other.personId)
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (serviceEmployeeId != other.serviceEmployeeId)
			return false;
		if (servicedCars != other.servicedCars)
			return false;
		if (workingExperience != other.workingExperience)
			return false;
		return true;
	};
	
	
}
