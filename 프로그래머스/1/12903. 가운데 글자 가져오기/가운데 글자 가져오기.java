class Solution {
    public String solution(String s) {
        if (s.length() % 2 == 0) {
            int length = s.length() / 2;
            return s.charAt(length - 1) + "" + s.charAt(length);
        } else {
            int length = s.length() / 2;
            char c = s.charAt(length);
            return c + "";
        }
    }
}