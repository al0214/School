import java.io.*;

public class ReadFromSysExam {
    public static void main(String[] args){
        byte[] b = new byte[10];
        int len = 0;
        try{
            len = System.in.read(b);
            System.out.write(b, 0, len);
        }catch (IOException ioe){
            System.out.println("입력 실패");
        }
    }
}