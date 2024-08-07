public class Largest_Occuring_Element{
    public static void main(String[] args) {
        int[] a = {1,2,2,4,1,4,2};
        int max=0;
        int count =0;
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=i;j<a.length-1;j++){
                if(a[j]==a[j+1]){
                    count++;
                }
                else{
                    count=1;
                }
            }
        }
        if(count >max){
            max=count;
        }
        System.out.print("Largest Occuring Element is :" + max);
    }
}