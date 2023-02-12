package patterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern_TrafficLight {
	private List<ObserwerPattern_Car> cars = new ArrayList<>();
	private String colour;

	public ObserverPattern_TrafficLight() {
	}
	public void addCar(ObserwerPattern_Car car) {
		cars.add(car);
	}

	public void removeCar(ObserwerPattern_Car car) {
		cars.remove(car);
	}

	public void notifyCars() {
		for (ObserwerPattern_Car car : cars) {
			car.update();
		}
	}

	public void updateColour(String colour) {
		this.colour = colour;
		notifyCars();
	}

	public String getColour() {
		return colour;
	}


}
