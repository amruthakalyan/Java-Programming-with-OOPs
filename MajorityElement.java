public class MajorityElement {
    public static void main(String[] args) {
        int[] a ={1,4,7,9,6,6,6,6,9,9};
        int n=a.length;
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
           if(a[i]==a[j]){
             System.out.println(a[i]);
             break;
           }
           break;
    }
    

}  

}
}
