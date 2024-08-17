import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning)
        {
            System.out.println("Select an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exponentiation (^)");
            System.out.println("6. Modulus (%)");
            System.out.println("7. Square Root (√)");
            System.out.println("8. Sine (sin)");
            System.out.println("9. Cosine (cos)");
            System.out.println("10. Tangent (tan)");
            System.out.println("11. Quit");

            int choice = scanner.nextInt();
            double result = 0;

            switch (choice)
            {
                case 1:
                    System.out.println("Enter two numbers:");
                    double add1 = scanner.nextDouble();
                    double add2 = scanner.nextDouble();
                    result = add1 + add2;
                    break;
                case 2:
                    System.out.println("Enter two numbers:");
                    double sub1 = scanner.nextDouble();
                    double sub2 = scanner.nextDouble();
                    result = sub1 - sub2;
                    break;
                case 3:
                    System.out.println("Enter two numbers:");
                    double mul1 = scanner.nextDouble();
                    double mul2 = scanner.nextDouble();
                    result = mul1 * mul2;
                    break;
                case 4:
                    System.out.println("Enter two numbers:");
                    double div1 = scanner.nextDouble();
                    double div2 = scanner.nextDouble();
                    if (div2 != 0)
                    {
                        result = div1 / div2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    break;
                case 5:
                    System.out.println("Enter base and exponent:");
                    double base = scanner.nextDouble();
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
                    break;
                case 6:
                    System.out.println("Enter two numbers:");
                    double mod1 = scanner.nextDouble();
                    double mod2 = scanner.nextDouble();
                    result = mod1 % mod2;
                    break;
                case 7:
                    System.out.println("Enter a number:");
                    double sqrt = scanner.nextDouble();
                    if (sqrt >= 0) 
                    {
                        result = Math.sqrt(sqrt);
                    } 
                    else
                    {
                        System.out.println("Error! Square root of a negative number is not real.");
                        continue;
                    }
                    break;
                case 8:
                    System.out.println("Enter an angle in degrees:");
                    double angleSin = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angleSin));
                    break;
                case 9:
                    System.out.println("Enter an angle in degrees:");
                    double angleCos = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angleCos));
                    break;
                case 10:
                    System.out.println("Enter an angle in degrees:");
                    double angleTan = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(angleTan));
                    break;
                case 11:
                    keepRunning = false;
                    System.out.println("Goodbye!");
                    continue;
                default:
                    System.out.println("Invalid choice! Please select a valid operation.");
                    continue;
            }
            System.out.println("The result is: " + result);
        }
    }
}
