public class Fibo_recusrion {
    static int Sol(int n){
        if(n<2){
            return n;
        }
        return Sol(n-1) + Sol(n-2);
    }
    public static void main(String[] args) {
        int res= Sol(7);
        System.out.println(res);
    }
}
