
public class MiniVan extends Automobile {

	public MiniVan(int year, String make, String model, String color, String name, int numberOfGears) {
		super(year, make, model, color, name, numberOfGears);
	}

	@Override
	public void drive(int opCyl) {
		
		setOperatingCycle(opCyl);

		if (getCurrentGear() < getNumberOfGears()) {
			addGear();
		}
		currentSpeed();
		distanceTravel();
	}

}
