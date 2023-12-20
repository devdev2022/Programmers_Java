class Solution {
    public int solution(String my_string) {
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char element = my_string.charAt(i);
            if (Character.isDigit(element)) {
                sum += Character.getNumericValue(element);
            }
        }
        return sum;
    }
}
