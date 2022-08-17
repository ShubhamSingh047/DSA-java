import java.util.Scanner;

public class Lcm_Of_Two_Numb {
    public static void Sol(int a, int b){
        int min=Math.max(a,b); 
        while(min>0){
            if(a%min==0 && b%min==0) {
                System.out.println(min);
                break;
            }
            min--;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1= s.nextInt();
        int n2= s.nextInt();
        Sol(n1, n2);
    }
}
