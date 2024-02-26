class Solution {
    public boolean isValid(String s) {
        Stack<Character> str=new Stack<Character>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                str.push(')');
            }
            else if(ch=='{')
            {
                str.push('}');
            }
            else if(ch=='[')
            {
                str.push(']');
            }
            else if(str.isEmpty()|| str.pop()!=ch)
            {
                return false;
            }
        }
        return str.isEmpty();
    }
}
