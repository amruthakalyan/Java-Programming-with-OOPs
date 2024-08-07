import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int i;
        int fact =1;
        for(i=1;i<=n;i++){
               fact *= i;
        }
        System.out.println("Factorial of "+ n+ " is "+ fact);
        }
    }
}
