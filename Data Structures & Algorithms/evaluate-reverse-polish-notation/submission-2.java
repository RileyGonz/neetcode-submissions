class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        Set<String> bank = new HashSet<>();
        bank.add("+");
        bank.add("-");
        bank.add("/");
        bank.add("*");
        for(int i = 0; i < tokens.length; i++){
            if(bank.contains(tokens[i])){
                if(!s.isEmpty()){
                    int val = 0;
                    int num2 = s.pop();
                    int num1 = s.pop();
                    switch (tokens[i]) {
                        case "+":
                            val = num1 + num2;
                            break;
                        case "-":
                            val = num1 - num2;
                            break;
                        case "/":
                            val = num1 / num2;
                            break;
                        default:
                            val = num1 * num2;
                            break;
                    }
                    s.push(val); 
                }
            }else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}
