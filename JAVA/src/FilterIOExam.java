import java.io.*;

public class FilterIOExam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream fOut = new DataOutputStream(bos);
        fOut.writeInt(740);
        fOut.writeDouble(3.14159265358979);
        bos.flush();

        FileInputStream fis = new FileInputStream("data.dat");
        BufferedInputStream bin = new BufferedInputStream(fis);
        DataInputStream fIn = new DataInputStream(bin);
        int data = fIn.readInt();
        double p = fIn.readDouble();



        System.out.println(data);
        System.out.println(p);
    }
}

