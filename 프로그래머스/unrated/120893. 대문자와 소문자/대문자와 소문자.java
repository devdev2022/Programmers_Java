class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}