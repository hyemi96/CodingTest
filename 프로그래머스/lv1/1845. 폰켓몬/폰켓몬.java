import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0; //내가 고를 수 있는 최대 종류의 마리의 수
            
        int mypoketCnt = nums.length / 2 ; //내가 가질 수 있는 마리 수
        
        HashSet nums2 = new HashSet();
        int nums2Cnt = 0; //중복이 제거된 종류의수
        
        nums2.add(nums[0]); //최초하나를 넣은 상태에서 수행한다.
        //왜냐하면 {3,3,3,3} 이런경우 아래 코드를 수행하지 않기 때문에
        
        for(int i = 0; i < nums.length; i++){
            for(int j= 0; j< nums.length; j++){
                if(nums[j] != nums[i]){
                     nums2.add(nums[j]);
                 }              
            }
        }
        System.out.print(nums2);
        nums2Cnt = nums2.size();
        
        //중복이 제거된 배열 내에서 내가 가질 마리수를 선택한다.        
        if(nums2Cnt < mypoketCnt){ 
        //만일 내가 가질 수 있는 마리는 3마린데 중복제거된 배열이 2개뿐이라면 배열의 수가 답
            answer = nums2Cnt;
        }else{ //만일 내가 가질 수 있는 마리는 3마리고 중복제거 된 배열이 더 많다면 mypoketCnt
          answer = mypoketCnt;  
        }

        return answer;

    }
}