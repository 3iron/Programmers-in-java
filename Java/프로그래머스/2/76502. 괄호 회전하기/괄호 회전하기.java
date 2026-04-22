import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i=0; i< s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if(isValid(rotated)) {
                answer++;
            }
        }
        
        return answer;
    }
    public boolean isValid(String str) {
        // 괄호 스택
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            // 시작 괄호 -> push 
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // 닫는 괄호 -> 검사
            else {
                if(stack.isEmpty()) {
                    return false;
                }   
                char top = stack.pop();
                
                if(ch==')' && top != '(') return false;
                if(ch==']' && top != '[') return false;
                if(ch=='}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}