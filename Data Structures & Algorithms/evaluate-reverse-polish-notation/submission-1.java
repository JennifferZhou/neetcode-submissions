class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String c : tokens) {
            if (c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*")) {
                System.out.println(c);
                if (c.equals("+")) {
                    System.out.println("DID THIS RUN");

                    int n = Integer.parseInt(stack.pop());
                    int m = Integer.parseInt(stack.pop());
                    int sum = n + m;
                    System.out.println(sum);
                    stack.push(Integer.toString(sum));
                }
                else if (c.equals("-")) {
                    int n = Integer.parseInt(stack.pop());
                    int m = Integer.parseInt(stack.pop());
                    int diff = m - n;
                    System.out.println(diff);
                    stack.push(Integer.toString(diff));
                }
                else if (c.equals("*")) {
                    int n = Integer.parseInt(stack.pop());
                    int m = Integer.parseInt(stack.pop());
                    int product = n * m;
                    System.out.println(product);
                    stack.push(Integer.toString(product));
                }
                else if (c.equals("/")) {
                    int n = Integer.parseInt(stack.pop());
                    int m = Integer.parseInt(stack.pop());
                    if (n == 0) return 0;
                    int remainder = m/n;
                    System.out.println(remainder);
                    stack.push(Integer.toString(remainder));
                }
            }
            else {
                stack.push(c);
                System.out.println(c);
            }
        }
        if (stack.isEmpty()) return 0;
        return Integer.parseInt(stack.pop());
    }
}
