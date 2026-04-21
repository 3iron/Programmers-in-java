class Solution {
    public int solution(int angle) {
        int answer = 0;
        // 0도 초과 90도 미만은 예각, 
        // 90도는 직각, 
        // 90도 초과 180도 미만은 둔각 
        // 180도는 평각으로 분류합니다. 
        // 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4
        
        if(angle > 0 && angle <90) {
            answer = 1;
        }else if(angle == 90) {
            answer = 2;
        }else if(angle > 90 && angle < 180) {
            answer = 3;
        }else if(angle == 180) {
            answer = 4;
        }
        
        return answer;
    }
}