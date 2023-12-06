class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for(int i=0; i<n; i++) {
			 if(i%slice==0) {
			 answer+=1;
			 }
		 }	
        return answer;
    }
}