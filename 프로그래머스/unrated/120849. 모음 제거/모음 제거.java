import java.util.regex.*;

class Solution {
    public String solution(String my_string) {
        String gather = "a|e|i|o|u";
        
        Pattern pattern = Pattern.compile(gather);
        Matcher matcher = pattern.matcher(my_string);        
        
        return matcher.replaceAll("");       
    }
}