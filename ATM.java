import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int amount = 10000;
            System.out.println("1.Withdraw\n 2.Deposit\n 3.Balance\n 4.Exit\n");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            int Useramount =0;
            while(true){
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    Useramount = sc.nextInt();
                    amount = amount - Useramount;
                    System.out.println("Successfully withdrawn amount " + Useramount);
                    break;
                case 2:
                    System.out.println("Enter amount to Deposit:");
                    Useramount = sc.nextInt();
                    amount = amount + Useramount;
                    System.out.println(amount);
                    break;
                case 3:
                    System.out.println("Available balance: ");
                    System.out.println(amount);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
            
                default:
                    System.out.println("Plz enter a valid input");
                    break;
            }

        }
    }
    }
    }

