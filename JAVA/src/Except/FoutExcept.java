package Except;

import java.io.*;
public class FoutExcept {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("output.txt");
            fw.write("Test Text");
            fw.close();
        } catch (IOException e) {
            System.err.println("IOException이 발생하였습니다. ");
            e.printStackTrace();
        } finally {
            System.out.println("예외 여부와 관계 없이 무조건 실행되는 finaLly 구문");
        }
        System.out.println("FOutExcept. java 실행 완료! ");
    }
}
