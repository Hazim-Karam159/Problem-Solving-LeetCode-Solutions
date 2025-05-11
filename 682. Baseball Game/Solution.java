class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String  str : operations ){
            if(str.equals("+")){
                int last = stack.peek();
                int lastSecond = stack.get(stack.size() -2);
                stack.push(last + lastSecond);
            }
            else if(str.equals("C") ){
                stack.pop();
            }
            else if(str.equals( "D" )){
                int mult = stack.peek() * 2;
                stack.push(mult);
            }
            else{
                stack.push(Integer.valueOf(str));
            }
        }
        int sum = 0;
        for(int ele : stack){
            sum += ele;
        }
        return sum;
    }
}