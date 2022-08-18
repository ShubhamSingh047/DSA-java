import java.util.Scanner;

public class Most_Efficient_CheckPrime {

    public static boolean CheckPrime(int n){
        boolean res=true;
        if(n==1){
            res = false;
        } else if (n==2||n==3) {
            res= false;
        } else if (n%2==0 || n%3==0) {
            res= false;
        } else {
            for(int i=5; i*i<=n; i=i+6){
                if(n%i==0||n%(n+2)==0){
                    res=false;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(CheckPrime(n));
    }
}
