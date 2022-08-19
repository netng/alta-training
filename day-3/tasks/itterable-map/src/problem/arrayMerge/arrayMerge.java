package problem.arrayMerge;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class arrayMerge {
    public static void main(String[] args) {
        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};
        mergeArrayAsUnique(array1, array2);
    }

    static void mergeArrayAsUnique(String[] array1, String[] array2) {
        String[] mergedArray = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        Set<String> uniqueArray = new LinkedHashSet<>(Arrays.asList(mergedArray));
        System.out.println(uniqueArray);
    }
}
