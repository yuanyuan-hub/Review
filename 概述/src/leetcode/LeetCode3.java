package leetcode;

public class LeetCode3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int x = lengthOfLongestSubstring(s);
        System.out.println(x);
    }

    private static int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;
        if(s.length() == 1) return 1;
        char[] arr = s.toCharArray();
        int index = 1;
        int max = 0;
        for(int i = 0 ; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(arr[i] != arr[j]) {
                    index++;
                } else {
                    break;
                }
            }
            if(max < index) {
                max = index;
            }
            index = 1;
        }
        return max;
    }
}
