import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();        
        
        // 우선순위, 원래 위치
        for (int i=0; i<priorities.length; i++) {
            // offer(우선순위, 원래위치) : 큐에 데이터 추가
            // new int[]{priorities[i], i} 
            queue.offer(new int[]{priorities[i], i});
        }
        
        int order = 0;
        
        while(!queue.isEmpty()) {
            // poll : 맨 앞에서 꺼내고 제거
            int[] current = queue.poll();
            boolean hasHigher = false;
            
            // 현재 큐 안에 더 높은 우선순위가 있는지 확인
            for (int[] process : queue){
                if (process[0] > current[0]) {
                    hasHigher = true;
                    break;
                }
            }
            
            if(hasHigher) {
                // 뒤로 보낸다
                queue.offer(current);
            } else {
                // 나머지 실행
                order++;
                // current[1] : 원래 위치
                if (current[1] == location) {
                    return order;
                }
            }
        }
        
        // 비정상 상태일 때 -1로 리턴
        return -1;
        
    }
}