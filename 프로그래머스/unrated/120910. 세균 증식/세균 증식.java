class Solution {
    public int solution(int n, int t) {
        int growthRate = (int)Math.pow(2, t);
        return n * growthRate;
    }
}