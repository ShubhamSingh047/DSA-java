public class Print_Name {
    static void sol(int n){
        if(n==0){
            return;
        }
        System.out.println("Shubham");
        sol(n-1);
    }

    public static void main(String[] args) {
        sol(5);
    }
}
