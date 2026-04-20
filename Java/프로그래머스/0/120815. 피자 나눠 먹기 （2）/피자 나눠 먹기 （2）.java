class Solution {
    public int solution(int n) {
        int answer = 0;
        // 최소공배수(lcm)로 답 구하기
        // @인당 6조각 
        // @n명
        answer = lcm(6, n);
        return answer / 6;
    }
    // 유클리드 호제법 (최대공약수 구하기)
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
}