import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // int[] -> Integer[] 로 변환
        Integer[] arr = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            arr[i] = score[i];
        }
        
        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        
        // m 개씩 상자 만들기
        for (int i = m-1; i< arr.length; i += m) {
            answer += arr[i] * m;
        }
        
        return answer;
    }
}