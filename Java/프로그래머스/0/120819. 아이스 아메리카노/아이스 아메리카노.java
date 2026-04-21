class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int n = money / 5500;
        int m = money % 5500;
        
        answer[0] = n;
        answer[1] = m;
        
        return answer;
    }
}