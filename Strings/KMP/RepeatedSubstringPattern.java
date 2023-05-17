package KMP;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        String target = s + s;
        int[] next = new int[s.length()];
        getNext(next, s);
        int j = 0;
        for (int i = 1; i < target.length() - 1; i++) {
            while (j - 1 >= 0 && s.charAt(j) != target.charAt(i)) {
                j = next[j - 1];
            }
            if (s.charAt(j) == target.charAt(i)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }
        return false;
    }

    private void getNext(int[] next, String find) {
        int j = 0;
        next[0] = j;
        for (int i = 1; i < next.length; i++) {
            while (j - 1 >= 0 && find.charAt(j) != find.charAt(i)) {
                j = next[j - 1];
            }
            if (find.charAt(j) == find.charAt(i)) {
                j++;
            }
            next[i] = j;
        }
    }
}
