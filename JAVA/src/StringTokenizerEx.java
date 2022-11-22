import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String query = "name=kitae&addr=seoul&age=21";
        StringTokenizer st = new StringTokenizer(query, "&="); // 구분 문자 &로 Token 나누기

        int n = st.countTokens(); // 토큰 개수 가져오기
        System.out.println("토큰 개수 = " + n);

        while(st.hasMoreTokens()){  // 다음 토큰이 있는지 검사
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
