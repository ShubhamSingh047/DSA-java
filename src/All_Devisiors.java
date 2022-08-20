public class All_Devisiors {
    public static void Find_Devisor(int n){
        int i=1;
        for(i=1; i*i<n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i>=1; i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }

    public static void main(String[] args) {
        Find_Devisor(36);
    }
}
