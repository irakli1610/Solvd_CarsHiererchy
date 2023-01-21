package models;

public class Tires {

	private long tireId;
	private int numberOfTires;
	private int tireSize;
	private String tireBrand;
	
	public Tires(long tireId, int numberOfTires, int tireSize, String tireBrand) {
		this.tireId = tireId;
		this.numberOfTires = numberOfTires;
		this.tireSize = tireSize;
		this.tireBrand = tireBrand;
	}

	public Tires() {}

	public long getTireId() {
		return tireId;
	}

	public void setTireId(long tireId) {
		this.tireId = tireId;
	}

	public int getNumberOfTires() {
		return numberOfTires;
	}

	public void setNumberOfTires(int numberOfTires) {
		this.numberOfTires = numberOfTires;
	}

	public int getTireSize() {
		return tireSize;
	}

	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}

	public String getTireBrand() {
		return tireBrand;
	}

	public void setTireBrand(String tireBrand) {
		this.tireBrand = tireBrand;
	}

	@Override
	public String toString() {
		return "Tires [tireId=" + tireId + ", numberOfTires=" + numberOfTires + ", tireSize=" + tireSize
				+ ", tireBrand=" + tireBrand + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfTires;
		result = prime * result + ((tireBrand == null) ? 0 : tireBrand.hashCode());
		result = prime * result + (int) (tireId ^ (tireId >>> 32));
		result = prime * result + tireSize;
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
		Tires other = (Tires) obj;
		if (numberOfTires != other.numberOfTires)
			return false;
		if (tireBrand == null) {
			if (other.tireBrand != null)
				return false;
		} else if (!tireBrand.equals(other.tireBrand))
			return false;
		if (tireId != other.tireId)
			return false;
		if (tireSize != other.tireSize)
			return false;
		return true;
	};
	
	
}
