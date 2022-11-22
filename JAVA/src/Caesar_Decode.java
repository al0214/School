import java.util.Locale;
import java.util.Scanner;

public class Caesar_Decode {
    public static void main(String[] args) {
        int key;
        String msg;

        Scanner sc = new Scanner(System.in);

        System.out.print("암호문: ");
        msg = sc.nextLine();

        System.out.print("Key: ");
        key = Integer.parseInt(sc.nextLine());


        String cipherText =Decoder.en_crypt(msg.toLowerCase(), key);

        System.out.println("평문 " + cipherText);
    }
}
