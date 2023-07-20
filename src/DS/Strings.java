package DS;

import java.util.Arrays;
import java.util.Collections;

public class Strings {
    public static void main(String[] args) {
        var ans = largestOddNumber("35427");
        System.out.println(ans);
    }

    public static String largestOddNumber(String num) {
        /*https://leetcode.com/problems/largest-odd-number-in-string/
         * check from left side if any odd number occure then rest of number is odd and we have to return it
         * also ASCII char play a wide role to type casting
         */
        for(int i=num.length()-1;i>=0;i--)
        {
            if(num.charAt(i)%2 !=0) //num.charAt(i) convert into ASCII value and find the modulo 0-9 ascii value also even or odd as per this value like value 7 ascii value = 55 so both are odd
            {
                return num.substring(0,i+1);
            }
        }

        return "";
    }
    
    public boolean isPalindrome(String s)
    {
        return false;
    }
    
    //https://leetcode.com/problems/valid-palindrome/
    public boolean isWholeWordPalindrome(String s)
    {
        return false;
    }
    
    //https://leetcode.com/problems/reverse-words-in-a-string/
    public String ReverseWords(String s)
    {
        return null;
    }
    
    //https://leetcode.com/problems/reverse-words-in-a-string/
    public String ReverseWordsWithSTL(String s)
    {
        //remove extra spaces in string
        s = s.trim();
        
        //split the words into array
        var arr = s.split("\\s+");  // "\\s+" here \\s means space and + means extra spaces
        
        // convert array into list becoz we need to use STL which not work with arrays
        var list = Arrays.asList(arr);

        //reverse the list now
        Collections.reverse(list);

        //return the list with join " "
        return String.join(" ", list);
    }
}

