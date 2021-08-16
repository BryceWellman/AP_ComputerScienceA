/**
 The String Class
 */

//The string variable

//The string variable is a way to store letters and numbers
//string literals are characters surrounded by double quotation marks

//General way to make a string

String nameOfString = "characters to store in the string"

//examples

 String myName = "Captain America"
 String jennysNumber = "867-5309"

//The String object

// String variables are actually objects of the string class

//general way to make a string object using the consturctor

String nameOfString = new String("Captain America");

//examples

String myName = new String("Captain America");

String yourName = new String();                  //this is an empty string "" the length is zero but it exists

String theirName;                                // this is a null string

//their is a big diffrence between a null and an empty string, you must know this for the exam

//Visual representation of a String object

//In memeory strings are saved as a bunch of indices (plural of index)

String myFavoriteFood = "ice cream"

// i c e   c r e a m
// ^ ^ ^ ^ ^ ^ ^ ^ ^
// | | | | | | | | |
// 0 1 2 3 4 5 6 7 8

//String Concantenation

//you can string strings together which is called concanenation

//When concantenating with strings and integers which ever comes first shows if it is mathematical or string +
        //unless parentheses are used then mathematical calculations will take place

//example 1
String firstName = "Harry";
String lastName = "Potter";
String entireName = firstName + lastName;  //entire name is HarryPotter

//example 2
String firstName = "Harry";
String lastName = "Potter";
lastName += firstName;        //lastName is "PotterHarry"

//example 3
String firstName = "Harry";
int swords = 8;
String result = firstName + swords; //result is Harry8

//example4
String firstName = "Harry";
int swords = 8;
int brooms = 4;
String result = firstName + swords + brooms; //result is Harry84

//example5
String firstName = "Harry";
int swords = 8;
int brooms = 4;
String result = swords + brooms + firstName; //result is 12Harry

//example6
String firstName = "Harry";
int swords = 8;
int brooms = 4;
String result = firstName + (swords + brooms); //result is Harry12

//The correct way to compare 2 strings

//comparing strings is the way that passwords and usernames work.

//you use the compareTo and equals method to see if 2 strings are equal


//the equals method

//the equals method returns a boolean responce to the method
//the equalsTo method is cas-sensitive
//the ! can be used to in combination to return if the strings are not equal

//example1
String username1 = "Cat lady";
String username2 = "cat lady";

System.out.println(username1.equals("Cat lady"));  //output is true
System.out.println(username2.equals("Cat lady"));  //output is false

//example 2
String pet1 = "Cat";
String pet2 = "Dog";
System.out.println(!pet1.equals(pet2));   //output is true

//NEVER USE == TO COMPARE TWO STRINGS

//The compareTo method

//The compareTo mehtod returns an integer that describes how the 2 strigs compare

int result = firstString.compareTo(secondString);

//the answer is 0 if the strings are the same
//the answer is negative if teh first string comes first lexicographically
//the answer is positive if teh first number comes second lexicographically

        //Uppercase comes before lower case

//example 1
String string1 = "Hello";
String string2 = "Hello";
int result = string1.compareTo(string2);  //result is 0

//example 2
String string1 = "Hello";
String string2 = "Kitty";
int result = string1.compareTo(string2);  //result is negative

//example 3
String string1 = "Hello";
String string2 = "Kitty";
int result = string2.compareTo(string1);  //result is positive

//example 4
String string1 = "Hello";
String string2 = "hello";
int result = string1.compareTo(string2);  //result is negative

//the length method

//the length method returns the number of characters in a string including spaces

//example 1
String tweet = "I'm going to rock this AP CS exam."
int result = tweet.length();                          //result ios 34

//example2
String pokemonCard = new String(); // empty string
int result = pokemonCard.length(); // result is 0

//example3
String pokemonCard;                   //null String
int result = pokemonCard.length();    //error: NullPointerException

//the indexOf method

//to find if a string contains a certain character or group of characters you can use the indexOf method
        //the index of the character/s will now be returned
        //if not presemt -1 is returned

//example 1
String sport = "Soccer";
int result = sport.indexOf("e"); //result is 4

//example 2
String sport = "Soccer";
int result = sport.indexOf("c");  //only the first c is returned (2)

//example 3
String sport = "Soccer";
int result = sport.indexOf("i"); //returns -1 because no i is found

//example 4
String sport = "Soccer";
String findMe = "ce";
int result = sport.indexOf(findMe);  //returns 3

//the substring method

//the substring method is used to extract a certain character or group of characters out of a string
//just tell it where to start and where to finish
//the aubstring method is overloaded meaning there is more than one version of it

substring(int index); //Starts extracting at the index and goes to the end

substring(int firstIndex, int secondIndex); //starts extracting at the first index and goes to secondIndex -1

//example 1
String motto = "May the force be with you";
String result = motto.substring(14);         //result is "be with you"

//example 2
String motto = "May the force be with you";
String result = motto.substring(2,3);       //result is "y"

//example 3
String motto = "May the force be with you";
String result = motto.substring(5,7);       //result is "he"

//example 4
String motto = "May the force be with you";
String result = motto.substring(72);            //error: StringindexOutOfBoundsException

//example 6 (getting the word the froim finding the first and second space)
String motto = "May the force be with you";
int firstSpace = motto.indexOf(" ");
int secondSpace = motto.indexOf(" ", firstSpace + 1);
String word = motto.substring(firstSpace + 1, secondSpace);

//strings are immutable

//String variables are actually refrences to string objects, but they dont behave the same as normal object refrences
//Every time you make a change to a string variable Java actually creates a new string object and deletes the last

String str = "CS";   //ste refrences a string object "CS"
str = str + "Rules"; //str now refrences a new string object "CS Rules"

//Escape sequences

//Escape sequences are how you put double quotes in a string

//backslahes are used to indicate an escape sequence

//   \" allows you to put a double quote in a string

//   \\ allows you to put a backslash in a string

//   /t allows you to put a tab inside a string

//   \n allows you to start a new line inside a string






















