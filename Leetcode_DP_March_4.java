/**
 * Leetcode_DP_March_4
 */
import java.util.*;
import java.math.*;

public class Leetcode_DP_March_4 {

    public static void main(String[] args) {
        int[] tokens = {68,85,34,25,60};
        int power=44;
        int score = 0;
        int left=0,right=tokens.length-1;
        int maxscore=0;
        Arrays.sort(tokens);
        
        while(right>=left){
        
            if(tokens[left]<=power){
                power-=tokens[left];
                score++;
                left++;
                maxscore = Math.max(maxscore,score);
            }
            else if(score>0){
                power+=tokens[right];
                score--;
                right--;
            }else{
                break;
            }
        }
        
        System.out.println("maxscore : "+maxscore);
        System.out.println("power : "+power);

    }
}