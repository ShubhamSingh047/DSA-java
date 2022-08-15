import java.util.Scanner;

public class Factorial_Iterative {

    public static int factorialCalc(int n){
        int result=1;
        while(n>0) {
            result*=n;
            n--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res=factorialCalc(n);
        System.out.println(res);
    }
}
