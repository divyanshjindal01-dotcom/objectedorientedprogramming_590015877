import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("--- Compile-Time Polymorphism ---");
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("Do you want to add a third number? (yes/no): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter third number: ");
            int n3 = sc.nextInt();
            // Calls the method with 3 parameters
            System.out.println("Result: " + calc.add(n1, n2, n3));
        } else {
            // Calls the method with 2 parameters
            System.out.println("Result: " + calc.add(n1, n2));
        }
        sc.close();
    }
}