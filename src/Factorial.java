public class Factorial {
    public static int Print_fact(int n) {
        if(n==1){
            return 1;
        }
        int res = Print_fact(n-1);
        int fn = n* res;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(Print_fact(5));
    }
}
