public class firstOccurance{
    public static void main(String[] args) {
        int[] a = {3,4,5,5,5,6,5,7};
        int i;
        int key=5;
        
        for(i=0;i<a.length;i++){
              if(a[i]==key){
                System.out.println("Element found a t index :"+i);
                break;
              }
        }
       
    }
}