package models;

public class GearBox {

	private long gearboxId;
	private int numberOfGears;
	private String typeOfGearbox;
	
	public GearBox(long gearboxId, int numberOfGears, String typeOfGearbox) {
		this.gearboxId = gearboxId;
		this.numberOfGears = numberOfGears;
		this.typeOfGearbox = typeOfGearbox;
	}

	public GearBox() {}

	public long getGearboxId() {
		return gearboxId;
	}

	public void setGearboxId(long gearboxId) {
		this.gearboxId = gearboxId;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}

	public String getTypeOfGearbox() {
		return typeOfGearbox;
	}

	public void setTypeOfGearbox(String typeOfGearbox) {
		this.typeOfGearbox = typeOfGearbox;
	}

	@Override
	public String toString() {
		return "GearBox [gearboxId=" + gearboxId + ", numberOfGears=" + numberOfGears + ", typeOfGearbox="
				+ typeOfGearbox + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (gearboxId ^ (gearboxId >>> 32));
		result = prime * result + numberOfGears;
		result = prime * result + ((typeOfGearbox == null) ? 0 : typeOfGearbox.hashCode());
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
		GearBox other = (GearBox) obj;
		if (gearboxId != other.gearboxId)
			return false;
		if (numberOfGears != other.numberOfGears)
			return false;
		if (typeOfGearbox == null) {
			if (other.typeOfGearbox != null)
				return false;
		} else if (!typeOfGearbox.equals(other.typeOfGearbox))
			return false;
		return true;
	};
	
	
}
