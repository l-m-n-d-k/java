package generics;

public class SearchUtils {
    public static <E> int linearSearch(E[] array, E key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static <E extends Comparable<E>> E max(E[] array) {
        E max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static <E extends Comparable<E>> E max(E[][] array) {
        E max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].compareTo(max) > 0) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
