class Solution {
    public int[] solution(String[] strlist) {
        int range = strlist.length;
        int[] answer = new int[range];
        for(int i=0; i<range; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}