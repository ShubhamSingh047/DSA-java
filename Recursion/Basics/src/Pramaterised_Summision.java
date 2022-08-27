public class Pramaterised_Summision {
    static void Sum(int n , int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        Sum(n-1, sum+n);
    }

    public static void main(String[] args) {
        Sum(5,0);
    }
}
