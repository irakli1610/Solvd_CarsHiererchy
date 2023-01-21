package models;

public class HeatingCooling {

	private long heatingCoolingId;
	private byte steeringWheelHeating;
	private byte seatsHeating;
	private byte interierHeating;
	private byte interierCooling;
	
	public HeatingCooling(long heatingCoolingId, byte steeringWheelHeating, byte seatsHeating, byte interierHeating,
			byte interierCooling) {
		this.heatingCoolingId = heatingCoolingId;
		this.steeringWheelHeating = steeringWheelHeating;
		this.seatsHeating = seatsHeating;
		this.interierHeating = interierHeating;
		this.interierCooling = interierCooling;
	}

	public HeatingCooling() {}

	public long getHeatingCoolingId() {
		return heatingCoolingId;
	}

	public void setHeatingCoolingId(long heatingCoolingId) {
		this.heatingCoolingId = heatingCoolingId;
	}

	public byte getSteeringWheelHeating() {
		return steeringWheelHeating;
	}

	public void setSteeringWheelHeating(byte steeringWheelHeating) {
		this.steeringWheelHeating = steeringWheelHeating;
	}

	public byte getSeatsHeating() {
		return seatsHeating;
	}

	public void setSeatsHeating(byte seatsHeating) {
		this.seatsHeating = seatsHeating;
	}

	public byte getInterierHeating() {
		return interierHeating;
	}

	public void setInterierHeating(byte interierHeating) {
		this.interierHeating = interierHeating;
	}

	public byte getInterierCooling() {
		return interierCooling;
	}

	public void setInterierCooling(byte interierCooling) {
		this.interierCooling = interierCooling;
	}

	@Override
	public String toString() {
		return "HeatingCooling [heatingCoolingId=" + heatingCoolingId + ", steeringWheelHeating=" + steeringWheelHeating
				+ ", seatsHeating=" + seatsHeating + ", interierHeating=" + interierHeating + ", interierCooling="
				+ interierCooling + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (heatingCoolingId ^ (heatingCoolingId >>> 32));
		result = prime * result + interierCooling;
		result = prime * result + interierHeating;
		result = prime * result + seatsHeating;
		result = prime * result + steeringWheelHeating;
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
		HeatingCooling other = (HeatingCooling) obj;
		if (heatingCoolingId != other.heatingCoolingId)
			return false;
		if (interierCooling != other.interierCooling)
			return false;
		if (interierHeating != other.interierHeating)
			return false;
		if (seatsHeating != other.seatsHeating)
			return false;
		if (steeringWheelHeating != other.steeringWheelHeating)
			return false;
		return true;
	};
	
	
}
