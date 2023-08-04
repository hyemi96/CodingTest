class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        String strFrist[] = str1.split("");
        String strTwo[] = str2.split("");
        
        for(int i=0; i < strFrist.length; i++ ){
            answer += strFrist[i];
            answer += strTwo[i];
        }
        
        return answer;
    }
}