public class Loto {
    public static void main(String[] args) {
        System.out.print("이번 주 행운의 번호는 : ");

        int lotto[] = new int[5];

        for(int i=0; i<5; i++)
            lotto[i] = (int)(Math.random()*45+1);


        for(int i=0; i<5; i++)

            if(i != 4)
                System.out.print(lotto[i]+ ", ");
            else
                System.out.println(lotto[i]);


    }
}
