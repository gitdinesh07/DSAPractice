package Patters;
import java.util.Scanner;

/*
    Striver Raj - Pattern series question
 * https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
 * 
 * There are 4 general rules for solving a pattern-based question : 

    We always use nested loops for printing the patterns. For the outer loop, we count the number of lines/rows and loop for them.
    Next, for the inner loop, we focus on the number of columns and somehow connect them to the rows by forming a logic such that for each row we get the required number of columns to be printed.
    We print the ‘*’ inside the inner loop.
    Observe symmetry in the pattern or check if a pattern is a combination of two or more similar patterns or not.

    emp Ques: Q7, Q8 

 */
public class PrintPattern {
    
    public static void main(String[] args) {
       
        int patternRows = 5;
        //Print_8(patternRows);
        Print_21(patternRows);
    }


    public static void Print_1()
    {

        for(int i=1; i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("* ");
            }          
            System.out.println();
        }
    }
    
    public static void Print_2()
    {

        for(int i=1; i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }          
            System.out.println();
        }
    }
    
    public static void Print_3()
    {
        for(int i=1; i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }          
            System.out.println();
        }
    }

    public static void Print_4()
    {
        for(int i=1; i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }          
            System.out.println();
        }
    }

    public static void Print_5()
    {
        for(int i=5; i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }          
            System.out.println();
        }
    }

    public static void Print_6()
    {
        for(byte i=5;i>=1;i--)
        {
            for(byte j=1;j<=i;j++)
                System.out.print(j+" ");
            
            System.out.println();
        }
    }

    private static void Print_7(int rows) 
    {
        int iterateCount = rows;
        for(int i = 1; i<=iterateCount;i++) //for rows
        {
            for(int j=1;j<=iterateCount-i;j++) // for blank printing untill n-i
                System.out.print(" ");

            int printCount = (i * 2)-1;
            while(printCount != 0)//after blank print print "*"
            {
                System.out.print("*");
                printCount --;
            }

            //this is optional for print blank after the stars "*" print
            for(int j=1;j<=iterateCount-i;j++) // for after blank printing untill n-i
                System.out.print(" ");

            System.out.println();
        }
    }

    private static void Print_8(int rows)
    {
        for(int i=rows;i>=1;i--)
        {
            // for print the first spaces
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }

            // for print the "*" after the previous spaces
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * This pattern is just a mixture of the last two patterns ( erect pyramid and inverted pyramid). 
     * Firstly, we will print the erect pyramid and then an inverted pyramid 
     * @param rows
     */
    private static void Print_9(int rows)
    {
        Print_7(rows);
        Print_8(rows);
    }
    private static void Print_9_Optimized(int rows)
    {
        int stars = 1; //start with 1 star to print;
        for(int i=1;i<=rows;i++)
        {
            //for print stars
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }

            //for next row prep
            System.out.println();
            if(i<=rows/2) // increase of decrease of start print logic- if i goes mid then dec stars else inc stars
                stars++;
            else
                stars--;
        }
    }
    private static void Print_10(int rows)
    {
        int starsPrint = 1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=starsPrint;j++)
            {
                System.out.print("*");
            }

            if(i<=rows/2)
                starsPrint++;
            else
                starsPrint--;
            System.out.println();
        }
    }

    private static void Print_11(int rows)
    {
        for(int i=1;i<=rows;i++)
        {
            int printStart = i%2==0?0:1;   // logic of print 0 or 1 in starting
            for(int j=1;j<=i;j++)
            {
                System.out.print(printStart);
                printStart = 1- printStart; // logic of next 0 or 1 print
            }
            System.out.println();
        }
    }

    private static void Print_12(int rows)
    {
        int noPrintTimes = 1;
        int space = (rows*2)-2;
        for(int i=1;i<=rows;i++)
        {
            //number print
            for(int j=1;j<=noPrintTimes;j++)
            {
                System.out.print(j);
            }
            //space print
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            //number print
            for(int j=noPrintTimes;j>=1;j--)
            {
                System.out.print(j);
            }

            space = space -2;
            noPrintTimes ++;
            System.out.println();
        }
    }

    private static void Print_13(int rows)
    {
        int noPrint= 1;
        for(int i=1;i<=rows;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(noPrint);
                noPrint++;
            }
            System.out.println();
            
        }
    }

    private static void Print_14(int rows)
    {
        for(int i=1;i<=rows;i++)
        {
            char print = 65;
            for(int  j=1;j<=i;j++)
            {
                System.out.print(print);
                print++;
            }
            System.out.println();
        }
    }

    private static void Print_15(int rows)
    {
        for(int i=rows;i>=1;i--)
        {
            char charPrint = 65;
            for(int j=1;j<=i;j++)
            {
                System.out.print(charPrint);
                charPrint++;
            }
            System.out.println();
        }
    }

    private static void Print_16(int rows)
    {
        char charPrint = 65;
        for(int i=1;i<=rows;i++)
        {   
            for(int j=1;j<=i;j++)
            {
                System.out.print(charPrint);
            }
            charPrint++;
            System.out.println();
        }
    }

    private static void Print_17(int rows)
    {
        int space = rows - 1;
        int innerPrint = 1;
        for(int i=1;i<=rows;i++)
        {
            //print space
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            //print char
            char charPrint = 65;
            
            for(int j=1;j<=innerPrint;j++)
            {
                System.out.print(charPrint);
                if(j<=innerPrint/2)
                    charPrint++;
                else
                    charPrint --;
            }
            space--;
            innerPrint = innerPrint+2;
            System.out.println();
        }
    }

    private static void Print_18(int rows)
    {
        
        for(int i=1;i<=rows;i++)
        {
            char printChar = (char)(65+rows-i);
            for(int j=1;j<=i;j++)
            {
                System.out.print(printChar+" ");
                printChar++;
            }
            System.out.println();
        }
    }

    private static void Print_19(int rows)
    {
        int printStars = rows;
        int printSpaces = 0;
        for(int i=1;i<=rows*2;i++)
        {
            for(int j=1;j<=printStars;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=printSpaces;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=printStars;j++)
            {
                System.out.print("*");
            }

            if(i != rows)
            {
                if(i<=rows)
                {
                  printSpaces +=2;
                  printStars --;  
                }
                else
                {
                    printSpaces -=2;
                    printStars ++;  
                }
            }
            System.out.println();         
        }
    }

    private static void Print_20(int rows)
    {
        int printStars = 1;
        int printSpace = (rows-1)*2;
        for(int i=1; i<rows*2;i++)
        {
            for(int j=1;j<=printStars;j++)
            {
                System.out.print("*");
            }
            
            for(int k=1;k<=printSpace;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=printStars;j++)
            {
                System.out.print("*");
            }
          
            if(i<rows)
            {
                printSpace -=2;
                printStars ++; 
            }
            else
            {
                printSpace +=2;
                printStars --; 
            }
            System.out.println();
        }
    }

    private static void Print_21(int rows)
    {
        for(int k=1;k<=rows;k++)
        {            
            for(int j=1;j<=rows;j++)
            {
                if(j==1 || j==rows || k ==1 || k == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            } 
            System.out.println();            
        }
    }

    private static void Print_22(int rows)
    {
        int row = rows*2-1;
        int column = rows*2-1;

        for(int i=1;i<=row;i++)
        {
            
        }
    }
}
