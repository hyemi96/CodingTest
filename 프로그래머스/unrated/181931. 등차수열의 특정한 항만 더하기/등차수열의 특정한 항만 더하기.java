class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        //included 길이 만큼 폴문을 돌려 투
        for (int i=0; i < included.length; i++){
            if(included[i]){
               //a += d * i;
               answer += a + d * i;
            }
        }
        return answer;
    }
}