import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
       
        List<Integer> list = new ArrayList<>(); 
        
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){            
            if(arr[i-1] != arr[i]){
                list.add(arr[i]);
            }                 
        }
        answer = new int[list.size()];
        for(int e= 0; e<list.size(); e++){
            answer[e] = list.get(e).intValue();
        }

        return answer;
        
    }
}
            