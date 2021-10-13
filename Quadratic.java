import java.util.Scanner;

public class Quadratic {
    public static void main(String args[]) {
        //create a Scanner for keyboard entry and double variables for the coefficients
        Scanner keyboard = new Scanner(System.in);
        double a,b,c;

        //prompt the user for the coefficients of the equation
        System.out.println("Enter the coefficients of the quadratic equation (a,b,c):");
        System.out.println("a:");
        a = keyboard.nextDouble();
        System.out.println("b:");
        b = keyboard.nextDouble();
        System.out.println("c:");
        c = keyboard.nextDouble();
        //print the equation
        System.out.println("Equation: " + a+"x^2 + "+b+"x + "+c+" = 0");

        //compute the discriminant: b^2-4ac
        double discriminant = Math.pow(b, 2)-4 * a * c;
        System.out.printf("Discriminant is %.3f\n", discriminant);

        //calculate and print the real-number roots, rounded to 3 decimal places, if the discriminant is non-negative.
        if (discriminant < 0)
            System.out.println("The roots are complex numbers.");
           else {
            System.out.println("The roots are real numbers:");
            double quadraticFormulaPositive = (-b + Math.sqrt(discriminant)) / (2 * a);
            double quadraticFormulaNegative = (-b - Math.sqrt(discriminant)) / (2 * a);
            double smaller = Math.min(quadraticFormulaNegative, quadraticFormulaPositive);
            double larger = Math.max(quadraticFormulaNegative, quadraticFormulaPositive);
            System.out.printf("x = %.3f\n", smaller);
            System.out.printf("x = %.3f\n", larger);
        }
        //otherwise print a message that the roots are complex.


    }
} //end Quadratic
