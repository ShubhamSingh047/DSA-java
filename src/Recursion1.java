public class Recursion1 {
    public static void recursion(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recursion(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        recursion(5);
    }
}
