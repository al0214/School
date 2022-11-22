import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InputFileReaderExam {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("JAVA/large_in.txt");
            while(true){
                int i = reader.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }
}

