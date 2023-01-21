package models;

public class Lights {

	private long lightsId;
	private byte frontLights;
	private byte backLights;
	private byte turnLights;
	private byte stopLights;
	private byte fogLights;
	
	public Lights(long lightsId, byte frontLights, byte backLights, byte turnLights, byte stopLights, byte fogLights) {
		this.lightsId = lightsId;
		this.frontLights = frontLights;
		this.backLights = backLights;
		this.turnLights = turnLights;
		this.stopLights = stopLights;
		this.fogLights = fogLights;
	}

	public Lights() {}

	public long getLightsId() {
		return lightsId;
	}

	public void setLightsId(long lightsId) {
		this.lightsId = lightsId;
	}

	public byte getFrontLights() {
		return frontLights;
	}

	public void setFrontLights(byte frontLights) {
		this.frontLights = frontLights;
	}

	public byte getBackLights() {
		return backLights;
	}

	public void setBackLights(byte backLights) {
		this.backLights = backLights;
	}

	public byte getTurnLights() {
		return turnLights;
	}

	public void setTurnLights(byte turnLights) {
		this.turnLights = turnLights;
	}

	public byte getStopLights() {
		return stopLights;
	}

	public void setStopLights(byte stopLights) {
		this.stopLights = stopLights;
	}

	public byte getFogLights() {
		return fogLights;
	}

	public void setFogLights(byte fogLights) {
		this.fogLights = fogLights;
	}

	@Override
	public String toString() {
		return "Lights [lightsId=" + lightsId + ", frontLights=" + frontLights + ", backLights=" + backLights
				+ ", turnLights=" + turnLights + ", stopLights=" + stopLights + ", fogLights=" + fogLights + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + backLights;
		result = prime * result + fogLights;
		result = prime * result + frontLights;
		result = prime * result + (int) (lightsId ^ (lightsId >>> 32));
		result = prime * result + stopLights;
		result = prime * result + turnLights;
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
		Lights other = (Lights) obj;
		if (backLights != other.backLights)
			return false;
		if (fogLights != other.fogLights)
			return false;
		if (frontLights != other.frontLights)
			return false;
		if (lightsId != other.lightsId)
			return false;
		if (stopLights != other.stopLights)
			return false;
		if (turnLights != other.turnLights)
			return false;
		return true;
	};
	
	

}
