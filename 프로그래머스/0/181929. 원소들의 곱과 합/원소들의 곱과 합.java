class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int doub = 0;
        for (int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
        }
        for (int i = 0; i < num_list.length; i++) {
            doub += num_list[i];
        }
        doub = doub * doub;
        if (mul > doub) {
            answer = 0;
        } else if (mul < doub) {
            answer = 1;
        }
        return answer;
    }
}