class Solution {
    public int lengthOfLongestSubstring(String s) {
        // two pointers
        // use second pointer to iterate through characters
        // use first pointer to check the duplicates, if duplicate is found move the pointer

        int firstP = 0;
        int SecondP = 0;
        int maxLength = 0;

        // using HashSet to make seek time faster
        HashSet<Character> hs = new HashSet<>();

        // iterate through all the characters of the string
        while (SecondP < s.length())
        {
            if(!hs.contains(s.charAt(SecondP)))
            {
                hs.add(s.charAt(SecondP));
                SecondP++;

                maxLength = Math.max(maxLength, hs.size());
            }
            else
            {
                hs.remove(s.charAt(firstP));
                firstP++;
            }
        }

        return maxLength;
       
    }
}
// string
// 3
