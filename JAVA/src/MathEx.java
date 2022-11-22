

public class MathEx {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.sqrt(9.0));
        System.out.println("e^4: "+Math.exp(4));
        System.out.println(Math.round(3.14));

        System.out.print("이번 주 행운의 번호는 : ");
        for(int i=0; i<5; i++)
            System.out.print((int)(Math.random()*45+1)+" ");

    }
}
