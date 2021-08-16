//Data Structures

//Simple vs complex Data structures

/*
    Simple data structures are primitive variables
    complex data structures can store a list of primitive variables
 */

    //3 important complex data structures

    /*
        The Array (one-dimensional array)
        The 2-D Array
        The ArrayList
    */

//The array

/*
    An array is a complex data structure that stores a list of primitives or objects
        Each item can be refrenced by an index
        items in an array are called an element and can be any primitive, data type, or object
 */

//Declaring an Array and initializing it using a predefined list of data

/*
    This first way to creat an array is uded when you know the data that will be stored in the list and will have no
    reason to change it.
        A pair of brackets [] tells the compiler it will create an array not just a regular variable
 */

//General form for creating an array using a predefined list of data

datatype[] nameOfArray = {dataValue1, dataValue2, dataValue3, . . . };

//example
//declare an array of String variables that represent food choices at an resturant

String[] foodChoices = {"Pizza","Cheeseburger","Tacos","Salad","Chicken Strips"};

                        //pizza is at index 0 and Salad is at index 3
                        //The last index is always one less than the length

//The length field

/*
    After an array is created youcan ask it how many 'slots' it has by using the length field
        uses no parenthesis as it is not a method
 */

//example
//find the length of the foodChoices array

int result = foodChoices.length;    //returns 5 (not 4)

//decalring an array using the keyword new

/*
    the second technique for declaring an array is used when you know the length of the array but not all the data that
    will be entered into the array
 */

//general form for creating an array using the keyword new

dataType[] nameOfArray = new dataType[numberOfSlots];

    //the number of slots is fixed and all od the elements in the array get the default value of the data type

    //You can also jsut create an array refrence variable and create the array later.

        //ex
            dataType[] nameOfArray;                     //no array created
            nameOfArray = new datatype[numberOfSlots];  //array created

//example
            /* Create an array that will represent all of your semeester grade point averages in highschool
                two semesters a year means 8 total semesters.
             */

double[] myGPAs = new double[8];      //An array with 8 slots was created but each slot has 0.0 (default value of double)

myGPAs[0] = 3.62;   //this places 3.62 in as tghe first value in the array (you must kniow the index to enter values)

myGPAs[3] = 3.75;   //this places 3.75v in the 4th slot or your second semester of sophmore year

//example
//pick a random color from a n array of colors

String[] colors = {"Red","Orange","yellow","Green","Blue","indigo","Violet"};
String randomColor = colors[(int)Math.random() * 7];
System.out.println("My favorite color is "+ randomColor);   //outputs a random color from the array

//The ArrayondexOutOfBoundsException

/*
    this occurs when you use an index that is too big for the array
 */

    //example
    Circle[] arr = new Circle[6];
    double radius = arr[arr.length].getRadius();       // run-time error
    double result = arr[arr.length - 1].getradius();   //correct way

//traversing an array

    /*
        To traverse an array is to through each slot in an array, one at a time
            there are many ways to traverse an array start to end, end to start, evens then odds, all that matters
            is that you visit each element
     */

//Print the contents of a one dimensional array by traversing it

String[] faceBookFriends = {"Sierra","Ciara","Siarra","Ciera"};
for int i = 0; i < faceBookFriends.length; i++)
        {
            System.out.println(faceBookFriends[i]);       //outputs all the names in the list
        }

//The enhanced for loop (the for-each loop)

/*
    The for-each loop can be used to traverse arrays
        it always starts at the beginning of the loop and goes to the end
 */

//general form for a for-each loop

dataType[] arrayName = /* array filled in some way */

for (dataType temporaryVariable : arrayName)
        {
            //instructions that use the temporary varaiable
        }

    //there is no loop control, you only have access to elements in the array not in teh index
        //the data type of the temporary variable must be the same as the array

//example
//print out the names of your facebook friends with a for-each loop

String[] faceBookFriends = {"Jordan", "Jordin", "Jordyn"};
for (String friend: faceBookFriends)
        {
            System.out.println(friend);
        }

// below does not work and returns an error code
System.out.println(faceBookFriends);
//returns @1765f32  not the content of the array

/**The 2-D array **/

/*
    A 2-D array is a complex data structure that can be visualized as a rectangular grid made up of rows
    and columns. Technically it is an array of arrays
        it can store any kind of data but it has to be the same across the array
 */


//decalaring a 2-d array and initilizing it with a predefined list of data

/*
    when you already know what you are putting into the array you can decalre it and insert data
        you use 2 pairs of brakets after the data typ to declare a 2-d array
 */

//General form for createing a 2-d array using predefined lidt of data

dataType [][] nameOf2DArray = { {value1, value2, value3},
                                 {value4, value5, value6},
                                 {. . . . . . . . . . . }};

//example
//declare a 2-d array that represents candy crush board with four rows and 3 columns.

String [][] candyBoard = {{"Jelly Bean", "Lozenge", "Lemon Drop"},
                          {"Gum square", "Lollipop head", "Jujube Cluster"},
                          {"Lozenge", "lollipop head", "Lemon Drop"},
                          {"Jelly bean", "Lollipop head", "lozenge"}};

//Every cell in a 20d array is assigned a pair of coordinates that are based on the row number and column number
    //the first set of brackets represents the row number and the second is the column number

//example
//change the "Lozenge" in row 2 column 0 to be a "Lemon Drop"

candyBoard [2][0] = "Lemon Drop";    //changes it to a lemon drop

//decalring a 2-d array using the keyword new

/*
    A 2-d array object can be created  using the keyword new. Every cell in teh 2-d array is filled with the default
    value for its data type
 */

//general form for createing a 2-d array using the keyword new

dataType[][] nameOfArray = new dataType[numberOfRows][numberOfColumns];


//exampple
//declare a 2-d array that represents a suduko board that has nine rows and nine columns put the number 6 in row 2, c7

int[][] mySudukoBoard = new int [9][9];     // creates the 2-d array wiht all default  values
mySudukoBoard[2][7] = 6;                    // puts a 6 in row 2 column 7

//using the length field to find the number of rows and columns

/*
    The number of rows in a 2-d array is found by accessing the length field. The number of columns in a 2-d array
    is found by accessing teh length field on the name of the array along with one of the rows (it doesnt matter
    which row)
 */

//example1
//retrieve the number of rows from a 2-d array

double[][] myBoard = new double[8][3];
int result = myBoard.length;           //result is 8 (number of rows)

//example 2
//retrieve the number of columns from a 2-d array

double[][] myBoard = new double[8][3];
int result1 = myBoard[0].length;       //result is 3 (nu
// mber of columns)
int result2 = myBoard[5].length;       //result is 3

//traversing a 2-d array in row-major order

/*
    Traversing a 2-d array means to visit each and every cell in the 2-d array.
        there are 2 ways to do this
            the first is in Row-major order
            to do so is to go through the 2-d array the way that english people read
            you start at the top left, go through the row and then go down to the next row
 */

//example
//traverse an array in row-major order using a nested for loop

String[][] myGrid = /* 2-D array provided by the user */
for (int row = 0; row < myGrid.length; row++)                                //every row
        {
            for(int column = 0; column < myGrid[0].length; column++)         // every column
                {
                    System.out.println(mygrid[row][column]);                 //every cell
                }

        }



//traversing a 2-d array in column-major order

/*
    The process of traversing a 2-d array in column-major order is to start at the top-left and then move down
    cell by cell and once you reach the bottom to go to teh top of the next column
 */

//example
//Traverse an array in column-major order using a nested for-loop

String[][] myGrid = /* 2-D array provided by the user */
for (int column = 0; column < myGrid[0].length; column++)   //every column
        {
            for (int row = 0; row < myGrid.length; row++)   //every row
            {
                System.out.println(myGrid[row][column]);    //every cell
            }
        }


/** the array list **/

/*
    An array list is a complex data structure that allows you to add and remove objects and it resizes automatically
 */

//Declaring an Array list

/*
    an arraylist is an object of the ArrayList class. therefore you need to use the keyword new along with
    teh constructor from the arraylist class. you also need to know the data type of the objects that
    will be stored in the list. the array list uses a pair of angle brackets <> to enclose the class name
    of the objects it will store
 */

//two general forms for declaring an ArrayList

ArrayList<ClassName> nameOfArrayList = new ArrayList<ClassName>();

List<ClassName> nameOfArrayList = new ArrayList<ClassName>();

//example
//declare an arraylist of circle objects (from concept2)

ArrayList<Circle> myCircles = new ArrayList<Circle>();      //the array list starts out empty and always will
                                                            //but the beauty of it is that it is resizable

//an arrayList requires a import statement

/*
    the arraylist is not apart of the built-in java lanuage so you have to let the compiler know you plan to use it
    This goes before the class declaration
 */

import java.util.ArrayList;

//you will not need to write import statements on the exam

//An arraylist can only store objects!!!!!

/*
    unlike the array which could store primitive variables an arraylist cannot.
        if you want to store integers or doubles you will have to use their wrapper classes
        (its the maion reason the wrapper classes were created)
 */

//example
//Create an arraylist of integers. Add an int to the arraylist and secretly watch as teh int is
//automatically converted to an Integer using a secret java black bpx technique called autoboxing

ArrayList<Integer> myfavoriteIntegers = new ArrayList<Integer>();
int num = 45;
myfavoriteIntegers.add(num);                //teh 45 is converted into an Integer

//important ArrayList methods

/*
    the array list class comes with a large array of methods. These methods make it easier to work with the objects
    stored in the ArrayList. The AP CS exam does not require you to know all of them but it does require
    you know a subset of them.
 */


//the add method

/*
    there are two add methods for the ArrayList. The add(E object) method appends the object to the end of the list
    It also returns the value true. The size of the array will automatically update
 */

//example
// create an arraylist of Circle objects. Add 3 objects to the array list where the first has a radius of 8
// next has no radius and gets given teh default, and the last circle has a radius of 6.5

ArrayList<Cirlce> myCircles = new ArrayList<Circle>();

myCircles.add(new Circle(8));       //adds one circle to the list
myCircles.add(new Circle());        //adds the next and the array is now 2 long
myCircles.add(new Circle(6.5));     //adds the third and final and it again updata

//the other add method is the add(int index, E object), this method inserts the object where the index is and pushes
//the other objects down in line.

myCircles.add(1, new Circle(4));  //after this is executed it adds this circle to now be at index 1
                                  //the other circles we added get pushed up a index, the 0.0 one is now index 2 not 1

//the size method

/*
    the size method tells you the size of the ArrayList
 */

int howManyCircles = myCircles.size();  //tells you there are 4 circles in teh arraylist

//the remove methodi

/*
The remove method remove(int index) deletes the object at the index. Each of the objects after the deleted
object now move down in their index.
 */
Circle someCircle = myCircles.remove(2);  //someCircle's radius is 0 and was removed
                                          // the remaining objects got moveed down, 6.5 circle is now index 2


//the get method

/*
    The get(int index) method returns the object at the given index. it doesnt remove the copy it just copies
    it and returns it
 */

Circle someCircle = myCircles.get(2);    //someCircle's radius is 6.5


//the set method

/*
    The set(int index, E object) method replaces the object in teh arraylist at the given index with object
   . it returns a refrence to thje object that was previously at index
 */

Circle c = myCircles.set(0, new Circle(20);)  //c's radius is 8, but in the arraylist at index 0 it is now 20

//Traversing an arraylist using a for loop

/*
    the following code uses a for loop to print the area of each of the circles in the ArrayList. the get method is used
    to retrive each circle and the getArea to return teh area.
 */

for (int i = 0; i < myCircles.size(); i++)
        {
            System.out.println(myCircle.get(i).getArea());   //prints all the areas
        }


//traversing an array list using the enhanced for loop (for-each)

/*
    The for-each loop can be used with an ArrayList. the following code prints the area of each of the circle
    objects stored in the arraylist.
 */

for (Circle circle : myCircles)
        {
            System.out.println(circle.getArea());            //no index used in a for-each loop
        }









































