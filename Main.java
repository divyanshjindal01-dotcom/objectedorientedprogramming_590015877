import java.util.Scanner;

class Employee {
    String name;
    int age;
    float salary;

    // Constructor with validation
    Employee(String name, int age, float salary) throws Exception {
        if (name.length() > 20) {
            throw new Exception("Name should not exceed 20 characters.");
        }
        if (age <= 5) {
            throw new Exception("Age must be greater than 5.");
        }
        if (salary <= 100000) {
            throw new Exception("Salary must be greater than 100000.");
        }

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = null;

        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter salary: ");
            float salary = sc.nextFloat();

            emp = new Employee(name, age, salary);
            emp.display();

            System.out.println("Data inserted successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Program finished.");
            sc.close();
        }
    }
}