class Solution {
    public void reverseString(char[] s) {
    // two pointers approach

    int j = s.length - 1;

    for(int i = 0; i < j; i++)
    {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        j--;
    }

    }
}
// String
// 344
