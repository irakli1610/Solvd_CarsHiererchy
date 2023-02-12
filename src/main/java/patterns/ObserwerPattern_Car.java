package patterns;

public class ObserwerPattern_Car {
	private String model;

	private ObserverPattern_TrafficLight currentTrafficLight;

	public ObserwerPattern_Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void update() {
		System.out.println(currentTrafficLight.getColour() + " is the current colour");
	}

	public void setCurrentTrafficLight(ObserverPattern_TrafficLight light) {
		currentTrafficLight = light;
	}

}
