class Solution {
    public String solution(String rsp) {
                String temp = rsp.replace("2", "x") 
                         .replace("0", "y") 
                         .replace("5", "z"); 
        
        String answer = temp.replace("x", "0") 
                           .replace("y", "5") 
                           .replace("z", "2");
        return answer;
    }
}
