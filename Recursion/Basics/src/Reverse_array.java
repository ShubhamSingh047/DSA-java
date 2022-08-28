public class Reverse_array {
    static int[] Swap_num(int[] arr , int a, int b){

        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;
    }

    public static int[] Reverse(int[] arr, int s, int l){
        int[] arr_up= new int[arr.length];
        if(s>=l){
            return arr_up;
        }
        Swap_num(arr,s,l);
//        arr[s] = (arr[s]+arr[l])-(arr[l]=arr[s]); (//amazing tech but need to understand how to do it)
        arr_up = Reverse(arr, s+1, l-1);
        //why return statement under if condition does not execute ??
        return arr_up;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,7,5};
        Reverse(arr, 0 ,4);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
