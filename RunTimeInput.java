import java.util.Scanner;

class Language {
    void greet() {
        System.out.println("Generic greeting!");
    }
}

class English extends Language {
    @Override
    void greet() {
        System.out.println("Hello!");
    }
}

class Spanish extends Language {
    @Override
    void greet() {
        System.out.println("¡Hola!");
    }
}

public class RunTimeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Language lang; 

        System.out.println("Choose a language: 1 for English, 2 for Spanish");
        int choice = sc.nextInt();

        if (choice == 1) {
            lang = new English(); 
        } else if (choice == 2) {
            lang = new Spanish(); 
        } else {
            lang = new Language();
        }

        System.out.print("The greeting is: ");
        lang.greet();
        
        sc.close();
    }
}