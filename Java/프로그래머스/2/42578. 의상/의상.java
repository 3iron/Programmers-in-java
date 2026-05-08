import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        // 1. 옷 종류별로 세기
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) +1);
        }
            
            int answer = 1;
            
            // 2. 각 종류별 (입는 경우 + 안 입는 경우) 곱하기
            for (int count : map.values()) {
                answer *= (count + 1);
            }
            
            // 3. 아무것도 안 입는 경우 제외
            return answer -1;
            
    }
}