class Solution {
    public String solution(int age) {
        String answer = "";
        // 97 ~ 106, a ~ j, charAt
        StringBuilder sb = new StringBuilder();
        
        while(age > 0) {
            char c = (char) ('a' + (age% 10));
            sb.insert(0, c);
            
            age /= 10;
        }
        answer = sb.toString();
        return answer;
    }
}