class Solution {
    public int solution(int[] num_list) {
        int n_sum = 0;
        int n_mul = 1;
        int answer = 0;
        
        if(num_list.length>=11){
            for(int i = 0; i < num_list.length; i++){
                n_sum += num_list[i];
                 answer = n_sum;
            }
        } else {
            for(int i = 0; i < num_list.length; i++){
                n_mul *= num_list[i];
                 answer =  n_mul;
            }
        }
   return answer; } 
}