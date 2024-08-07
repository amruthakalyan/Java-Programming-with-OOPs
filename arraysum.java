import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enterr n:");
            int n = sc.nextInt();
            System.out.println("Enter array elements:");
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            System.out.println("Sum:" + sum);

        }
    }
}