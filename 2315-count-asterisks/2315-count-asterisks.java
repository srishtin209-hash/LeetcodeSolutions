class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean insidePair = false;

        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                insidePair = !insidePair;
            } else if (ch == '*' && !insidePair) {
                count++;
            }
        }

        return count;
    }
}