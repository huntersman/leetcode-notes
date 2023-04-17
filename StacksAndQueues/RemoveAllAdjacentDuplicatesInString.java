import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (deque.isEmpty()) {
                deque.add(charArray[i]);
            } else {
                if (deque.getLast() == charArray[i]) {
                    deque.removeLast();
                } else {
                    deque.add(charArray[i]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : deque) {
            sb.append(character);
        }
        return sb.toString();
    }
}
