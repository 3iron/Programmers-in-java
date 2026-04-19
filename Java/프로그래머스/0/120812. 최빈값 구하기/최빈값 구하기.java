import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. 개수 세기
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // 2. 최빈값 찾기
        int max = 0;
        int answer = 0;
        
        for(int key : map.keySet()) {
            int count = map.get(key);
            
            if(count > max) {
                max = count;
                answer = key;
            } else if (count == max) {
                answer = -1; // 최빈값이 여러개면 -1 출력
            }
        }
        
        return answer;
    }
}