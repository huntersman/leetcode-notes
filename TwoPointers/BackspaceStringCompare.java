public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        int pointS = s.length() - 1, pointT = t.length() - 1;
        int cntS = 0, cntT = 0;
        while (pointS >= 0 || pointT >= 0) {
            while (pointS >= 0) {
                if (s.charAt(pointS) == '#') {
                    cntS++;
                    pointS--;
                } else if (cntS > 0) {
                    pointS--;
                    cntS--;
                } else {
                    break;
                }
            }
            while (pointT >= 0) {
                if (t.charAt(pointT) == '#') {
                    cntT++;
                    pointT--;
                } else if (cntT > 0) {
                    pointT--;
                    cntT--;
                } else {
                    break;
                }
            }
            if (pointS >= 0 && pointT >= 0) {
                if (s.charAt(pointS) != t.charAt(pointT)) {
                    return false;
                }
            } else {
                if (pointS >= 0 || pointT >= 0) {
                    return false;
                }
            }
            pointS--;
            pointT--;
        }
        return true;
    }
}
