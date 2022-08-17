import java.util.Scanner;

//we to count number of consecutive zeros in a number at the end and the number for we need to perform
//operation is factorial of n.
//I/O= 5 5*4*3*2*1=120
//O/P= number of zero in 120 is one, so output will be 1.

public class Trailing_Zeros {
    public static long Factorial_recur(int n){
        if (n==0)
            return 1;
        return n*Factorial_recur(n-1);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long result = Factorial_recur(n);
        System.out.println(result + " Factorial");
        int count=0;
        for(long i=result; i>0; i/=10){
            if(i%10==0){
                count++;
            }else
                break;
        }
        System.out.println(count);
    }
}
