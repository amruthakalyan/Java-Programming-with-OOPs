public class Equals{
    public static void main(String[] args) {
        int[] a = {1,0,0,1,0,1,0};
        int i;
        int countZeros=0;
        int countOnes=0;
        int arrLen=0;
        for(i=0;i<a.length;i++){
            if(a[i]==1) 
               countOnes+=1;
            else
                countZeros+=1;
            if(countOnes==countZeros){
                arrLen= countOnes+countZeros;
            }
        }
         System.out.println(arrLen);
        }
    }

