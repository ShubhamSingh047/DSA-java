public class Power_Liner {
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        int nRaise = Power(x, n-1);
        int nDec = x*nRaise;
        return nDec;
    }

    public static void main(String[] args) {
        int res = Power(3, 4);
        System.out.println(res);
    }
}
