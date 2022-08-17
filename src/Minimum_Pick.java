public class Minimum_Pick {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int[] A = {74,9,51,51,75,0,35,89,96,77};
        for (int i=0; i<A.length; i++) {
            if (A[i] % 2 == 0 && A[i] > max) {
                max = A[i];
            } else if (A[i]%2!=0 && A[i] < min) {
                min = A[i];
            }
            System.out.println(max+ " max");
            System.out.println(min+ " min");
        }
        System.out.println(max-min);
    }
}
