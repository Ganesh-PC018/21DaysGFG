class Solution{
    static int maxLength(String S){
        // code here
        int maxLength=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxLength= Math.max(maxLength,i-stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}