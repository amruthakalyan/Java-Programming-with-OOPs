import java.util.Scanner;
public class Prime {
 public static void main(String[] args) {
   try( Scanner sc = new Scanner(System.in)){
      System.out.println("Enter a number:");
      int n = sc.nextInt();
      int count =0;
      for(int i=1;i<=n;i++){
        if(n%i==0){
            count+=1;
        }
      }
      if(count==2){
        System.out.println("Prime");
      }
      else{
        System.out.println("Not prime");
      }
   }
 }
}
