import javax.imageio.IIOException;
import java.io.*;

public class FileExam1 {
    public static void main(String[] args) throws IOException{
        try{
        FileReader fr = new FileReader("datar.txt");
        FileWriter fw = new FileWriter("datar.txt");
        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("이게 출력이 되나?");
    }
}

