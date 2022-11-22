import java.util.Scanner;

public class Mathexample2 {

    public static void main(String[] args) {

        int i = 1;
        int name = 0;
        int randObj, randn;

        randObj = (int) Math.random();

        randn = (int)(Math.random()*45+1);



        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("숫자 입력(0~99)? ");
            name = Integer.parseInt(input.next());

            if(i < 5) {
                if (name < randn) {
                    System.out.println("너무 작습니다."+"("+i+"회)");
                    i++;
                } else if (name > randn) {
                    System.out.println("너무 큽니다"+"("+i+"회)");
                    i++;
                } else {
                    System.out.println("*******축하합니다*******");
                    break;
                }
            }
            else if (i == 5) {
                System.out.println("시도 횟수가 끝났습니다");
                break;
            } else
                break;
        }



    }
}
