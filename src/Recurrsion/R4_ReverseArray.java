package Recurrsion;
import CommonLibrary.*;

public class R4_ReverseArray {
    
    public static void main(String[] args) {
        
       
        // int array[] = new int[]{1,2,3,4,5};
        // CommonLib.PrintArray(array);
        //ReverseArray(0, array.length-1, array);
        // ReverseArrayWithSinglePointer(0, array);
        // System.out.println("Reverse the array");
        // CommonLib.PrintArray(array);
        String name = "dad";
        CheckPalindrom(0, name);
    }

    public static void ReverseArray(int left, int right, int[] array)
    {
        if(left>=right)
            return;
        
        CommonLib.Swap(left++,right--, array);
        ReverseArray(left, right, array);
    }
    
    public static void ReverseArrayWithSinglePointer(int left, int[] array)
    {
        int right = (array.length-1)-left;
        if(left>=right)
            return;
        
        CommonLib.Swap(left++,right--, array);
        ReverseArray(left, right, array);
    }
    
    public static void CheckPalindrom(int passCount, String value)
    {
        if(passCount >= (value.length()/2))
        {
            System.out.println(value+ "- is palindrome");
            return;
        }
        else if(value.charAt(passCount) != value.charAt((value.length()-1)-passCount))
        {
            System.out.println(value+"- is not a palindrome");
            return;
        }
        CheckPalindrom(++passCount, value);
    }
}
