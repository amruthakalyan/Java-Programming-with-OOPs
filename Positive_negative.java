import java.util.Scanner;
public class Positive_negative {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            if(num >0){
                System.out.println("Positive");
            }
            else if(num == 0){
                System.out.println("Zero");
            }
            else{
                System.out.println("Negative");
            }
        }
    }
}
