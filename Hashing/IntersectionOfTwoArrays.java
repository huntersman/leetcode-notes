import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] have = new int[1001];
        for (int i = 0; i < nums2.length; i++) {
            have[nums2[i]]++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (have[nums2[i]] != 0) {
                list.add(nums1[i]);
                have[nums2[i]] = 0;
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
