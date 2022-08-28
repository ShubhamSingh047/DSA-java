public class Reverse_array_Single_parameter {

    public static int[] Reverse(int[] arr, int i){
        int n = arr.length;
        if(i>n/2){
            return arr;
        }
        arr[i]= (arr[i]+arr[n-i-1])-(arr[n-i-1]=arr[i]); // code swap
        return Reverse(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int[] res=Reverse(arr,0);
        for(int r:res){
            System.out.println(r);
        }
    }
}
