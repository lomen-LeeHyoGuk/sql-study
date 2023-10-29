class Solution {
    public int solution(String s) {
        String[] tmp = {"zero","one","two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<tmp.length; i++) {
            if(s.contains(tmp[i])){
                s = s.replace(tmp[i], Integer.toString(i));
            }
        }
        return Integer.parseInt(s);
    }
}