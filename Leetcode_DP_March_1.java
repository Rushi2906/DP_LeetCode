//2864. Maximum Odd Binary Number
//https://leetcode.com/problems/maximum-odd-binary-number/?envType=daily-question&envId=2024-03-01



import java.util.Scanner;
import java.util.Arrays;


public class Leetcode_DP_March_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='1'){
                count++;
            }
        }

        char[] chars = s.toCharArray();

        for(int i=0;i<chars.length;i++){
            chars[i]='0';
        }

        for(int i=0;i<=chars.length;i++){
            if(count>1){
                chars[i]='1';
                count--;
            }else{
                chars[chars.length-1]='1';
                break;
            }
        }
        String temp = new String(chars);
        System.out.println(temp);
    }
}