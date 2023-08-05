# LeetCode
## Roman to Integer
``` Java
public int romanToInt(String s) {
    // Create a hashmap to store the value of each Roman numeral symbol
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    
    int result = 0;
    int prev = 0;
    
    // Iterate over each character in the string from right to left
    for (int i = s.length() - 1; i >= 0; i--) {
        int current = map.get(s.charAt(i));
        
        // Check if the current symbol is less than the previous symbol
        if (current < prev) {
            result -= current;
        } else {
            result += current;
        }
        
        prev = current;
    }
    
    return result;
}
```
## Palandrome Number
```Java
class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder(String.valueOf(x));
        System.out.println(str);

        //str.reverse() permaently changes the order of the characers
        if(String.valueOf(str.reverse()).equals(String.valueOf(x)))
            return true;
        return false;
    }
}
```
## Longest Prefix
```Java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
```


## Merge Two Sorted List
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
```Java
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }
}
```

## Valid Palindrome II
Given a string s, return true if the s can be palindrome after deleting at most one character from it.
```Java
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }
    
    /* Check is s[i...j] is palindrome. */
    private boolean isPalindrome(String s, int i, int j) {
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    ```
