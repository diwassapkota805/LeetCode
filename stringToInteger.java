class Solution {
    public int myAtoi(String s) {
        int result = 0;
        char[] sArray = s.toCharArray();
        if (sArray.length == 0) {
            return 0;
        }
        
        int sign = 1;
        int i = 0;
        
        // Skip whitespace characters
        while (i < sArray.length && sArray[i] == ' ') {
            i++;
        }
        
        // Check the sign
        if (i < sArray.length && (sArray[i] == '+' || sArray[i] == '-')) {
            sign = (sArray[i] == '-') ? -1 : 1;
            i++;
        }
        
        // Convert digits to integer
        while (i < sArray.length && Character.isDigit(sArray[i])) {
            int digit = sArray[i] - '0';
            
            // Check for overflow before multiplying by 10
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return result * sign;
    }
}
// String
// 8
