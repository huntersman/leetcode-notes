import java.util.LinkedList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        List<String> list = new LinkedList<>();
        int[] hash = new int[26];
        for (int i = 0; i < words[0].length(); i++) {
            hash[words[0].charAt(i) - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] k = new int[26];
            for (char charArray : words[i].toCharArray()) {
                k[charArray - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                hash[j] = Math.min(hash[j], k[j]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (hash[i] > 0) {
                Character c = (char) ('a' + i);
                list.add(new String(String.valueOf(c)));
                hash[i]--;
            }
        }
        return list;
    }
}
