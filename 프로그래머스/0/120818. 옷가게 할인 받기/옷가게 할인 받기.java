class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 100000 && price < 300000) {
            price -= (price * 0.05);
            answer = price;
        } else if (price >= 300000 && price < 500000) {
            price -= (price * 0.1);
            answer = price;
        } else if (price >= 500000) {
            price -= (price * 0.2);
            answer = price;
        } else {
            answer = price;
        }
        return (int)answer;
    }
}