public class Kahoot {
    public static void main(String[] args) {
        System.out.println("3 * 5 % 6 = "+3*5%6);
        System.out.println("8 / 6 * 10 = " + 8/6*10.0);
        TestAA a = new TestAA();
        System.out.println(a.add(1,4));
        System.out.println(a.add(1,5.1));
    }

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }
}
class TestAA extends Kahoot{
    @Override
    public int add(int a, int b){
        return a-b;
    }
}