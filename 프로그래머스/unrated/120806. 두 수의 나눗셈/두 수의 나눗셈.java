class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double danswer = 0;
        double dnum1 = num1;
        double sum= 0;
        sum = (dnum1/num2);	
        danswer = sum*1000;
        answer = (int)danswer;
        return answer;
    }
}
