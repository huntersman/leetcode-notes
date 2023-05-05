public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] need = new int[128];
        int len = s.length();
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        for (int i = 0; i < sCharArray.length; i++) {
            need[sCharArray[i]]++;
        }
        for (int i = 0; i < tCharArray.length; i++) {
            if (need[tCharArray[i]] > 0) {
                len--;
                need[tCharArray[i]]--;
            } else {
                return false;
            }
        }
        return len == 0;
    }
}
