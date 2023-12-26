class Solution {    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int commonDenom = denom1 * denom2;
        int commonNumer = (numer1 * denom2) + (numer2 * denom1);
        
        int gcd = gcd(commonNumer, commonDenom);
        int reducedNumer = commonNumer / gcd;
        int reducedDenom = commonDenom / gcd;
        
        return new int[]{reducedNumer, reducedDenom};
    }
}