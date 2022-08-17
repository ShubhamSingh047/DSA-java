import java.util.Scanner;

public class Trailing_Zeros_Efficient {
    public static int Count_fives(int n){
        int count = 0;
        for(int i=5; i<=n; i*=5){
            count+=n/i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = Count_fives(n);
        System.out.println(result);
    }
}
