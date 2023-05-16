public class ReverseWordsInAString {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].length() != 0) {
                sb.append(strings[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
