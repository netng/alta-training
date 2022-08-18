/**
 * Untuk soal ini saya pernah mengerjakan di leatcode :D
 */

package problem.pairWithTargetSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pairWithTargetSum {
    public static void main(String[] args) {
        sumOfTarget(new int[]{1,2,3,4,6}, 6 );
        sumOfTarget(new int[]{2,5,9,11}, 11 );
    }

    static void sumOfTarget(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int want = target - numbers[i];

            if (map.containsKey(want)) {
                result.add(map.get(want));
                result.add(i);
            }
            map.put(numbers[i], i);
        }

        System.out.println(result);
    }
}