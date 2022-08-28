public class String_Test {
    public static void main(String[] args) {
//        String s = "Hello ";
//        s.concat("Shubham"); //imutable evern after concate method;
//
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" Shubham");

        String nam = new String("shubham");
        String nam2 = new String("shubham");

        System.out.println(nam==nam2);
        System.out.println(nam.equals(nam2));

//        System.out.println(sb+"sb");
//        System.out.println(s);
    }


}
