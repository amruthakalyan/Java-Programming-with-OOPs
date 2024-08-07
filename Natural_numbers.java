import java.util.Scanner;

public class Natural_numbers {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n value:");
            int n = sc.nextInt();
            int i = 1;
            while (i <=n) {
                System.out.print(i + " ");
                i++;
            }
        };
    }
}
