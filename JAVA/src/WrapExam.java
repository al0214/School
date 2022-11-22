public class WrapExam {
    public static void main(String[] args) {
        int i = 365;    // 1년은 365일
        double d = 36.5;    // 체온은 36.5도
        Integer wint = 2022; // 올해는 2022년
        Double wPi = 3.14159265358979; // 대충 pi 값

        String id = Integer.toString(i) + Double.toString(d);

        System.out.println("int: " + i);
        System.out.println("double: " + d);
        System.out.println("id: " + id);
        System.out.println("Wrapper Int: " + wint.toString());
        System.out.println("Wrapper Double: " + wPi.toString());
    }
}
