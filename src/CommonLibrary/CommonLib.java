package CommonLibrary;

public class CommonLib {
    
    public static void Swap(int val1, int val2)
    {
        int temp = val1;
        val1= val2;
        val2 = temp;
    }
    public static void Swap(int val1, int val2, int[] array)
    {
        int temp = array[val1];
        array[val1]=array[val2] ;
        array[val2] = temp;
    }
    public static void PrintArray(int[] array)
    {
        for (int i : array) {
            System.err.print(i+" ");
        }
    }
}
