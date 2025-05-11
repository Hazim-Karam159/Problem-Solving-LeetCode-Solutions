class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else{
                char pc;
                if(!stack.isEmpty()){
                    pc = stack.pop();
                    if(pc != '(' && c == ')')
                        return false;
                    else if(pc != '{' && c == '}')
                        return false;

                    else if(pc != '[' && c == ']')
                        return false;
                }
                else
                    return false;
            }
        }

        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}