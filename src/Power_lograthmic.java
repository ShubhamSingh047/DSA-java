public class Power_lograthmic {
     public  static int Power(int x , int n){
         if(n==0){
             return 1;
         }
         int nRaise = Power(x,n/2);
         int res=nRaise*nRaise;
         if(n%2!=0){
             res = res*x;
         }
         return res;
     }

    public static void main(String[] args) {
        int res = Power(3,4);
        System.out.println(res);
    }
}
