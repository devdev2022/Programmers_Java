public class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        
        for (int i = 0; i < length / 2; i++) {
            int value = num_list[i];
            num_list[i] = num_list[length - 1 - i];
            num_list[length - 1 - i] = value;
        }

        return num_list;
    }
}
