package problem.angkaMunculSekali;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class angkaMunculSekali {
    public static void main(String[] args) {

        getOnlyUniqueNumber("75623752");
        getOnlyUniqueNumber("1122");
    }

    static void getOnlyUniqueNumber(String number) {
        String[] arrString = new String[number.length()];
        arrString = number.split("");

        List<String> list = new ArrayList<>();

        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < arrString.length; i++) {
            hashMap.put(i, arrString[i]);
        }

        Map<String, Long> values = hashMap.values().stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );

        for (Map.Entry<String, Long> value : values.entrySet()) {
            if (value.getValue() == 1) {
                list.add(String.valueOf(value.getKey()));
            }
        }

        System.out.println(list);

    }
}