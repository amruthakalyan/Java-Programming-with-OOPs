import java.util.Scanner;
public class Count_vowels {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int count=0;
         System.out.println("Enter a string:");
         String s = sc.next().toLowerCase();
         int n = s.length();
         for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)== 'i'||s.charAt(i)=='o'|| s.charAt(i)=='u'){
                count++;
            }
         }
         System.out.println("No. of vowles are: "+count);
    }
}
