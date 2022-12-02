package Except;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<Float>();
        list.add(10F);
        list.remove(10f);

        System.out.println(list.get(0));
    }
}
