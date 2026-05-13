class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray() ) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
}
