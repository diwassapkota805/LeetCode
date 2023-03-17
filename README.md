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
