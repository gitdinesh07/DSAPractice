package DS.Array;

import java.util.ArrayList;
import java.util.Arrays;

import CommonLibrary.CommonLib;

public class ArrayClass {
    
    public static void main(String[] args) {
        //int[] ary =new int[] {12, 13, 1, 10, 34, 34, 14};

        int[] ary =new int[] {1,2,3,4,5,6,7,8,9,10};
        

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);

    var as = removeDuplicates(arrayList,10);
    System.out.println("as is :"+ as);
        //var ans = RotateArray(ary, 2);
        //var ans = FindMiminum(ary);
        var ans1 = IsArraySorted(ary);
        System.out.println(ans1);
        var ans = FindSecondSmallestOptimized(ary,10);
        System.out.println(ans);
        ans = FindSecondSmallest(ary);
        //System.out.println(ans);
        //FindAllSubArray(ary);
        //CommonLib.PrintArray(ans);
    }

//#region easy

private static Boolean IsArraySorted(int[] ary)
{
    for(int i=1;i<ary.length;i++)
    {
        if(!(ary[i]>=ary[i-1]))
        {
            return false;
        }
    }
    return true;
}

    private static int FindSmallest(int[] ary)
    {
        int returnValue = Integer.MAX_VALUE;
        int aryLength = ary.length;
        if(aryLength>0)
        {
            for(int i=0;i<aryLength;i++)
            {
                if(ary[i]<returnValue)
                {
                    returnValue = ary[i];
                }
            }
        }
        return returnValue;
    }

    private static int FindSmallestUsingSort(int[] ary)
    {
        Arrays.sort(ary);
        return ary[0];
    }

    private static int FindLargest(int[] ary)
    {
        int LargeVal = Integer.MIN_VALUE;

        for(int i=0;i<ary.length;i++)
        {
            if(ary[i] > LargeVal)
            {
                LargeVal = ary[i];
            }
        }
        return LargeVal;
    }
//#endregion

//#region medium
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
    // Write your code here.

    int count = 1;
    int lastUniqueIndex = 0;
    for(int i=1; i<n;i++)
    {
        if(arr.get(i) != arr.get(lastUniqueIndex))
        {
            count++;
            lastUniqueIndex = i;
        }
    }
     return count;
   }
    // public static int RemoveDuplicateInPlace(int[] arr)
    // {

    // }
    private static int FindSecondSmallest(int[] ary)
    {
        /*
            Brute force 
         *  Method 1: By sorting the array in ascending order and then displaying the second element. (tc = log(N log(N)))
            
            Better than Brute force
            Method 2: By traversing the array twice. In the first traversal find the smallest element (x)
            and in the second traversal, skip x and find the next smallest element which is >x. (TC = log(2N))

            Method 3: By traversing the array single time and store then maximum element and if find another maximum element
            than before replace largest store this value as second largest;
            we are using 2 one
         */
        int firstMinimum = ary[0];
        int secondMinimum = Integer.MAX_VALUE;

        for(int i=0;i<ary.length; i++)
        {
            if(ary[i] < firstMinimum)
            {
                firstMinimum = ary[i];
            }
        }

        for(int i=0;i<ary.length; i++)
        {
            if(ary[i] > firstMinimum && ary[i]<secondMinimum)
            {
               secondMinimum = ary[i];
            }
        }
        return secondMinimum;
        // TC = O(2N)
    }

    private static int FindSecondSmallestOptimized(int[] ary, int n)
    {
        int smallest= ary[0], secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(ary[i]<smallest)
            {
                secondSmallest = smallest;
                smallest = ary[i];
            }
            else if(ary[i] > smallest && ary[i] < secondSmallest)
            {
                secondSmallest = ary[i];
            }
        }
        return secondSmallest;
    }
    
    private static int FindSecondLargestOptimise(int[] ary)
    {

        /* Method 3: By traversing the array single time and store then maximum element and if find another maximum element
            than before replace largest store this value as second largest;
         */
        int largest = ary[0], secondLargest = ary[0];
        for(int i=0;i<ary.length;i++)
        {
            if(ary[i]>largest)
            {   
                secondLargest = largest;
                largest = ary[i];
            } 
            else if(ary[i]<largest && ary[i] > secondLargest) // there will a case where second largest present in in last and that not biggest but could be second bigest like  {12, 13, 1, 10, 34, 34, 14}
            {
                secondLargest = ary[i];
            }
        }
        return secondLargest;

        //Tc = O(N)
    }
    
    private static int[] RotateArray(int[] ary, int rotateCount)
    {
        /*
         * first find the mode between rotatation count and array length which gives you smallest rotatation.
         * for exam if ary length = 4 and rotation need be done 7 no need to rotate 7 times just find mode its gives you 3 so rotation need 
         * to be only 3 times bcoz value which gives you 7 times rotation that similar to 3.
         * 
         * if after mode or else rotate value in Negative(-) then that negative value should add in Array length then it will return
         * positive (+) value exam if value = -8 and array length 4 then -8+4=4 then rotatation will done onyy 4 times.
         */
        rotateCount = rotateCount%ary.length; 
        if(rotateCount <0)
        {
            rotateCount = rotateCount + ary.length;
        }
        while(rotateCount>0)
        {
            int temp = ary[ary.length-1];
            for(int i=0;i<ary.length;i++)
            {
                int temp2 = temp;
                temp = ary[i];
                ary[i]=temp2;
            }
            rotateCount--;
        }
        
        return ary;
    }

    private static void FindAllSubArray(int[] ary)
    {
        int length = 1;

        //while(length > )
        {
            for(int i=0;i<length;i++)
            {
                System.out.print(ary[i]+" ");
            }
            length--;
            System.out.println();
        }
    }
//#endregion
}
