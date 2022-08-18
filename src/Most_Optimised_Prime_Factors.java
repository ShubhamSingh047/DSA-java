import java.util.Scanner;

public class Most_Optimised_Prime_Factors {
    public static void Solution(int n) {
        if(n<=1){
            System.out.println(n);
        }
        while(n%2==0){
            System.out.println(2);
            n/=2;
        }
        while(n%3==0){
            System.out.println(3);
            n/=3;
        }
        for (int i=5; i*i<=n; i+=6){
            if(n%i==0){
                System.out.println(i);
                n/=5;
            } else if (n%(i+2)==0) {
                System.out.println(i+2);
                n/=(i+2);
            }
        }
        if(n>1){
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Solution(n);
    }
}
