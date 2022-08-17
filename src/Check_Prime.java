import java.util.Scanner;

public class Check_Prime {
    public static boolean Check_Prime(int n){
        boolean result= true;
        if(n==1){
            result= false;
        }else{
            for(int i=2; i*i<=n; i++){
                if(n%i==0)
                    result=false;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Check_Prime(n));
    }
}
