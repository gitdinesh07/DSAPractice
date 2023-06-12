package Recurrsion;

import java.lang.module.FindException;

public class R5_MultipleRecurssion {
    public static void main(String[] args) {
        int n = 4;
        int nThFib = FindNthFibonacciNo(n);
        System.out.println(n+"th fibonacci is : "+nThFib);
    }
    /*
     * exam: 0,1,1,2,3,5
     * FindNthFibonacciNo(4)-> 7 (0+1+1+2+3)
     */
    public static int SumOfFibonacciNo(int n)
    {
        if(n<=1)
            return n;

        return SumOfFibonacciNo(n-1) + SumOfFibonacciNo(n-2);
    }
    /*
     * exam: 0,1,1,2,3,5
     * FindNthFibonacciNo(4)-> 3
     */
    public static int FindNthFibonacciNo(int n)
    {
        if(n<=1)
            return n;

        return FindNthFibonacciNo(n-1)+FindNthFibonacciNo(n-2);
    }
}
