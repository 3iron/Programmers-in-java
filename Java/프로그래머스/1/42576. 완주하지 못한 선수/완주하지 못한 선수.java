import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        String answer = "";

        // 1. 참가자 수 카운트
        for (String name : participant){
            // map.getOrDefault(key, default)
            // : map에 key 있으면 가져오고
            // 없으면 default 가져옴
            // + 1 하는 이유 : 참가자 수 ++
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 2. 완주한 선수 이름 하나씩 빼기
        for (String name : completion) {
            map.put(name, map.get(name) - 1 );
        }

        // 3. 값이 1 이상인 선수 찾기
        // keySet() : HashMap에 들어있는 키만 모아서 꺼내는 메서드
        for (String name : map.keySet()) {
            if(map.get(name) > 0) {
                answer = name;
                break; // 찾으면 바로 반복 종료
            }

        }
        
    // return : 완주하지 못한 선수
    return answer;
    }

}
