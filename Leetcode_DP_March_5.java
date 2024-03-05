import java.io.Console;

public class Leetcode_DP_March_5 {
    public static void main(String[] args){
        String s ="abcdba";
        int left=0;
       int right=s.length()-1;
       while(left<right){
           if(s.charAt(left)!=s.charAt(right)){
               break;
           }

           char ch = s.charAt(left);
           while(left<=right && s.charAt(left) == ch){
               left++;
           }
           while(left<=right && s.charAt(right) == ch){
               right--;
           }
       }
       int ans = right-left+1;
        System.out.println(ans);
       
    }
}
