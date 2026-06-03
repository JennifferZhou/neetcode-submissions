class Solution {
    public boolean isValid(String s) {
        Stack<Character> par = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' )
                par.push(')');
            else if (c == '[')
                par.push(']');
            else if (c =='{') {
                par.push('}');
            }
            else {
                if (!par.isEmpty() && par.peek() != c)                    
                    return false;
                if (!par.isEmpty()) par.pop();
                else return false;
            }
        }
        if (!par.isEmpty()) return false;
        return true;
    }
}
