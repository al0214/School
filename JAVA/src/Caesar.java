public class Caesar {

//    평문 msg를 int key를 활용해서 암호문을 반환하는 메소드
    public static String encrypt(String msg, int key){
        StringBuffer result = new StringBuffer();

        for(int i=0; i<=msg.length()-1; i++){
            char nChr;
            if(msg.charAt(i)==' '){
                result.append(' ');
                continue;
            }
            nChr = (char) ((msg.charAt(i)-'a'+key)%26 +'A');
            result.append(nChr);
        };
        return result.toString();
    }

//    암호문 msg를 int key를 활용해서 평문으로 반환하는 메소드
    public static String decrypt(String msg, int key){

        StringBuffer result = new StringBuffer();


        return result.toString();
    }
}
