public class Fibinocci_series {
    int fib(int n){
        int i,res=0;
        for(i=1;i<n;i++){
            res= fib(i-1) + fib(i-2);
        }
      return res;
    }
    public static void main(String[] args) {
        // int i;
        // int a =0;
        // int b =1;
        // int c=0;
        // int sum=1;
        // System.out.print(a + " ");
        // System.out.print(b + " ");
        // for(i=0;i<6;i++){
        //     c= a+b;
        //     sum +=c;
        //     System.out.print(c + " ");
        //     a=b;
        //     b=c; 
               
             
        // }
        // System.out.print("\nSum= "+ sum);
        int i,n=5,res=0;
        Fibinocci_series fs = new Fibinocci_series();
        for(i=0;i<n;i++){
             res+=fs.fib(5);
        }
        for(i=0;i<n;i++){
            System.out.println(res +" ");
        }

    }
}



