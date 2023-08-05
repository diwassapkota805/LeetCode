class Solution {
    public boolean isValid(String s) {
        // create a stack 
        // push all the opening paranthesis, then pop if the similar closing paranthesis is found


        Stack<Character> stack = new Stack<>();
        
        for(char S : s.toCharArray())
        {
            if((S == '(') || (S == '{') || (S == '['))
            {
                stack.push(S);
            }
            else if(S == ']')
            {
                if(stack.isEmpty() || stack.pop() != '[')
                    return false;
            }
            else if(S == '}')
            {
                if(stack.isEmpty() || stack.pop() != '{')
                    return false;
            }
            else if(S == ')')
            {
                if(stack.isEmpty() ||stack.pop() != '(')
                    return false;
            }
        }

        return stack.isEmpty();

      
    }
}
// Test Cases
//[{[]}]]

//[{}]{

//[{(())}]



// String 
// 20
