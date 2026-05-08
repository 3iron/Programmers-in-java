class Solution {
    public int[] solution(long n) {
        // 1. 문자를 숫자로 변환 후 배열에 넣기
        String[] arr = String.valueOf(n).split("");
        int[] answer = new int[arr.length];
        
        // 2. 큰 수대로 정렬
        for (int i=0; i<arr.length; i++){
            answer[i] = Integer.parseInt(arr[arr.length -1 -i]);
        }
        return answer;
    }
}