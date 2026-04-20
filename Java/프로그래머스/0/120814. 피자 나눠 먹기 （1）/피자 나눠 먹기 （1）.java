class Solution {
    public int solution(int n) {
        int answer = 0;
        int val = n / 7;
        if ( n%7 > 0 ) {
            val += 1;
        }
        answer = val;
        return answer;
    }
}