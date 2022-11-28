// 문제: 아래 문장을 버퍼를 사용하는 스트림으로 변환해 보세요

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedInputExam {
    public static void main(String[] args) {
        try (Reader is = new InputStreamReader(
                new FileInputStream("large_in.txt"))){
            while(true){
                int i = is.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }
}