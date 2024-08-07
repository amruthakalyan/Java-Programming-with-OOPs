import java.util.Scanner;
//Bnary Search Logic
public class BinarySearch{
    int bsearch(int[] a , int low,int high, int x){
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
     BinarySearch bs = new BinarySearch();
     Scanner sc = new Scanner(System.in);
     int[] a =  {1,2,3,4,5,6};
     int key;
     System.out.println("Enter key Element:");
     key = sc.nextInt();
    int res = bs.bsearch(a, 0, a.length-1,key);
    if(res==-1){
        System.out.print("Element Not found");
    }
    else{
        System.out.print("Element found at index: "+ res);
    }
   
}
}
