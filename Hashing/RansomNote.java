public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] have = new int[128];
        char[] magazineCharArray = magazine.toCharArray();
        for (int i = 0; i < magazineCharArray.length; i++) {
            have[magazineCharArray[i]]++;
        }
        char[] ransomNoteCharArray = ransomNote.toCharArray();
        for (int i = 0; i < ransomNoteCharArray.length; i++) {
            if (have[ransomNoteCharArray[i]] <= 0) {
                return false;
            } else {
                have[ransomNoteCharArray[i]]--;
            }
        }
        return true;
    }
}
