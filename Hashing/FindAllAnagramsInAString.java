import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] need = new int[128];
        int[] have = new int[128];
        for (int i = 0; i < p.length(); i++) {
            need[p.charAt(i)]++;
        }
        if (s.length() < p.length()) {
            return ans;
        }
        for (int i = 0; i < p.length(); i++) {
            have[s.charAt(i)]++;
        }
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (Arrays.equals(need, have)) {
                ans.add(i);
            }
            if (i < s.length() - p.length()) {
                have[s.charAt(i)]--;
                have[s.charAt(i + p.length())]++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        findAllAnagramsInAString.findAnagrams("abab", "ab");
    }
}
