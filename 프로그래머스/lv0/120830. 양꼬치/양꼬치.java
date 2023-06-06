class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer = 12000*n+2000*k;
        int service = n/10;
        answer -= 2000*service;
        return answer;
    }
}