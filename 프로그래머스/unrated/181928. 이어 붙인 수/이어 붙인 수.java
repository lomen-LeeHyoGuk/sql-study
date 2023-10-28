class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd_n = "";
        String even_n = "";
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i]%2==1){
                odd_n += Integer.toString(num_list[i]);
            } else {
                even_n += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(even_n) + Integer.parseInt(odd_n);
        return answer;
    }
}