class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String tok: tokens){
            try{
                int num = Integer.parseInt(tok);
                stack.push(num);
            }catch (Exception e){
                int b = stack.pop();
                int a = stack.pop();
                String operand = tok;

                int ans = switch (operand) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> a / b;
                    default -> throw new IllegalArgumentException("Invalid operator");
                };
                stack.push(ans);
            }
        }
        return stack.pop();
    }
}
