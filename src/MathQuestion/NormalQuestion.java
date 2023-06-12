package MathQuestion;

public class NormalQuestion {
    
    public static void main(String[] args) {
        FibonacciFirstToN(8);
        System.out.println("");
        FibonacciTillN(8);
    }

    /*
     * print Fibonacci to the N times
     */
    public static void FibonacciFirstToN(int n)
    {
        int nextTerm = 0;
        int firstTerm = 0;
        int secondTerm = 1;

        int count = 0;
        while(count<n)
        {
            System.out.print(firstTerm+" ");
            nextTerm = firstTerm+secondTerm;

            firstTerm = secondTerm;
            secondTerm = nextTerm;

            count ++;
        }
    }

    /**
     * print Fibonacci to the or less than N value
     * @param n
     */
    public static void FibonacciTillN(int n)
    {
        int nextTerm = 0;
        int firstTerm = 0;
        int secondTerm = 1;

        int count = 0;
        while(nextTerm<=n)
        {
            System.out.print(firstTerm+" ");
            nextTerm = firstTerm+secondTerm;
            
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            count ++;
        }
    }
}
