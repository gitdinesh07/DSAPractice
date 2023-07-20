package Recurrsion;

public class RandomQues {
    public static void main(String[] args) {
        
    }

    public int f(int[] arr, int inx)
    {
        if(inx >= arr.length)
            return 0;
        return Math.max(arr[inx]+f(arr,inx+2),0+f(arr,inx+1));
    }
}

//https://leetcode.com/problems/house-robber/

