import java.util.Scanner;

public class Prime_Factors {

    public static boolean is_Prime(int n){
        boolean res = false;
        if(n==1){
            res=false;
        }else if(n==2 || n==3){
            res=true;
        }else if(n%2==0||n%3==0){
            res=false;
        }else{
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
        int n= s.nextInt();
        for(int i=2; i<=n; i++){
            if(is_Prime(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
    }
}
