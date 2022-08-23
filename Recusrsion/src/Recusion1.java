//simple problem to count  we will use recusive calls
public class Recusion1 {
    public static int countDigit(int n){
//        if(n==0)
//            retu  rn 0;
//        return 1+ countDigit(n/10);
        return Math.floor(log 10(n+1));
    }

    public static void main(String[] args) {
        int result = countDigit(12345);
        System.out.println(result);
    }
}
