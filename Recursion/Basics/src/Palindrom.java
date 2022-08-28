public class Palindrom {
    static boolean checkPalindrom(String str,int i){
        int n=str.length();
        boolean res=true;
        if(i>n/2){
            return res;
        }
        if(str.charAt(i)!=str.charAt(n-i-1)){
            res =false;
        }
        checkPalindrom(str,i+1);
        return res;
    }
    public static void main(String[] args) {
        boolean res = checkPalindrom("Madam",0);
        System.out.println(res);
    }
}
