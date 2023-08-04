import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] splitter = a.split("|"); //문자 |를 검색하여 문자하나씩 구분되도록했는데 다른방법이 있을것 같다.

        for (String str : splitter) {           
            //소문자면 대문자로
            if(str.equals(str.toLowerCase())){
                System.out.print(str.toUpperCase());
            //대문자면 소문자로    
            }else {
                System.out.print(str.toLowerCase());
            }
        }
    }
}