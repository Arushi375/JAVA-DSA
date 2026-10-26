// Last updated: 10/26/2026, 12:55:37 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack <Character> stack=new Stack<>();
4        int i=0;
5        for(char str : s.toCharArray() )
6        {
7            if(str=='('||str=='['||str=='{')
8            {
9                stack.push(str);
10            }
11            else{
12                if(stack.isEmpty()){return false;}
13                char top=stack.peek();
14                if((top=='('&& str==')')||(top=='[' && str==']')||(top=='{' && str =='}'))
15                {
16                    stack.pop();
17                }
18                else{
19                    return false;
20                }
21            }
22        }
23        return stack.isEmpty();
24       
25    }
26}