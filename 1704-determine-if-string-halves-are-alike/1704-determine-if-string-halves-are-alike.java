class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(i + n / 2));
            if ("aeiou".indexOf(ch1) != -1) {
                count++;
            }
            if ("aeiou".indexOf(ch2) != -1) {
                count--;
            }
        }
        return count == 0;
    }
}