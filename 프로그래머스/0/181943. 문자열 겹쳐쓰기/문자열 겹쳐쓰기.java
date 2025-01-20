class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        return new StringBuilder(my_string).replace(s, s + overwrite_string.length(), overwrite_string).toString();
    }
}