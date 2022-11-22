import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DSTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(120);
        list.add(5000);

        System.out.println(list.get(0));

        Stack<Character> s = new Stack<>();

        s.push('a');
        s.push('s');
        s.push('b');

        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
