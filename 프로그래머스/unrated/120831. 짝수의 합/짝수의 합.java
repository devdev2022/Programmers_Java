class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int sum = 2; sum<=n; sum+=2) {
            answer += sum;
        }
        return answer;
    }
}