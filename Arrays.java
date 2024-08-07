import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enterr n:");
            int n = sc.nextInt();
            System.out.println("Enter array elements:");
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]+ " ");
        }
        int max=a[0],min=a[0];
        for(int i=0;i<a.length;i++){
           if(a[i]>max){
            max=a[i];
           }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
             min=a[i];
            }
         }
        System.out.println("\nmax:"+max);
        System.out.println("min:"+min);

 
    }
}

    public static void sort(int[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}
