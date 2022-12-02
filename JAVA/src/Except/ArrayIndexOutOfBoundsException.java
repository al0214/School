package Except;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String gamers[] = new String[]{"후부키", "미오", "오카유", "코로네", "스바루", "다나카"};

        for(int i=0; i<10; i++)
            System.out.println(gamers[i]);
    }
}
