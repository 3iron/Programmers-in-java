import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 1. 이름별 점수 저장
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        // 2. 사진별 점수 합계 저장
        int[] answer = new int[photo.length];
        
        for (int i=0; i<photo.length;i++){
            int sum = 0;
            for(int j =0;j<photo[i].length; j++) {
                sum += map.getOrDefault(photo[i][j], 0);
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
}