import java.util.Scanner;
public class righttriangle {
 public static void main(String[] args) {
   try( Scanner sc = new Scanner(System.in)){
    System.out.println("Right Trianlge:");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.println(" ");
     }
     System.out.println("Inverted Right Trianlge:");
     for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.println(" ");
     }
   }
}
}