import java.util.HashMap;
import java.util.Map;

public class FourSum2 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map1 = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int key = nums1[i] + nums2[j];
                map1.put(key, map1.getOrDefault(key, 0) + 1);
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int num = nums3[i] + nums4[j];
                if (map1.containsKey(-num)) {
                    res += map1.get(-num);
                }
            }
        }
        return res;
    }
}
