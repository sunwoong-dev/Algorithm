class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2-num1) + 1];
        int j = num1;
        
        for (int i = 0;i < answer.length; i++) {
            answer[i] = numbers[j];
            j++;
        }
        return answer;
    }
}