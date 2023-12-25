import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> multiples = new ArrayList<>();
        
        for (int num : numlist) {
            if (num % n == 0) {
                multiples.add(num);
            }
        }
        
        int[] result = new int[multiples.size()];
        
        for (int i = 0; i < multiples.size(); i++) {
            result[i] = multiples.get(i);
        }
        return result;
    }
}