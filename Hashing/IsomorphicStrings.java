import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < charS.length; i++) {
            if (!set.contains(charT[i])) {
                map.putIfAbsent(charS[i], charT[i]);
                set.add(charT[i]);
            }
        }
        for (int i = 0; i < charS.length; i++) {
            sb.append(map.get(charS[i]));
        }
        if (String.valueOf(sb).equals(t)) {
            return true;
        }
        return false;
    }
}
