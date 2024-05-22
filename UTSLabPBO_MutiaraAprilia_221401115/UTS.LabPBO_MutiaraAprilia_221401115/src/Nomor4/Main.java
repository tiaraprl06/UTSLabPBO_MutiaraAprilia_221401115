package Nomor4;

import java.util.Scanner;

class Calculator {
    private double a, b, c, d;

    public Calculator(double a, double b) { // Constructor
        this.a = a;
        this.b = b;
    }

    public Calculator(double a, double b, double c) { // Constructor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) { // Overloading
        return a + b + c;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sin(double a) {
        return Math.sin(a);
    }

    public double cos(double a) {
        return Math.cos(a);
    }

    public double tan(double a) {
        return Math.tan(a);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double log(double a) {
        return Math.log(a);
    }

    public double exp(double a) {
        return Math.exp(a);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation (1-10):");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Sine");
        System.out.println("7. Cosine");
        System.out.println("8. Tangent");
        System.out.println("9. Square Root");
        System.out.println("10. Natural Logarithm");

        int choice = scanner.nextInt();

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        Calculator calculator = new Calculator(num1, num2);

        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + calculator.divide(num1, num2));
                break;
            case 5:
                System.out.println("Result: " + calculator.power(num1, num2));
                break;
            case 6:
                System.out.println("Result: " + calculator.sin(num1));
                break;
            case 7:
                System.out.println("Result: " + calculator.cos(num1));
                break;
            case 8:
                System.out.println("Result: " + calculator.tan(num1));
                break;
            case 9:
                System.out.println("Result: " + calculator.sqrt(num1));
                break;
            case 10:
                System.out.println("Result: " + calculator.log(num1));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
