import java.util.Arrays;

public class CommonElement {
    public static int[] Solve(int[] A, int[] B){
        int a=A.length-1;
        int b=B.length-1;
        int n = a>b?a:b;
        int k=1;
        int [] result = new int[k];
        for(int i=0; i<A.length; i++){
            for(int j=i; j<B.length; j++){
                if(A[i]==B[j]){
                    result[k-1]=A[i];
                    k++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] A = {1,2,2,1};
        int [] B = {2,3,1,2};
        int[] res = Solve(A,B);
        System.out.println(Arrays.toString(res));
    }
}
