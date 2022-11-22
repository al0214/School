import java.io.*;

public class BufferedExam {
    public static void main(String[] args) {
        BufferedInputStream bi = new BufferedInputStream(System.in);
        BufferedOutputStream bo = new BufferedOutputStream(System.out);
        int aa;

        try{
            while((aa = bi.read())!= -1){
                bo.write(aa);
                bo.flush();
            }
            bo.flush();
            bo.close();
            bi.close();
        }catch (Exception id){}
    }
}
