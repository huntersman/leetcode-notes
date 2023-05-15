public class ReverseString2 {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i += 2 * k) {
            int left = i, right = i + k - 1;
            if (right >= charArray.length) {
                right = charArray.length - 1;
            }
            while (left < right) {
                char tmp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = tmp;
                left++;
                right--;
            }
        }
        return String.valueOf(charArray);
    }
}
