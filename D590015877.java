import java.util.Scanner;

class D590015877 {
    public static void main(String[] args) {
        int sum, sum_array = 0;

        Scanner s = new Scanner(System.in);

        sum = s.nextInt();   // expected sum

        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
            sum_array += arr[i];
        }

        if (sum == sum_array) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        s.close();
    }
}
