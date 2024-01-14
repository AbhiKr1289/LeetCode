/*
 Topic:- Valid Anagram

 Link:-https://leetcode.com/problems/valid-anagram/description/

 Problem:-
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
Solution:-
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        //0 to 25 index size array of alphabet
        int[] alphabet = new int[26];
        
        for (int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;

        } 
        for (int i = 0; i < t.length(); i++){
            alphabet[t.charAt(i) - 'a']--;

        } 
        for (int ele : alphabet) {
        if (ele != 0) return false;
        }
        return true;
    }
}
