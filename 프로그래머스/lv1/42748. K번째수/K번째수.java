import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};       
        int k = 0;
        answer = new int[commands.length];
        
        List<List> list1 = new ArrayList<>();

        for (int i =0; i < commands.length ; i++){
            List<Integer> list2 = new ArrayList<>(); //블록변수로 선언 : 리스트를 끊고 새로 만들기위함
            for (int e = commands[i][0]-1; e < commands[i][1]; e++){
                list2.add(array[e]);
                //System.out.println(list2);
            }
            Collections.sort(list2);
            list1.add(list2);
        }
        
        for(int a = 0; a <commands.length; a++){
            k = commands[a][2]-1;
            //list2.get(k).intValue();
            //list1.get(a).get(k);
            answer[a] = (int)list1.get(a).get(k); //오브젝트를 int형 변환방법
        }
        //System.out.println(answer);    
    
        return answer;
    }
}