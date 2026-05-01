import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // progresses : [93, 30, 55]
        // speeds : [1, 30, 5]
        // return : [2, 1]
        List<Integer> list = new ArrayList<>();
        
        // currentDay : 첫 기능 기준 배포 그룹 기준일
        // (100 - 93 + 1 - 1) / 1 = 7
        int currentDay = (100-progresses[0] + speeds[0] - 1) / speeds[0];
        int count = 1;
        
        // 두번째 기능부터
        for (int i=1; i<progresses.length; i++) {
            // day : 다른 기능(i 번째) 완료일
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            
            // 현재 배포 기준일 안에 끝나면 같이 배포
            if(day <= currentDay) {
                count++;
            } else {
                // 새로운 배포 묶음 시작
                list.add(count);
                currentDay = day;
                count = 1;
            }
        }
        
        // 마지막 배포 묶음 추가
        list.add(count);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}