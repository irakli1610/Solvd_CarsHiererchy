package models;

public class Engine {

	private long engineId;
	private String name;
	private int horsepower;
	private int consumption;
	
	public Engine(long engineId, String name, int horsepower, int consumption) {
		this.engineId = engineId;
		this.name = name;
		this.horsepower = horsepower;
		this.consumption = consumption;
	}

	public Engine() {}

	public long getEngineId() {
		return engineId;
	}

	public void setEngineId(long engineId) {
		this.engineId = engineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getConsumption() {
		return consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", name=" + name + ", horsepower=" + horsepower + ", consumption="
				+ consumption + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + consumption;
		result = prime * result + (int) (engineId ^ (engineId >>> 32));
		result = prime * result + horsepower;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Engine other = (Engine) obj;
		if (consumption != other.consumption)
			return false;
		if (engineId != other.engineId)
			return false;
		if (horsepower != other.horsepower)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	};
	
	
}
