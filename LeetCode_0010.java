public class LeetCode_0010 {
   /*
   Problem:-Valid Palindrome
   Link:-https://leetcode.com/problems/valid-palindrome/description/

   Statement:-
   A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

Solution:-

    */ 
    class Solution {
        public boolean isPalindrome(String s) {
            // s=s.toLowerCase();
            // s=s.replaceAll("\\s","");
            // s=s.replaceAll("[^a-zA-Z0-9]","");
    
            // int i=0;
            // int j=s.length()-1;
    
            // while(i<j){
            //     if(s.charAt(i)!=s.charAt(j)){
            //         return false;
            //     }else{
            //         i++;
            //         j--;
            //     }
            // }
            // return true;
    
            //Using Recursion
            s=s.toLowerCase();
            s=s.replaceAll("\\s","");
            s=s.replaceAll("[^a-zA-Z0-9]","");
    
            
            return check(s,0,s.length()-1);
             
        }
        public boolean check(String s, int start, int end)
        {
            if(start>=end){
                 return true;
             }
    
            return ( s.charAt(start)==s.charAt(end)) && check(s,start+1,end-1);
        }
    }
    
    
}
