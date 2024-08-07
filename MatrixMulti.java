import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("Enter n:");
            n = sc.nextInt();
            int a[][] = new int[n][n];
            int b[][] = new int[n][n];
            int c[][] = new int[n][n];
            
            System.out.println("Enter array 1 elements:");
            for (int i = 0; i <n; i++) {
                for (int j = 0; j <n; j++) {
                    a[i][j] = sc.nextInt();

                }
            }
            System.out.println("Array 1 elements are:");
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println("\nEnter array 2 elements:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n; j++) {
                    b[i][j] = sc.nextInt();

                }
            }
            System.out.println("Array 2 elements are:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(b[i][j] + " ");
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < b.length; j++){
                    for(int k=0;k<n;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
                }
        }
        System.out.println();
        System.out.println("Matrix Multiplication:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(c[i][j] + " ");
            }
        }
        
    }
}
}