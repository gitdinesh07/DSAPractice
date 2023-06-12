package Recurrsion;

public class R2_PrintNTimes {

    public static void Main()
    {
        var obj = new R2_PrintNTimes();
        //obj.PrintNames(3);
        obj.PrintReverseByBackTracking(3);
    }
    public void PrintNames(int printCount)
    {
        //base condition
        if(printCount < 1)
            return;

        System.out.println("dinesh: "+printCount);
        PrintReverseByBackTracking(printCount - 1);
    }

    //print 1 to N but not allow increment like PrintReverse(count+1);
    public void PrintReverseByBackTracking(int count)
    {
        if(count < 1)
            return;

        PrintReverseByBackTracking(count - 1);  //first recursive call
        System.out.println(count); // then print count its start printing when going to base cond. met
    }
}
