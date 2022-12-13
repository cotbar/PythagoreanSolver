import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int showWork = 0;
        int redo = 0;
        double x = 0;
        double y = 0;
        double hypotenuse = 0;

        System.out.println("Welcome to the Pythagorean Equation Solver!");

        while (true) {
            System.out.println("Do you want to find the value of the hypotenuse or one of the sides?\n1. Hypotenuse\n2. Sides");
            input = scanner.nextInt();

            //If input is not either "hypotenuse" or "sides"
            if (input != 1 && input != 2) {
                System.out.println("Pick a valid option!");
                continue;
            }
            //Solving for Hypotenuse
            if (input == 1) {
                HypotenuseCalc.hypotenuseCalculations(x, y, hypotenuse, showWork, scanner);

            }
            //Solving for Sides
            else {

                SideCalc calculateSides = new SideCalc();
                calculateSides.calcSides(x, y, hypotenuse, showWork, scanner);
            }
            //Checks if user wants to continue with program
            System.out.println("\nThank you for using the Pythagorean Equation Solver!" +
                    "\nDo you want to solve another equation?\n1. Yes\n2. No");
            redo = scanner.nextInt();
            scanner.nextLine();
            if (redo != 1) {
                System.out.println("I hope this helped!");
                break;
            }
        }
    }
}