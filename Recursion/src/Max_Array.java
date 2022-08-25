public class Max_Array {
    static int Result(int[] arr, int n){

        if(n==arr.length-1){
            return arr[n];
        }

        int misa= Result(arr, n+1);
        if(misa>arr[n]){
            return misa;
        }else{
            return arr[n];
        }

    }
    public static void main(String[] args) {
        int arr[] = {22,33,4,19,7};
        int n = 0;
        int res = Result(arr,n);
        System.out.println(res);
    }
}
