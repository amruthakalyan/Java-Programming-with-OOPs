import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        // int flag =0;
        System.out.println("Enter s String:");
        s = sc.next();
        int n = s.length();
        for (int i = 0, j = n - 1; i <= j; i++, j--) {

            if (s.charAt(i) == s.charAt(j)) {
                System.out.println(s + " is Palindrome");
                break;
            } else {
                System.out.println(s + " is Not palindrome");
                break;
            }

        }
    }
}
