package ca.lab3;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator App!");
        System.out.println("----------------------------");

        // Example calculations
        int a = 10;
        int b = 5;

        System.out.println(a + " + " + b + " = " + calculator.add(a, b));
        System.out.println(a + " - " + b + " = " + calculator.subtract(a, b));
        System.out.println(a + " * " + b + " = " + calculator.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculator.divide(a, b));
    }
}