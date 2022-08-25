public class Tower_Of_Hanoi {
    static void Toh(int n, int n1, int n2, int n3){
        if(n==0){
            return;
        }
        Toh(n-1,n1,n3,n2);
        System.out.println(n+"[ "+ n1 + " -> "+ n2 +" ]");
        Toh(n-1, n3,n2,n1);
    }

    public static void main(String[] args) {
        Toh(3,10,11,12);
    }
}
