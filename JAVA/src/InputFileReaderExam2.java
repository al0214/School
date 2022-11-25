import java.io.*;

public class InputFileReaderExam2 {
    public static void main(String[] args) throws IOException{
        {
            try {
                FileInputStream fis = new FileInputStream("in.txt");
                Reader reader = new InputStreamReader(fis);
                while (true) {
                    int i = reader.read();
                    if (i == -1) break;
                    char c = (char) i;
                    System.out.print(c);
                }
                reader.close();
                fis.close();
            } catch (IOException e) {
                System.err.println(e);
            }
            System.out.println();
        }
    }
}


