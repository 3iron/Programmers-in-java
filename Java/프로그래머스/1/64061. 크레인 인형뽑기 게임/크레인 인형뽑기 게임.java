import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int move : moves) {
            // moves는 1부터 시작하므로 배열 인덱스에 맞게 -1
            int col = move - 1;

            // 행은 board 크기만큼 반복
            for(int j = 0; j < board.length; j++) {

                // 인형이 없으면 다음 행으로
                if(board[j][col] == 0) {
                    continue;
                } else {
                    // 현재 뽑은 인형
                    int doll = board[j][col];

                    // 뽑은 자리는 비우기
                    board[j][col] = 0;

                    // * 이전 값과 비교하는게 아니라 stack.peek()와 비교한다
                    // 스택이 비어있지 않고, 맨 위 인형과 현재 인형이 같으면 터짐
                    if(!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }

                    // 한 번에 인형 하나만 뽑아야 하므로 종료
                    break;
                }
            }
        }

        return answer;
    }
}