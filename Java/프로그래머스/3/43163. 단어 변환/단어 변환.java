import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        // 큐 생성 - linkedList로
        Queue<Node> queue = new LinkedList<>();
        
        // 방문 여부 설정
        boolean[] visited = new boolean[words.length];
        
        // 시작 단어 큐에 삽입
        queue.offer(new Node(begin, 0));
        
        // BFS 시작
        while(!queue.isEmpty()) {
            
            // 현재 단어 꺼내기
            Node current = queue.poll();
            
            // target 도달 시 count 반환
            if(current.word.equals(target)) {
                return current.count;
            }
            
            // words 배열 탐색
            for (int i=0; i<words.length; i++){
                // 방문하지 않고 한 글자만 다를 때
                if(!visited[i] && canChange(current.word, words[i])) {
                    visited[i] = true;
                    
                    queue.offer(new Node(words[i], current.count+1));
                }
                
            }
        }
        
        
        int answer = 0;
        return answer;
    }
    
    
    // canChange : 한 글자만 다른지 확인
    private boolean canChange(String word1, String word2) {
        int diff = 0;
        
        for (int i=0; i<word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)){
                diff++;
            }
        }
        // 한 글자만 변환하기 때문에 종료
        return diff == 1;
        
    }
    
    
    // Node Class 생성
    // Node 객체 - BFS에서 필요한 데이터를 한 번에 묶어서 저장
    class Node {
        String word;
        int count;
        
        Node(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    
}