public class DuplicateElement {
    public static void main(String[] args) {
        int[] a = {2,8,7,1,9,1,2,2,5,8,0};
        int n = a.length;
        int i=0;
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(a[i]==a[j]){
                System.out.println("Array contains duplicate elements..");
             
            }
            break;
      }
    }
}
}
