public class Max_Array {
    static int Max(int[] arr, int n){
        int max= 0;
        if(n== arr.length){
            return max;
        }
        System.out.println(n+" pre");
        int misa = Max(arr, n+1);
        System.out.println(n+" post");
        if(misa>arr[n]){
            max=misa;
        }else{
            max=arr[n];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{111,22,3,4,5};
        System.out.println(arr.length);
        int s = Max(arr,0);
        System.out.println(s);
    }
}
