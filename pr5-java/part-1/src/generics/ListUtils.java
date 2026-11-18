package generics;

import java.util.ArrayList;

public class ListUtils {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
