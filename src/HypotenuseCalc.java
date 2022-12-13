import java.util.Scanner;

public class HypotenuseCalc {
    public static void hypotenuseCalculations(double x, double y, double hypotenuse, int showWork, Scanner sc) {

        do {
            System.out.println("Enter the value of x: ");
            x = sc.nextDouble();
            sc.nextLine();

            if (x < 0) {
                System.out.println("Length cannot be negative! Please input a positive number.");
            }
        } while (x < 0);
        do {
            System.out.println("Enter the value of the hypotenuse: ");
            y = sc.nextDouble();
            sc.nextLine();

            if (y < 0) {
                System.out.println("Length cannot be negative! Please input a positive number.");
            }
        } while(y < 0);

        double squareRoot = Math.sqrt((x * x) + (y * y));
        hypotenuse = squareRoot;

        //displays the work, not necessary just cool
        System.out.println("Would you like to see the work for the equation? \n1. Yes\n2. No");
        showWork = sc.nextInt();
        sc.nextLine();

        //checks to see if user wants to see work of equation
        if (showWork == 1) {
            System.out.println("x^2 is = " + x * x);
            System.out.println("y^2 is = " + y * y);
            System.out.println("x^2 + y^2 = " + x * x + y * y);
            System.out.println("The square root of x^2 + y^2 is: " + squareRoot + "\n");
        }
        System.out.println("The value of the hypotenuse is: " + hypotenuse);

    }
}
