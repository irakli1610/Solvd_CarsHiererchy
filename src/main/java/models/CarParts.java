package models;

public class CarParts {

	private long carPartsId;
	private long engineId;
	private long gearboxId;
	private long tireId;
	
	public CarParts(long carPartsId, long engineId, long gearboxId, long tireId) {
		this.carPartsId = carPartsId;
		this.engineId = engineId;
		this.gearboxId = gearboxId;
		this.tireId = tireId;
	}

	public CarParts() {}

	public long getCarPartsId() {
		return carPartsId;
	}

	public long getEngineId() {
		return engineId;
	}

	public long getGearboxId() {
		return gearboxId;
	}

	public long getTireId() {
		return tireId;
	}

	@Override
	public String toString() {
		return "CarParts [carPartsId=" + carPartsId + ", engineId=" + engineId + ", gearboxId=" + gearboxId
				+ ", tireId=" + tireId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carPartsId ^ (carPartsId >>> 32));
		result = prime * result + (int) (engineId ^ (engineId >>> 32));
		result = prime * result + (int) (gearboxId ^ (gearboxId >>> 32));
		result = prime * result + (int) (tireId ^ (tireId >>> 32));
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
		CarParts other = (CarParts) obj;
		if (carPartsId != other.carPartsId)
			return false;
		if (engineId != other.engineId)
			return false;
		if (gearboxId != other.gearboxId)
			return false;
		if (tireId != other.tireId)
			return false;
		return true;
	};
	
}
