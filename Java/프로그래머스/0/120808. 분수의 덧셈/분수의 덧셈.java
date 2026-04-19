class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 기약분수(RF) : 분자, 분모를 더이상 나눌 수 없는 상태까지 나눈 분수 형태 
        int numer = numer1 * denom2 + numer2 * denom1; // 통분 후 분자
        int denom = denom1 * denom2; // 통분 후 분모
        
        int gcd = gcd(numer, denom); //최대 공약수
        int[] answer = new int[] { numer / gcd, denom / gcd };
        return answer;
    }
    
    // gcd : 최대공약수 구하기
    // 최대공약수(GCD) : 2개 이상의 정수에서 공통으로 나누어지는 수 중 큰 값
    public int gcd(int a, int b){
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}