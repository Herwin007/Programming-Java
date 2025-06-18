import java.util.Scanner;

public class calculator {
     public static void main(String[] args) {
        double num1, num2;
        char operator;
        double result = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
}
}
