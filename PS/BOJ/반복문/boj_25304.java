import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice =  sc.nextInt();
        int totalNumber = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= totalNumber; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        } if (sum ==  totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
