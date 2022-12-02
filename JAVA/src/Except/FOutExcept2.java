package Except;

import java.io.*;

public class FOutExcept2 {
    public static void main(String[] args) {
        try {
            Reader fr = new FileReader("output.txt");
            while(true){
                int i = fr.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
                System.err.println("IOException이 발생하였습니다. ");
                e.printStackTrace();
        } finally {
                System.out.println("\n예외 여부와 관계 없이 무조건 실행되는 finaLly 구문");
        }
            System.out.println("FOutExcept. java 실행 완료! ");
    }
}


