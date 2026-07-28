// Last updated: 7/28/2026, 5:11:20 PM
class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        int i=0;
        for(char str : s.toCharArray() )
        {
            if(str=='('||str=='['||str=='{')
            {
                stack.push(str);
            }
            else{
                if(stack.isEmpty()){return false;}
                char top=stack.peek();
                if((top=='('&& str==')')||(top=='[' && str==']')||(top=='{' && str =='}'))
                {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
       
    }
}