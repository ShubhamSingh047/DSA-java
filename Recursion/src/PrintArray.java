import java.util.Scanner;

public class PrintArray {
//    static void displayArr(int[] arr, int n){
//        if(arr.length==n){
//            return;
//        }
//        System.out.println(arr[n]);
//        displayArr(arr, n+1);
//    }
    static void revArray(int[] arr, int n){
        if(arr.length==n){
            return;
        }
        revArray(arr, n+1);
        System.out.println(arr[n]);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("size of array:- ");
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
//        displayArr(arr, 0);
        revArray(arr,0);
    }
}
