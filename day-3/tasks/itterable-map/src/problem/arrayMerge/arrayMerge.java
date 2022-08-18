package problem.arrayMerge;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;

public class arrayMerge {
    public static void main(String[] args) {
        String[] array1 = {"ujang", "udin", "asep"};
        String[] array2 = {"ujang", "aep", "asep", "abrur"};
        mergeArrayAsUnique(array1, array2);
    }

    static void mergeArrayAsUnique(String[] array1, String[] array2) {
        String[] mergedArray = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        String[] uniqueArray = new HashSet<String>(Arrays.asList(mergedArray)).toArray(new String[0]);
        System.out.println(Arrays.toString(uniqueArray));
    }
}
