/*2. Write a program to accept 3 digits and print all possible
combination of these three digits.
(For example if three digits are 1, 2 and 3 then all possible
combinations are 123,132,231,213,321 and 312)

a=1 b=2 c=3

1*100+2*10+3
1*100+3*10+2
2*100+1*10+3
2*100+3*10+1
3*100+1*10+2
3*100+2*10+1

*/

import java.util.Scanner;
class Test
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter 1st number :: ");
        int a = myObj.nextInt();
        System.out.print("Enter 2nd number :: ");
        int b = myObj.nextInt();
        System.out.print("Enter 3rd number :: ");
        int c = myObj.nextInt();
        System.out.println(a*100+b*10+c);
        System.out.println(a*100+c*10+b);
        System.out.println(b*100+a*10+c);
        System.out.println(b*100+c*10+a);
        System.out.println(c*100+a*10+b);
        System.out.println(c*100+b*10+a);
        myObj.close();
    }
}

/**
 * Works well when all 3 values are different, but when if any 2 or 3 digits are same redundant values are seen
 */