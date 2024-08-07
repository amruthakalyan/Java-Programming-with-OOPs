import java.util.Scanner;
public class first{
    public static void main(String args[]){
        System.out.println("Hello world");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            System.out.println("You Entered:"+ n);
        }
    }
}