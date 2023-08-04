//import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] splitter = a.split("|");

        for (int i=0; i < splitter.length; i++) {
            String str =  splitter[i];            
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