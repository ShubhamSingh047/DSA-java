public class Print_N_To_1 {
    static void Print_N_To_1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Print_N_To_1(n-1);
    }

    public static void main(String[] args) {
        Print_N_To_1(5);
    }
}
