import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number:");
            int num =sc.nextInt();
            if(num%2==0){
                System.out.println("Even");
               }
               else{
                System.out.print("Odd");
               }
        }
    }
}
