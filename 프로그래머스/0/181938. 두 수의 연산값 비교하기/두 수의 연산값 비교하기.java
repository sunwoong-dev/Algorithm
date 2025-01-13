class Solution {
    public int solution(int a, int b) {
        StringBuilder numStr = new StringBuilder();
        numStr.append(a);
        numStr.append(b);
        
        int compareNum = 2 * a * b;
        int num = Integer.parseInt(numStr.toString());
        return (compareNum >= num) ? compareNum : num;
    }
}