//The Java API and the Computer Science A exam Subset

/* The java API describes a set of classes and files for building software in Java. it shows how java features work
and interact, since the API is HUGE only a small subset is tested.
 */

//The Math Class

//The math class was created to help programmers solve prblems that require mathematical computations.
//This includes a random number generator
//the math class includes only static methods meaning you dont need to make objects for it

//Absolute value --> abs
//Square Root --> sqrt
//Base raised to a power --> pow
//Random Number Generator --> random

//example 1
int result = Math.abs(-8);  // result is 8

//example 2
double result = Math.abs(-8.4); // result is 8.4

//example 3
double result = Math.sqrt(49); //result is 7.0

//example 4
double result = Math.pow(5,3); // result is 125.0 (5 raised to the third power)

//example 5
double result = Math.random(); //result is a double in th interval (0.0, 1)

//example 6
double result = Math.PI; // Pi is not a method it is a public field

//using math.random to generate a random integer

//General form for generating a random integer between 0 and some number

int result = (int) (Math.random() * (total # of choices));

//general form for generating an integer between 2 positive numbers

int high = /* some number greater than 0 */
int low = /* some number greater than 0 and less than high */

int result = (int) (math.random() * (high - low + 1)) + low;

//example 1
//generate a random int between 0 and 12 (inclusive)

int result = (int) (Math.random() * 13);  //13 possible answers

//example 2
//generate a random int between 4 and 20 (inclusive)

int result = (int) (Math.random() * 17) + 4;   // 17 possible answers

//example 3
// pick a random character from a string.

String quote = "And may the odds be ever in your favor.";
int index = (int) (Math.random() * quote.length());

String result = quote.substring(index, index + 1);    //random character

//example 4
// simulate flipping a coin a million times

int heads = 0, tails = 0;
for (int i = 0; i < 1000000; i++)
        {
            int flip = (int)(Math.random() * 2) + 1;
            if (flip == 1)
                heads ++;
            else
                tails ++;
        }
System.out.println("Total number of heads: " + heads);
System.out.println("Total  number of tails: " + tails);

//The correct way to compare 2 double variables

//It is not good practice to compare doubles with == because of roundiong error 7.000000002 wont be equal to 7

//General form for comparing if 2 doubles are equal

double a = /* Some double */
double b = /* some double */
double tolerance = 0.00001;  // The .00001 varies with the application

boolean closeEnough = Math.abs(a-b) <= tolerance;

//example

double num1 = 3.99999;
double num2 = 4.0;
double tolerance = .0001;

boolean result = Math.abs(num1-num2) <= tolerance;  //result is true

//The Integer Class

//the integer class has the ability to turn a primitive int into an Object. This is called a wrapper class
        //it 'wraps' the value into an object
//this will be important for data structures

//example 1
//create an integer object form an int

int num = 5;
Integer myInteger = new Integer(num);  //myInteger is an object, value 5

//example 2
//obtain teh value of an integer object using the intValue() method

int num = 8;
Integer myInteger = new Integer(8);  //myObject is an object, value 8
int result = myInteger.intValue();   //result is a primitive, value 8


//example 3
// attempt to create an Integer object using a double value

double num = 5.67;
Integer myInteger = new Integer(num);  //compile-time error

//example 4
//Attempt to create an Integer objkect without using a value

Integer myInteger = new Integer();  //complie-time error

//fields of the double class

//MAX_VALUE and MIN_VALUE are public fields of the Integer class.
//a field is a property of a class (like an instance varibel).
//these 2 are called constant fields and their values cannot be changed
//by naming convention, constants are typed using only uppercase and underscores and no parenthesis as they arnt methods

//there is a max and min integer due to Java setting aside 32 bits for each integer
//max input is 01111111 11111111 11111111 11111111 ( the 0 tells eiter positive or negative)
//max for the integer field is therefore 2,147,483,647

//if you add one to this max number the result causes a arithmetic overflow

//example 1
//obtain the value of the largest int
int result = Integer.MAX_VALUE;       //result is 2147483648 (2^31 -1)

//example 2
//obtain the value of the smallest int
int result = Integer.MIN_VALUE;       // result is -2147483648 (-2^31)

//Java does have the "long" data type where it sets aside 64 bits making the new max 9,223,372,036,854,775,807
//but this is not on the exam

//The double class

//the double class is a wrapper class for double data types

//example 1
//Create a double object from a double
double num = 5.67;
Double myDouble = new Double(num);  //myDouble is an object, value 5.67

//example 2
//Obtain the value of a Double object using the doubleValue() method
double num 6.125;
Double myDouble = new Double(num);
double result = myDouble.doubleValue();  //result is 6.125

//example 3
// Attempt to creat a double object without using a value
Double myDouble = new Double();  //compile-time error


//summary

//  intValue --> Integer method that returns the value of th integer object
//  Integer.MAX_VALUE --> Public field (constant) largest integer taht can be stored in Java
//  Integer.MIN_VALUE -_> Public field (constant) smnalled integer that can be stored in Java
//  doubleValuej --> Double Method that returns the value of teh Double object





























