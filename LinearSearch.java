import java.util.Scanner;
public class LinearSearch {
//Linear Search Logic
int LSearch(int[] a,int key){
    int i;
    int n = a.length;
    for(i=0;i<n;i++){
        if(a[i]==key){
           return i;
    }
}
return -1;
}
public static void main(String[] args) {
    int[] a = {1,4,2,5,6,8};
    int key;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter key Element:");
    key = sc.nextInt();
    LinearSearch ls = new LinearSearch();
    int res = ls.LSearch(a, key);
    if(res==-1){
        System.out.print("Element Not found");
    }
    else{
        System.out.print("Element found at index: "+res);
    }
}
}
