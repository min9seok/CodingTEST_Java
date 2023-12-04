class Solution {
    public static String[] solution(String my_str, int n) {
//    	int answerlength = (my_str.length())/n; 
    	int answerlength = (int) Math.ceil((double)my_str.length()/n);
    	String[] answer = new String[answerlength];
    	int beginIndex=0 , endIndex;
    	String str = null;
    	int my_strlength = my_str.length();
    	int index=0;
    	while(index != answerlength) {
    		endIndex = beginIndex+n;    		
    		if(endIndex > my_strlength) {
    			endIndex = my_strlength;
    		}    		
    		str = my_str.substring(beginIndex,endIndex);
    		answer[index++] = str;
    		beginIndex = endIndex;
    	}
//    	String a = my_str.substring(0,6);
//    	System.out.println(a);
//    	a = my_str.substring(6,12);
//    	System.out.println(a);
//    	a = my_str.substring(12,16);
//    	System.out.println(a);
		return answer;
    } 
}