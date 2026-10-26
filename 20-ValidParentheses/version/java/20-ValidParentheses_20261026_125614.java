// Last updated: 10/26/2026, 12:56:14 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack <Character> stack=new Stack<>();
4        int i=0;
5        int n=s.length();
6        for(i=0;i<n;i++){
7            char ch=s.charAt(i);
8            if(ch=='('||ch=='{'||ch=='['){
9                stack.push(ch);
10            }
11            else{
12                if(stack.isEmpty()){
13                    return false;
14                }
15                char chr=stack.peek();
16                if((chr=='('&& ch==')')||(chr=='{'&& ch=='}')||(chr=='['&& ch==']')){
17                    stack.pop();
18                }
19                else{
20                    return false;
21                }
22            }
23        }
24        return stack.isEmpty();
25    }
26}