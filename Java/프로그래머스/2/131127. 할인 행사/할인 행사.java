import java.util.*;

class Solution {
    // @want : ["banana", "apple", "rice", "pork", "pot"]
    // @number : [3, 2, 2, 2, 1]
    // @discount : ["chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"]
    // result : 3
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 10일씩 확인
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();

            // i일부터 10일 동안 할인 상품 개수 세기
            for (int j = i; j < i + 10; j++) {
                discountMap.put(
                    discount[j],
                    discountMap.getOrDefault(discount[j], 0) + 1
                );
            }

            if (wantMap.equals(discountMap)) {
                answer++;
            }
        }

        return answer;
    }
}