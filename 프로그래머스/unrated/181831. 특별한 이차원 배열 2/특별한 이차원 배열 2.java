class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if(arr[i][j] != arr[j][i]){
                    return 0 ; //즉시 0을 반환하고
                }else{
                    answer =1; //for문을 다 수행할때까지 1이면 ture로 1을 반환
                }
            }
        }  
        return answer;
    }
}