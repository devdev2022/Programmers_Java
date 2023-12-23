import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i%2==1) {
                numbers.add(i);
            }
        }
        
        int[] result = new int[numbers.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }
}