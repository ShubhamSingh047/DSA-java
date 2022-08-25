public class Print_Linerarly_1_to_N{

    static void Sol(int n){
        if(n==0){
            return;
        }
        Sol(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Sol(5);
    }
}
