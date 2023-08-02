public class LeetCode_0007 {
    class Solution {
        public int bitwiseComplement(int n) {

            /*Problem:- Complement Of Base 10 Integer

            Link:-https://leetcode.com/problems/complement-of-base-10-integer/description/
             * 
             */
            // int m=n;
            // int mask=0;
    
            // //edge Case
            // if(n==0){
            //     return 1;
            // }
            // while(m!=0){
            //     mask=(mask << 1) |1;
            //     m=m>>1;
    
            // }
            // int ans=(~n)&mask;
            // return ans;

            //Solution:-
    
            String S=Integer.toBinaryString(n);
            String t="";
            for(int i=0; i<S.length(); i++){
                if(S.charAt(i)=='1'){
                    t+='0';
                }else{
                    t+='1';
                }
    
            }
            n=Integer.parseInt(t,2);
            return n;
    }
    }
    
}
