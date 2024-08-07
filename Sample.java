import java.util.Scanner;
class Sample{
    public static void main(String[] args){
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter age:");
            int age = sc.nextInt();
           
           if(age < 18){
            System.out.print("Cannot vote\n");
           }
           else{
            System.out.print("Can vote\n");
           }
    }
      
    }
}