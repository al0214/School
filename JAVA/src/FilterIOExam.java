
import java.io.*;

public class FilterIOExam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.dat");
        DataOutputStream fOut = new DataOutputStream(fos);
        fos.write(740);
        fOut.writeDouble(3.14159265358979);
        fos.close();

        FileInputStream fis = new FileInputStream("data.dat");
        DataInputStream fIn = new DataInputStream(fis);
        int data = fis.read();
        double p = fIn.readDouble();

        System.out.println(data);
        System.out.println(p);
    }
}

