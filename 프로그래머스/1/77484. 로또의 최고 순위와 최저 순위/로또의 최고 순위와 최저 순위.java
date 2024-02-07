class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {             
        int[] answer = {0,0};
        for(int i = 0; i<lottos.length; i++ ){
              if(lottos[i] == 0){
                  answer[0] += 1;   
               }
           for(int j = 0; j<win_nums.length; j++){
               if(lottos[i] == win_nums[j]){
                   answer[0] += 1;
                answer[1] += 1;   
               }                             
           }
        }
        if(answer[0] == 6 ){
            answer[0] = 1;
        }else if(answer[0] == 5 ){
            answer[0] = 2;
        }
        else if(answer[0] == 4 ){
            answer[0] = 3;
        }
        else if(answer[0] == 3 ){
            answer[0] = 4;
        }
        else if(answer[0] == 2 ){
            answer[0] = 5;
        }
        else{
            answer[0] = 6;            
        } 
        if(answer[1] == 6){
            answer[1] = 1;
        }else if(answer[1] == 5){
            answer[1] = 2;
        }
        else if( answer[1] == 4){
            answer[1] = 3;
        }
        else if(answer[1] == 3){
            answer[1] = 4;
        }
        else if(answer[1] == 2){
            answer[1] = 5;
        }
        else{
            answer[1] = 6;            
        } 
        return answer;
    }
}