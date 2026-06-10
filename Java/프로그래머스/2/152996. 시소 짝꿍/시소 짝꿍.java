import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;

        Map<Integer, Long> map = new HashMap<>();

        for (int w : weights) {
            map.put(w, map.getOrDefault(w, 0L) + 1);
        }

        for (int w : map.keySet()) {
            long count = map.get(w);

            // 1. 같은 몸무게끼리 짝
            if (count >= 2) {
                answer += count * (count - 1) / 2;
            }

            // 2. 서로 다른 몸무게 비율 체크
            // w * 2 == other * 3  → other = w * 2 / 3
            // w * 2 == other * 4  → other = w * 2 / 4
            // w * 3 == other * 4  → other = w * 3 / 4

            if (w * 2 % 3 == 0) {
                int other = w * 2 / 3;
                if (map.containsKey(other)) {
                    answer += count * map.get(other);
                }
            }

            if (w * 2 % 4 == 0) {
                int other = w * 2 / 4;
                if (map.containsKey(other)) {
                    answer += count * map.get(other);
                }
            }

            if (w * 3 % 4 == 0) {
                int other = w * 3 / 4;
                if (map.containsKey(other)) {
                    answer += count * map.get(other);
                }
            }
        }

        return answer;
    }
}