import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_DP_March_8 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for (int freq : hm.values()) {
            maxFreq = Math.max(freq, maxFreq);
        }

        for(int freq : hm.values()){
            if (freq==maxFreq) {
                count+=maxFreq;               
            }
        }

        System.out.println(count);
    }
}
