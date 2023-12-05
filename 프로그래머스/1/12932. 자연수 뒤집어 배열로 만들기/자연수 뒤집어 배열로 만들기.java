import java.util.Iterator;
class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();		      
		        sb.append(n);
		        sb.reverse();		 
		        String temp = sb.toString();
		        int[] answer = new int[temp.length()];		        
		        for (int i = 0; i < answer.length; i++) {
		        	answer[i] = temp.charAt(i)-'0';
				}
        return answer;
    }
}