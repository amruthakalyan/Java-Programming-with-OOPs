import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter size:");
            int n =  sc.nextInt();
            System.out.println("Enter arrau elements:");
            int a[]= new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Array elements are:");
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]+ " ");
        }
        System.out.println();
        int temp;
        for(int i=0;i<n;i++){
           for(int j=0;j<n-1;j++){
            if(a[j]<a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
        System.out.println("Ascending order Sorted:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
         }
         System.out.println("\nDecending order Sorted:");
         for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
             if(a[j]>a[j+1]){
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
             }
         }
     }
     for(int i=0;i<a.length;i++){
        System.out.print(a[i]+ " ");
     }
        }
    }
}
