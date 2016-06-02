
public class Automobile {

	private int year;
	private String make;
	private String model;
	private String color;
	private String name;
	private int numberOfGears;
	private int operatingCycle = 0;
	private int currentGear = 1;
	private int currentSpeed = 0;
	private int distance = 0;

	public Automobile(int year, String make, String model, String color, String name, int numberOfGears) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.name = name;
		this.numberOfGears = numberOfGears;
	}

	public void setOperatingCycle(int num) {
		operatingCycle = num;
	}

	public int getOperatingCycle() {
		return operatingCycle;
	}
	
	public void setNumberOfGears(int num) {
		numberOfGears = num;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void drive(int opCyl) {
		setOperatingCycle(opCyl);

		if (currentGear < numberOfGears) {
			currentGear++;
		}
		currentSpeed = currentSpeed();
		distance = distanceTravel();
	}

	public void setCurrentGear(int num) {
		currentGear = num;
	}
	
	public int getCurrentGear() {
		return currentGear;
	}
	
	public void addGear() {
		currentGear++;
	}

	public int currentSpeed() {
		currentSpeed = currentGear * 10;
		return currentSpeed;
	}

	public int distanceTravel() {
		return operatingCycle * (currentSpeed / 60);
	}

	public void displayAuto() {
		System.out.printf("Year: " + year + "\nMake: " + make + "\nModel: " + model + "\nColor: " + color + "\nName: "
				+ name + "\nGears: " + numberOfGears + "\n");
	}

	public String toString() {
		return String.format(
				"\nYear: %d Make: %s Model: %s Color: %s Name: %s Gears: %d  Current OpCycle: %d Current Gear: %d Current Speed: %d Distance: %s",
				year, make, model, color, name, numberOfGears, operatingCycle, currentGear, currentSpeed, distance);
	}

}
