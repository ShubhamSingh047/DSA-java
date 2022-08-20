public class Sieve_Eratorthencs {

    public static void sieve(int n){
        boolean[] arr1 = new boolean[n+1];

        for (int i=2; i<=n; i++){
            arr1[i] = true;
        }
        for (int i=2; i<=n; i++){
            if(arr1[i]){

            }
        }
    }

    public static void main(String[] args) {
        sieve(15);
    }
}
