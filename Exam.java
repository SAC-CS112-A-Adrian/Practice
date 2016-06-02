import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numberOfDice;
		int operatingCycle;

		boolean again = true;

		Dice game = new Dice();

		while (again) {

			System.out.printf("Enter number of dice: ");
			numberOfDice = input.nextInt();

			int diceRolled = game.rollDice(numberOfDice);
			


			Automobile auto1 = new Automobile(2016, "Ford", "Truck", "white", "Trucky", 3);

			Automobile auto2 = new MiniVan(2016, "Toyota", "Van", "green", "Vany", 4);

			Automobile auto3 = new Automobile(2016, "Honda", "Sport Car", "red", "Sporty", 6);
			
/*
			int counter = 0;
			
			while (counter != diceRolled) {
				auto1.setOperatingCycle(diceRolled);
				auto1.setCurrentGear(3);

				auto2.setOperatingCycle(diceRolled);
				auto2.setCurrentGear(4);

				auto3.setOperatingCycle(diceRolled);
				auto3.setCurrentGear(5);
				counter++;
			}
			*/
			
			for (int i = 1; i <= diceRolled; i++)
			{
				System.out.println("Number of cycles:" + i);
				auto1.drive(i);
				auto2.drive(i);
				auto3.drive(i);
				
				System.out.println(auto1);
				System.out.println(auto2);
				System.out.println(auto3);
			}

			System.out.printf("\nEnter 1 to run again: ");
			int playAgain = input.nextInt();
			if (playAgain != 1)
				again = false;
		}

	}

}
