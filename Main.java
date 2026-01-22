import java.util.Scanner;

class Main {
    int n;
    int sum = 0;

    public static void main(String[] args) {

        Main m = new Main();      
        Scanner s = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        m.n = s.nextInt();         

        System.out.println("You entered: " + m.n);
        s.close();
    }
}