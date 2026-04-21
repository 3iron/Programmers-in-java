class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(double number : numbers) {
            sum += number;
        }
        double mean = sum / numbers.length;
        answer = mean;
        return answer;
    }
}