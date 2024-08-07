import java.util.Scanner;
public class Fibinocci {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter n:");
            int n = sc.nextInt();
           int a=0,b=1,c=0;
           System.out.println(0);
           do{
               a=b;
               b=c;
               c= a+b;
               System.out.println(c+ " ");
           }
           while(c<=n);
        
        }
    }
}
