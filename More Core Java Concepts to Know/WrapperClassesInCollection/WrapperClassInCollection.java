package WrapperClassesInCollection;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassInCollection {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        int i = 10;
        numberList.add(i);
        numberList.add(1);
        numberList.add(3);
        System.out.println(numberList);
        numberList.remove(2);
        System.out.println(numberList);
    }
}
