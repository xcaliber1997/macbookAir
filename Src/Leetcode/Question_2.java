public class Question_2 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int ans = 0 ;
            StringBuilder substring = new StringBuilder();
            String temp = null ;
            String [] temp_arr  = s.split("");
            for (int  i = 1 ; i<temp_arr.length-1 ; i++){
                String temp_two = temp_arr[i-1] ;
                String temp_three = temp_arr[i] ;
                substring.append(temp_two);
                ans = substring.length();
                if(temp_three.equals(temp_two)){
                    substring = new StringBuilder();
                }
                if(substring.length()!=0) {
                    for (int j = 0; j <= substring.length() ; j++){

                    }
                }
            }
            return ans;
        }
    }
}
