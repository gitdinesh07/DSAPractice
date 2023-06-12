package Recurrsion;

import java.text.MessageFormat;

public class R3_PrintSumOfN {

    public static void main(String[] args) {
        System.out.println("Hello and welcome Dinesh!\n\n");
        
        int n = 4;
        var obj = new R3_PrintSumOfN();
        //obj.PrintNames(3);
        System.out.println(MessageFormat.format("sum of {0} is {1} using SumOfNWithoutParam",n, obj.SumOfNWithoutParam(n)));
        //obj.SumOfNWIthParam(n,0);
        System.out.println(MessageFormat.format("factorial of {0} is {1}",n, obj.FactorialOfN(n)));

    }
    
    public int SumOfNWithoutParam(int n)
    {
        if(n==1)
            return n;
        return n+SumOfNWithoutParam(n-1);
    }

    public void SumOfNWIthParam(int n, int sum)
    {
        if(n==1) {
            System.out.println(sum + 1);
            return ;
        }
        SumOfNWIthParam(n-1,sum+n);
    }
    
    public int FactorialOfN(int n)
    {
        if(n==1)
            return n;
        return n*FactorialOfN(n-1);
    }
}
