import java.util.Scanner;

public class Eclidean_Algo_GCD {
    public static int Solution(int a, int b){
        while(a!=b)
            if(a>b)
                a=a-b;
            else
                b=b-a;
    return a;
    }

    public static void OptimisedSol(int a, int b){
        if(b==0){
            System.out.println(a+" GCD of "+ a+" & "+b);
        }else{
            OptimisedSol(b, a%b);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1= s.nextInt();
        int n2= s.nextInt();
//        int Sol=Solution(n1, n2);
        OptimisedSol(n1,n2);
//        System.out.println(Sol+ " Sol");
    }
}
