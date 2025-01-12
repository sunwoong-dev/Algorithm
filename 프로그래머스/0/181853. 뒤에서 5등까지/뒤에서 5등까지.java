class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[5];
        int temp;
        for (int i = 0; i < num_list.length - 1; i++) {
            for (int j = i + 1; j < num_list.length; j++) {
                if (num_list[i] > num_list[j]) {
                    temp = num_list[j];
                    num_list[j] = num_list[i];
                    num_list[i] = temp;
                }
            }
        }
        int[] answer = new int[5];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}