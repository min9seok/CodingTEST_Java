import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
		Arrays.sort(numbers);
        int max1 = 0;
        int max2 = 0;
        for(int i=2; i<numbers.length;i++){
            max1=numbers[i];
            max2=numbers[i-1];
            
        }
        answer = max1*max2;
        return answer;
    }
}