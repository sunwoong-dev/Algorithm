class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String[] arr = rny_string.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("m")) {
                arr[i] = "rn";
            }
        }
        String joinString = String.join("", arr);
        answer = joinString;
        return answer;
    }
}