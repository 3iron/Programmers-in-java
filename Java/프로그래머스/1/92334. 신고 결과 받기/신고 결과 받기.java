import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 유저별 메일 수 저장
        Map<String, Integer> mailMap = new HashMap<>();
        
        // 유저별 신고당한 횟수 저장
        Map<String, Integer> reportedCountMap = new HashMap<>();
        
        // 중복 신고 제거
        // Arrays.asList(String[]) 
        // : 배열 -> List로 변환 
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        // 초기값 세팅
        for (String id : id_list) {
            mailMap.put(id, 0);
            reportedCountMap.put(id, 0);
        }
        
        // 1. 신고당한 횟수 세기
        for (String r : reportSet) {
            String[] parts = r.split(" ");
            // 출력해보기
            String reportedUser = parts[1];
            
            reportedCountMap.put(reportedUser, reportedCountMap.get(reportedUser) + 1 );
        }
        
        // 2. 정지된 유저를 신고한 사람에게 (처리 결과)메일 수 증가
        for (String r : reportSet) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reportedUser = parts[1];
            
            if(reportedCountMap.get(reportedUser) >= k) {
                mailMap.put(reporter, mailMap.get(reporter) + 1);
            }
        }
        
        // 3. id_list 순서대로 결과 배열 만들기
        int[] answer = new int[id_list.length];
        for(int i=0; i<id_list.length; i++) {
            answer[i] = mailMap.get(id_list[i]);
        }
        
        return answer;
    }
}