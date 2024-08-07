import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
        System.out.print("Enter n:");
        int num = sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num + " X " + i +" = " + num*i);
            i++;
        }
    }
}
}
