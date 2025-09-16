import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B >= 45) {
            System.out.println(A + " " + (B - 45));
        } else if (A == 0 && B < 45) {
            System.out.println(23 + " " + (B + 15));
        } else {
            System.out.println((A - 1) + " " + (B + 15));
        }

        sc.close();
    }
}
