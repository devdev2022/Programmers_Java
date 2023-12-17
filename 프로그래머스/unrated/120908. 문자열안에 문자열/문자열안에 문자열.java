import java.util.regex.*;

class Solution {
    public int solution(String str1, String str2) {
        Pattern pattern = Pattern.compile(Pattern.quote(str2));
        Matcher matcher = pattern.matcher(str1);
        
        if (matcher.find()) {
            return 1;
        } else {
            return 2;
        }
    }
}