class Solution {
        /* 매개변수 */
        // schedules : 직원 n명이 설정한 출근 희망 시각, 1차원 정수 배열
        // timelogs : 직원들이 일주일 동안 출근한 시각, 2차원 정수 배열
        // startday : 이벤트 시작 요일

        /* return */
        // answer : 상품을 받을 직원의 수
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        // 직원 수 n : schedules.length
        
        // 1. HHMM 형태를 분 단위로 변환
        for(int i=0; i<schedules.length; i++) {
            int time = schedules[i] / 100;
            // 시간 -> 분 단위로 변경 
            int minute = (schedules[i] - time*100) + time * 60;
            // 희망 시간 + 10분
            minute += 10;
            
            // 이 직원이 상품을 받을 수 있는지
            boolean pass = true;

            // 일주일
            for(int day=0; day<7; day++) {
               int realDay = (startday + day - 1) % 7 + 1;

                // 3. 평일만 : 6,7은 pass
                if(realDay == 6 || realDay == 7) {
                    continue;
                }else {
                    // 2. 출근 시각 : 출근 희망 시각 + 10분
                    for(int j=startday-1; j<timelogs[i].length; j++) {
                        int time2 = timelogs[i][day] / 100;
                        int minute2 = (timelogs[i][day] - time2*100) + time2 * 60;

                        if(minute2>minute) {
                            pass = false;
                            break;
                        }else {
                        }
                    }
                 }
            }
            if(pass){
            answer++;
            }
        }
        return answer;
    }
}