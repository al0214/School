public class WrapValueOf {
    public static void main(String[] args) {
        String str1 = "127";        // Q1. 숫자를 1024로 바꿔보세요
        String str2 = "3.141592";

        int b = Byte.valueOf(str1);
        Double i1 = Double.valueOf(str1); // Q2. str1 대신 str2를 읽어보세요
        Double d1 = Double.valueOf(str1);
        Double d2 = Double.valueOf(str2);

        System.out.println("b: " + b);
        System.out.println("i1: " + i1);
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
    }
}
