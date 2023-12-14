import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int end = numbers.length-1;
        int answer = numbers[end]*numbers[end-1];
        return answer;
    }
}