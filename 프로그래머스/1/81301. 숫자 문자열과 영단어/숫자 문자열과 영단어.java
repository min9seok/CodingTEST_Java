class Solution {
    public int solution(String s) {
        int answer = 0;
        		 if(s.contains("one")) {
			 s = s.replace("one", "1");
			 System.out.println(s);
//			 answer = Integer.parseInt(s.replace("one", "1"));
		 } if(s.contains("two")) {			 
			 s = s.replace("two", "2");			 
//			 answer = Integer.parseInt(s.replace("two", "2"));
		 } if(s.contains("three")) {
			 s = s.replace("three", "3");
//			 answer = Integer.parseInt(s.replace("three", "3"));
		 } if(s.contains("four")) {
			 s = s.replace("four", "4");
//			 answer = Integer.parseInt(s.replace("four", "4"));
		 } if(s.contains("five")) {
			 s = s.replace("five", "5");
//			 answer = Integer.parseInt(s.replace("five", "5"));
		 } if(s.contains("six")) {
			 s = s.replace("six", "6");
//			 answer = Integer.parseInt(s.replace("six", "6"));
		 } if(s.contains("seven")) {
			 s = s.replace("seven", "7");
//			 answer = Integer.parseInt(s.replace("seven", "7"));
		 } if(s.contains("eight")) {
			 s = s.replace("eight", "8");
//			 answer = Integer.parseInt(s.replace("eight", "8"));
		 } if(s.contains("nine")) {
			 s = s.replace("nine", "9");
//			 answer = Integer.parseInt(s.replace("nine", "9"));
		 } if(s.contains("zero")) {
			 s = s.replace("zero", "0");
//			 answer = Integer.parseInt(s.replace("zero", "0"));
		 }
		 answer = Integer.parseInt(s);
        return answer;
    }
}