class Solution {
    public int solution(int n) {
        int answer = 0;
        		 String temp = Integer.toString(n);
		 char[] ctemp = new char[temp.length()];
		 for (int j = 0; j < temp.length(); j++) {
			 ctemp[j] +=	temp.charAt(j);			
			 answer += ctemp[j]-'0';
			 
		}
        return answer;
    }
}