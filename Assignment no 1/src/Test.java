/*1. Accept a integer number and when the program is executed
print the binary,octal and hexadecimal equivalent of the given
number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Note:-Refer Java Documentation and look for the appropriate Wrapper class method
*/

//1. Scanning an integer
//2. Printing that integer in decimal form
//3. Printing that integer in binary, octal and hexadecimal form
//
//decimal to binary -> keep dividing quotient by 2
//rem=20%2=0
//quo=20/2=10
//rem=10%2=0
//quo=10/2=5
//rem=5%2=1
//quo=5/2=2
//rem=2%2=0
//quo=2/2=1
//rem=1%2=1
//quo=1/2=0

////Using Traditional Method : 
//import java.util.Scanner;
//public class Test {
//	public static void main(String[] args) {
//		Scanner myObj = new Scanner(System.in);
//		System.out.println("Enter a decimal no. : ");
//		int num = myObj.nextInt();
//		int rem, quo, bin = 0, i = 1;
//		while (num != 0) {
//			rem = num % 2;
//			quo = num / 2;
//			num = quo;
//			bin = rem*i+bin;
//			i *= 10;
//		}
//		System.out.println("Binary Conversion : ");
//		System.out.println(bin);
//	}
//}

//Using Wrapper Classes
import java.util.Scanner;

public class Test{
 
 public static void main(String[] args) {
 
  System.out.print("Enter the number :: ");
  Scanner s = new Scanner(System.in);
  Integer num = s.nextInt();  // Integer wrapper class
  
  // Use toBinaryString( ) Method of Integer wrapper class
  String binaryNumber = Integer.toBinaryString(num); 
  System.out.println("Binary number of " + num + " is :: "+binaryNumber);
 }
}
