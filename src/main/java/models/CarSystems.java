package models;

public class CarSystems {

	private long carSystemsId;
	private long lightsId;
	private long heatingCoolingId;
	
	public CarSystems(long carSystemsId, long lightsId, long heatingCoolingId) {
		this.carSystemsId = carSystemsId;
		this.lightsId = lightsId;
		this.heatingCoolingId = heatingCoolingId;
	}

	public CarSystems() {}

	public long getCarSystemsId() {
		return carSystemsId;
	}

	public void setCarSystemsId(long carSystemsId) {
		this.carSystemsId = carSystemsId;
	}

	public long getLightsId() {
		return lightsId;
	}

	public void setLightsId(long lightsId) {
		this.lightsId = lightsId;
	}

	public long getHeatingCoolingId() {
		return heatingCoolingId;
	}

	public void setHeatingCoolingId(long heatingCoolingId) {
		this.heatingCoolingId = heatingCoolingId;
	}

	@Override
	public String toString() {
		return "CarSystems [carSystemsId=" + carSystemsId + ", lightsId=" + lightsId + ", heatingCoolingId="
				+ heatingCoolingId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carSystemsId ^ (carSystemsId >>> 32));
		result = prime * result + (int) (heatingCoolingId ^ (heatingCoolingId >>> 32));
		result = prime * result + (int) (lightsId ^ (lightsId >>> 32));
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
		CarSystems other = (CarSystems) obj;
		if (carSystemsId != other.carSystemsId)
			return false;
		if (heatingCoolingId != other.heatingCoolingId)
			return false;
		if (lightsId != other.lightsId)
			return false;
		return true;
	};
	
	
}
