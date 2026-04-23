class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] arr = letter.split(" ");
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j < morse.length; j++) {
                if(arr[i].equals(morse[j])) {
                    //(char) 'a' + j : 알파벳 j 번째 만드는 코드
                    answer.append((char) ('a' + j));
                    break;
                }
            }
        }
        
        return answer.toString();
    }
}