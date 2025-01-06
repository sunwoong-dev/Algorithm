class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            a = n % i;
            b = n / i;
            if (a == 0) {
                if ((b * b) == n) {
                    answer = 1;
                    break;
                } else {
                    answer = 2;
                }
            }
        }
        return answer;
    }
}