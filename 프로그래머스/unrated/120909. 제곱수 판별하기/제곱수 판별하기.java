class Solution {
    public int solution(int n) {
        double sqrtN = Math.sqrt(n);
        if (sqrtN == (int) sqrtN) {
            return 1; 
        } else {
            return 2;
        }
    }
}