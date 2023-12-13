import java.util.HashSet;

public class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> set = new HashSet<>();
        
        for (String element : s1) {
            set.add(element);
        }

        int count = 0;
        for (String element : s2) {
            if (set.contains(element)) {
                count++;
            }
        }

        return count;
    }
}
