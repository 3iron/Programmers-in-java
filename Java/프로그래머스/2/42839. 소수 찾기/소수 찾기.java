import java.util.*;

class Solution {
    // main 안에서 실행하면 오류
    Set<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()]; 
        
        dfs("", numbers, visited);
       
        int answer = 0;
        
        for (int num : numberSet) {
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    
    // 소수 판별
    private boolean isPrime(int num) {
        if (num<2) {
            return false;
        }
        
        for (int i = 2; i * i <= num; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    
    private void dfs(String current, String numbers, boolean[] visited) {
        if (!current.equals("")){
            numberSet.add(Integer.parseInt(current));
        }
            
            for (int i =0; i < numbers.length(); i++ ) {
                if (!visited[i]) {
                    visited[i] = true;
                    dfs(current + numbers.charAt(i), numbers, visited);
                    visited[i] = false;
                }
            }
    }
}