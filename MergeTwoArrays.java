public class MergeTwoArrays{
    public static void main(String[] args) {
        int[] arr1={6,8,10,11};
    int[] arr2={1,4,7,12};
    int[] arr3 = new int[arr1.length + arr2.length];
    int i=0;
    for(i=0;i<arr3.length;i++){
        arr3[i] = arr1[i];
    }
    for(i=arr1.length;i<arr3.length;i++){
        arr3[i] = arr2[i];
    }
    for(i=0;i<arr3.length;i++){
       System.out.println(arr3[i] +" ");
    }
    }
}