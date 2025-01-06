class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
      while (true) {
            if ((n - slice) > 0) {
                answer += 1;
                n -= slice;
            } else if (n - slice <= 0) {
                break;
            }
        }
        return answer;
    }
}