import java.util.Scanner;

//that is based on formula (a*b)= gcd(a,b)*lcm(a,b)
//We now how to find gcd ?
public class Efficient_Lcm_Euclidean_Algo {
    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int num=n1*n2;
        int sol = num/GCD(n1,n2);
        System.out.println(sol);
    }
}
