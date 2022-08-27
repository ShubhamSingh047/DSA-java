public class Sumof_N_Natural {
    static int Sol(int n){
        if (n==0){
            return 0;
        }
        int res = Sol(n-1);
        System.out.println(res);
        return 1;

         //0+1+3+6

    }

    public static void main(String[] args) {
        int res = Sol(4);
        System.out.println(res);
    }
}
