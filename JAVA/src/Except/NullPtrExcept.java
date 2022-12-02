package Except;

public class NullPtrExcept {
    public static void main(String[] args) {
        String strA = "Hansei";
        String strB = null;
        System.out.println("문자열 A의 길이 : " + strA.length());
        System.out.println("문자열 B의 길이 : " + strB.length());
    }
}
