class Solution {
    static int count = 0;
    
    public int solution(int n) {
        
        for(int i=0; i<=n; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    // 소수 찾기 
    // -> isPrime 메서드로 따로 빼기
    boolean isPrime (int n) {
        // 1은 소수가 아님
        if (n <= 1) {
           return false;
        }
        // 2부터 sqrt(n)까지만 나눠보기
        for (int i=2; i*i <= n; i++) {
            // 나누어 떨어지면 소수가 아니다
            if(n%i==0) {
                return false;
            } 
            
        }
        // 끝까지 안 나눠지면 소수
        return true;
    }
    
}