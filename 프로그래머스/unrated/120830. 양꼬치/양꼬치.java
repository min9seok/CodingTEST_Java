class Solution {
    public int solution(int n, int k) {
	    int answer = 0;
        for(int i=1; i<=n; i++) {
        if(i%10==0) {
			k= k-1;
		}
        }
	      answer = (12000*n+2000*k);	
        return answer;
    }
}