public class IntegerExam {
    public static void main(String[] args) {
        int i = 100;
        Integer i1 = i;
        Integer i2 = Integer.valueOf(i);

        System.out.println("i1.equals(i2) : " + i1.equals(i2));
    }
}
