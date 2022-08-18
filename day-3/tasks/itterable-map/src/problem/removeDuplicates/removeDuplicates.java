package problem.removeDuplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        removeDuplicateElement(new Integer[]{2,3,3,3,6,9,9});
        removeDuplicateElement(new Integer[]{2,2,2,11});
    }

    static void removeDuplicateElement(Integer[] values) {
        Set<Integer> set = new HashSet<>(Arrays.asList(values));
        System.out.println(set.size());
    }
}
