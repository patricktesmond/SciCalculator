import java.util.Scanner;
import java.lang.Math;

public class SciCalculator
{
    public static void main(String[] args)
    {
        double firstNumb = 0.0; //NEW COMMENT
        double secondNumb = 0.0;
        double result = 0.0;
        int menuOption=15;
        int error=0;
        String operandResult = "";
        int numbCalcs = 0;
        double totalCalc = 0.0;
        Scanner scanner = new Scanner(System.in);

        while(menuOption != 0)
        {
            if(error==0)
            {
                totalCalc += result;

                System.out.println("Current Result: " + result);
                System.out.println();
                displayMenu();
            }
            menuOption = scanner.nextInt();

            error=0;
            if (menuOption == 1) // This is for addition
            {
                System.out.print("Enter first operand: ");
                firstNumb = scanner.nextDouble();
                System.out.print("Enter second operand: ");
                secondNumb = scanner.nextDouble();
                result = firstNumb + secondNumb;
                System.out.println();
                numbCalcs++;
            }
            else if (menuOption == 2)// This is for subtraction
            {
                System.out.print("Enter first operand: ");
                firstNumb = scanner.nextDouble();
                System.out.print("Enter second operand: ");
                secondNumb = scanner.nextDouble();
                result = firstNumb - secondNumb;
                System.out.println();
                numbCalcs++;
            }
            else if (menuOption == 3) // This is for Multiplication
            {
                System.out.print("Enter first operand: ");
                firstNumb = scanner.nextDouble();
                System.out.print("Enter second operand: ");
                secondNumb = scanner.nextDouble();
                result = firstNumb * secondNumb;
                System.out.println();
                numbCalcs++;
            }
            else if (menuOption == 4) //This is for division
            {
                System.out.print("Enter first operand: ");
                firstNumb = scanner.nextDouble();
                System.out.print("Enter second operand: ");
                secondNumb = scanner.nextDouble();
                result = firstNumb / secondNumb;
                System.out.println();
                numbCalcs++;
            }
            else if (menuOption == 5) //This is for Exponents
            {
                System.out.print("Enter first operand: ");
                firstNumb = scanner.nextDouble();
                System.out.print("Enter second operand: ");
                secondNumb = scanner.nextDouble();
                result = Math.pow(firstNumb, secondNumb);
                System.out.println();
                numbCalcs++;
            }
            else if (menuOption == 6) // This is for Logs
            {
                System.out.print("Enter first operand: ");
                firstNumb = scanner.nextDouble();
                System.out.print("Enter second operand: ");
                secondNumb = scanner.nextDouble();
                result = (Math.log(secondNumb)/Math.log(firstNumb));
                System.out.println();
                numbCalcs++;
            }
            else if (menuOption == 7) // This is for Average
            {
                System.out.println();
                if (numbCalcs == 0)
                {
                    System.out.println("Error: No calculations yet to average!");
                }
                else
                {
                    System.out.println("Sum of calculations: " + totalCalc);
                    System.out.println("Number of calculations: " + numbCalcs);
                    System.out.println("Average of calculations: " + Math.round(((totalCalc / (double)numbCalcs) * 100)) / 100.00);
                }
                error = 1;
                System.out.println();
                System.out.print("Enter Menu Selection: ");
            }
            else if (menuOption == 0) // This is for quitting
            {
                System.out.print("Thanks for using this calculator. Goodbye!");
                break;
            }
            else // This is if the user is dumb
            {
                System.out.println("Error: Invalid selection!");
                System.out.println();
                error=1;
                System.out.print("Enter Menu Selection: ");


            }
        }

    }

    public static void displayMenu() // Method to display the menu
    {
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println();
        System.out.print("Enter Menu Selection: ");
    }
}
