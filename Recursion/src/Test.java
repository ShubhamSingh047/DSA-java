public class Test {
     static void Solution(int[] arr, int num){
         int result = 0;
         int ans=0;
         for(int i=0; i<arr.length; i++){
             System.out.println(result);
                 for (int j=0; j< arr.length; j++){
                     System.out.println(i+ " i");
                     result+=arr[j];

                    }
             System.out.println(result+" result");
                 if(result>num){
                     ans=i+1;
                     break;
                 }
             }
         System.out.println(ans+" ans");
        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = 4;
        Solution(arr, num);
    }
}
