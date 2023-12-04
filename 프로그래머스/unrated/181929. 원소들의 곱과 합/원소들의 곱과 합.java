class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum = 0;
        int answer2 = 1;
        int length = num_list.length;
        for(int i=0; i<length; i++){
            answer *= num_list[i];
        }
        for(int i=0; i<length; i++){
            sum += num_list[i];            
        }
        answer2 = (sum*sum);
        if(answer > answer2){
          return 0;    
        }else{
          return  1;
        }
      
    }
}