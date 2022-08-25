public class Occurance_recursion {
    static void solution(int arr[], int n, int index){

        if(n==arr[index]){
            System.out.println(index);
            return;
        }else if(index>= arr.length-1) {
            System.out.println(-1);
            return;
        }

        solution(arr, n,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,2,3,4};
        int n=31;
        solution(arr, n,0);
    }
}
