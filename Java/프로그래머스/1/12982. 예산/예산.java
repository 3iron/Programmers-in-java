import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        
        /* 매개변수 */
        // d : 부서별로 신청한 금액 배열
        // budget : 예산
        // 길이 : 1 ~ 100
        
        /* 목표 : 예산 안에서 최대한 많은 부서 지원 */
        // -> 금액이 작은 부서부터 지원
        
        // d 에서 budget 안으로 가능한 최대 개수 n
        
        // *문제 이해가 어려움
        
        // 1. 오름차순 정렬 ( 1, 2, 3, ... )
        Arrays.sort(d);
        
        // 2. 작은 금액부터 지원해본다 
        int sum = 0;
        int answer = 0;
        
        for (int money : d) {
            if (sum + money > budget) {
                break;
            }
            
            sum += money;
            answer++;
        }
        
        return answer;
    }
}