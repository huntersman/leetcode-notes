import java.util.*;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int left = 0, right = 0;
        int len = fruits.length;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (; right < len; right++) {
            if (map.size() < 2) {
                map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            } else {
                if (map.containsKey(fruits[right])) {
                    map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
                } else {
                    while (map.size() == 2) {
                        map.put(fruits[left], map.get(fruits[left]) - 1);
                        if (map.get(fruits[left]) == 0) {
                            map.remove(fruits[left]);
                        }
                        left++;
                    }
                    map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
                }
            }
            maxLen = Math.max(maxLen, (right - left) + 1);
        }
        return maxLen;
    }
}
