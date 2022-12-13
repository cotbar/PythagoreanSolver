import java.util.Scanner;

public class SideCalc {
    public void calcSides(double x, double y, double hypotenuse, int showWork, Scanner sc) {

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
            hypotenuse = sc.nextDouble();
            sc.nextLine();

            if (hypotenuse < 0) {
                System.out.println("Length cannot be negative! Please input a positive number.");
            }
        } while(hypotenuse < 0);


        double squareRoot = Math.sqrt((hypotenuse * hypotenuse) - (x * x));
        y = squareRoot;

        if (Double.isNaN(y)) {
            System.out.println("There is no real solution!");
            y = Math.sqrt(Math.abs((hypotenuse * hypotenuse) - (x * x)));
            System.out.println(String.format("Imaginary solution is: %.1fi",y));
        } else {
            //displays the work, not necessary at all
            System.out.println("Would you like to see the work for the equation? (yes or no)");
            showWork = sc.nextInt();
            sc.nextLine();
            //Checks to see if user wants to see work for equation
            if (showWork == 1) {
                System.out.println("x squared = " + x * x);
                System.out.println("the hypotenuse squared = " + hypotenuse * hypotenuse);
                System.out.println("the hypotenuse squared - x squared = " + (hypotenuse * hypotenuse - x * x));
                System.out.println("The square root of the hypotenuse squared - x squared is: " + squareRoot + "\n");
            }

            System.out.println("The value of the second side, y, is: " + y);
        }
    }

}
