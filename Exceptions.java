//Exception : An Exception is a problem that arises during the excution of the program.
//To handle exception ,we use 5 keywords:
//1.try 
// 2.catch
// 3.finally
// 4.thorw
// 5.throws

import java.util.Scanner;
public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter a nunber:");
        int n = sc.nextInt();
        System.out.println("You entered: "+n);
        }
        catch(Exception e){
           System.out.println("Invalid input:"+e);
        }
    }
}
