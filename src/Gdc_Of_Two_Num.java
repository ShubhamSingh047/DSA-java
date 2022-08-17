import java.util.Scanner;

public class Gdc_Of_Two_Num {
    public static int GcdFinder(int n1, int n2) {
        int min = Math.min(n1,n2);
        int res=1;
        while(min>0) {
            if (n1 % min == 0 && n2 % min == 0) {
                res = min;
                break;
            }
            min--;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1= s.nextInt();
        int n2= s.nextInt();
        int result=GcdFinder(n1, n2);
        System.out.println(result);
    }
}
