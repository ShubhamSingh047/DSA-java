import java.util.Scanner;

public class Optimised_Prime_Factor {
    public static void Solutions(int n){
        if(n<=1){
            System.out.println(n);
        }
        for(int i=2; i*i<=n; i++){
            while (n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Solutions(n);
    }
}
