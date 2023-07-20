package MathQuestion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class NumberSystem {
    
    public static void main(String[] args) {
        int num = 113;
        //System.out.println(num * -2);
        // IsPrimeNumber_BruteForce(num);
        // IsPrimeNumber_Optimized(num);
        IsPrimeNumer_max_optimized(num);
        //System.out.println(reverse(num)); //reverse(num);
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
   
    public static void IsPrimeNumer_max_optimized(int num)
    {
        /*
         * we are optimized using Square root functionality for this given number.
         * let we have given number as 16 so square root of = 4 so we have to check untill 4 from 1 to get all
         * the FACTORS for 16 bcoz. to get all FACTORS we have to take Modulo (%) if 16%1-4 or 16/1-4 
         * 1*16 = 1, 16
         * 2*8 = 1,8
         * 4*4 = 4 
         * above is the all factors of 16 
         */

         var sqrt = Math.sqrt(num);
         boolean isPrime = true;
         for(int i=2;i<sqrt;i++)// here you can also do instead of Square root function for(int i=1; (i*i) <=n; i++)
         {
            if(num%i == 0)
                isPrime = false;
         }
         System.out.println(num+" is a prime number? :"+isPrime);
    }
    
    public static void CountNumbers(int digit)
    {
        int n = digit;
        int count = 0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        System.out.println(digit+" having "+count+ " digits.");
    }

    public static int ReverseNumber(int num)
    {
        int reverse =0 ;
        if(num > 1)
        {
            int n = num;
            
            while(n>0)
            {
                reverse = (reverse * 10)+n%10;
                n = n/10;
            }
            System.out.println(num+" reverse number is : "+reverse);
        }
        return reverse;
    }

    public static void CheckPalindrome(int num)
    {
        System.out.println("give number is : "+num);
        int reverseNum = ReverseNumber(num);

        //for(int i)
    }
    
    public static int reverse(int x) 
    {
        int returnNum = 0;
        boolean isNegative = x < 0;
        int n = x;

        if(isNegative) 
            n = (n*-2) + n;

        while(n>0)
        {
            if((int)returnNum*10 < Integer.MAX_VALUE)
            {
                returnNum = returnNum*10+(n%10);
                n= n/10;
            }
            else
            {
                n = 0;
                returnNum = 0;
            }
           
        }
        if(isNegative)
            returnNum = returnNum + (returnNum * -2);
        return returnNum;
    }

    public static void isArmstrongNumber(int num)
    {
        boolean isAms = false;
        if(num > 0)
        {
            int sum = 0;
            int n = num;
            while(n>0)
            {
                int a = (n%10);
                sum += a*a*a;
                n /=10;
            }
            isAms = num == sum;
        }

        System.out.println(num+ " is Armstrong Number :"+isAms);
    }

    private static void PrintAllDivisor(int n)
    {
        int r = n/2;
        System.out.print("1,");
        while(r>1)
        {
            if(n%r == 0)
                System.out.print(r+",");
            r--;
        }
        System.out.print(n);
    }
    
    private static void PrintAllDivisor_Optimized(int n)
    {
        /*
         * exam: 36 given- square root of 36 = 6 then strat 1-6 and with multiply of 1,2,3...till 6 where multiple lies 
         * = 36 like 3*12, 2*18, 4*9 etc and take both number bcoz these both no repeat again so we dont have to repeat
         * here square root help us you will after 6 multiple of 9, 12 and see above line we already have taken.
         * Note: make sure 6 does not repeat twice bcoz 6*6 so we have to take only 1 time of 6;
         */
        int r = (int) Math.sqrt(n); // here is the hack 
        List<Integer> itemList = new ArrayList<Integer>();
        
        itemList.add(1);
        while(r>1)
        {
            if(n%r == 0)
            {
                itemList.add(r);
                if(r != n/r)
                    itemList.add(n/r); // and here is the hack
            }              
            r--;
        }
        itemList.add(n);
        Collections.sort(itemList);
        System.out.print(itemList);
    }
}
