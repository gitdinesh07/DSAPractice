package MathQuestion;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class NumberSystem {
    
    public static void main(String[] args) {
        int num = 00012;
        System.out.println(num);
        IsPrimeNumber_BruteForce(num);
        IsPrimeNumber_Optimized(num);
    }

    public static void SumOfNaturalNum()
    {
        System.out.println("enter a number");
        var scn = new Scanner(System.in);
        int val = scn.nextInt();
        int sum= 0;
        if(val > 0)
        {
            for(int i = 1;i<=val;i++)
                sum += i;
        }       
        System.out.println(sum);
    }

    public static void ReverseInteger()
    {
        System.out.println("enter a number");
        var scn = new Scanner(System.in);
        int inputValue = scn.nextInt();
        int ans= 0;
        if(inputValue > 0)
        {
           while(inputValue > 0)
           {
                int reminder = inputValue%10;
                ans = ans * 10 + reminder;
                inputValue = inputValue/10;
           }
        }       
        System.out.println(ans);
    }

    public static void IsPrimeNumber_BruteForce(int num)
    {
        /*
         * iterate untill num -1 and check if found diviser then exit 
         */
        boolean isPrime = true;
        int count =0;
        if(num > 0)
        {
            if(num > 1)
            {             
                for(int i=2;i<num;i++)
                {
                    count ++;
                    if(num % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }  
            }
        if(isPrime)
            System.out.println(num+" is prime number /n found in interation of: "+count);
        else
            System.out.println(num+" not a prime number/n found in interation of: "+count);
        }
        else
            System.out.println(num+" invlid for prime number");
    }
    
    public static void IsPrimeNumber_Optimized(int num)
    {
        /*
         * given input num / 2 and iterate untill (num/2) and check if found diviser then exit 
         * else we say its Prime no
         */
        boolean isPrime = true;
        int count =0;
        if(num > 0)
        {
            if(num > 1)
            {            
                int till = num/2; 
                for(int i=2;i<till;i++)
                {
                    count ++;
                    if(num % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }  
            }
        if(isPrime)
            System.out.println(num+" is prime number /n found in interation of: "+count);
        else
            System.out.println(num+" not a prime number/n found in interation of: "+count);
        }
        else
            System.out.println(num+" invlid for prime number");
    }
   
}
