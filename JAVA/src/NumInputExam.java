import java.io.IOException;
import java.io.InputStream;

public class NumInputExam {
    static String readLine(InputStream is){
        StringBuffer sb = new StringBuffer();
        try {
            while (true) {
                int i = is.read();
                if (i == -1 || i == '\n') break;
                sb.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        InputStream sin = System.in;
        System.out.print("A: ");
        String strA = readLine(sin);
        System.out.print("B: ");
        String strB = readLine(sin);

        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);

        System.out.println("A+B = " + (a+b));
    }
}
