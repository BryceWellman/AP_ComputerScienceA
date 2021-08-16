/**
 *  _______ _              _____ _                  _____            _                 _   _
 * |__   __| |            / ____| |                |  __ \          | |               | | (_)
 *    | |  | |__   ___   | |    | | __ _ ___ ___   | |  | | ___  ___| | __ _ _ __ __ _| |_ _  ___  _ __
 *    | |  | '_ \ / _ \  | |    | |/ _` / __/ __|  | |  | |/ _ \/ __| |/ _` | '__/ _` | __| |/ _ \| '_ \
 *    | |  | | | |  __/  | |____| | (_| \__ \__ \  | |__| |  __/ (__| | (_| | | | (_| | |_| | (_) | | | |
 *    |_|  |_| |_|\___|   \_____|_|\__,_|___/___/  |_____/ \___|\___|_|\__,_|_|  \__,_|\__|_|\___/|_| |_|
 *
 */

public class Circle
{

}

/*Instance Variables
 _____           _                         __      __        _       _     _
|_   _|         | |                        \ \    / /       (_)     | |   | |
  | |  _ __  ___| |_ __ _ _ __   ___ ___    \ \  / /_ _ _ __ _  __ _| |__ | | ___  ___
  | | | '_ \/ __| __/ _` | '_ \ / __/ _ \    \ \/ / _` | '__| |/ _` | '_ \| |/ _ \/ __|
 _| |_| | | \__ \ || (_| | | | | (_|  __/     \  / (_| | |  | | (_| | |_) | |  __/\__ \
|_____|_| |_|___/\__\__,_|_| |_|\___\___|      \/ \__,_|_|  |_|\__,_|_.__/|_|\___||___/

 */

//the virtual attributes of an object are instance variables, a class can have as many of these as needed.
// unlike local primitive variables, default values are assigned to primative instance variables

// the default values are... int vars are 0, doubles are 0.0, and booleans are false

public class Circle          //class declaration
{
    private double radius;   //instance variable
}

/*Private vs. Public Visibility
 _____      _            _         __      __       _____       _     _ _
|  __ \    (_)          | |        \ \    / /      |  __ \     | |   | (_)
| |__) | __ ___   ____ _| |_ ___    \ \  / /__     | |__) |   _| |__ | |_  ___
|  ___/ '__| \ \ / / _` | __/ _ \    \ \/ / __|    |  ___/ | | | '_ \| | |/ __|
| |   | |  | |\ V / (_| | ||  __/     \  /\__ \_   | |   | |_| | |_) | | | (__
|_|   |_|  |_| \_/ \__,_|\__\___|      \/ |___(_)  |_|    \__,_|_.__/|_|_|\___|

__      ___     _ _     _ _ _ _
\ \    / (_)   (_) |   (_) (_) |
 \ \  / / _ ___ _| |__  _| |_| |_ _   _
  \ \/ / | / __| | '_ \| | | | __| | | |
   \  /  | \__ \ | |_) | | | | |_| |_| |
    \/   |_|___/_|_.__/|_|_|_|\__|\__, |
                                   __/ |
                                  |___/
 */

/*
    the words private and public are visibility modifiers (or access level modifiers)

        Using the word private in an instance variable allows other classes cannot access the data stored in
    the variable without asking the object to provide it.

    Public ensures any programmer can make objects from that class

    on the exam always give instance variables Private access.
 */

/*Constructors
  _____                _                   _
 / ____|              | |                 | |
| |     ___  _ __  ___| |_ _ __ _   _  ___| |_ ___  _ __ ___
| |    / _ \| '_ \/ __| __| '__| | | |/ __| __/ _ \| '__/ __|
| |___| (_) | | | \__ \ |_| |  | |_| | (__| || (_) | |  \__ \
 \_____\___/|_| |_|___/\__|_|   \__,_|\___|\__\___/|_|  |___/

 */

/*
constructors are the virtual builders of the virtual objects from a class
used in combunation with the keyword new to create an object, constructors have the same name as the class
*/

/*No-argument constructor
 _   _                                                         _
| \ | |             /\                                        | |
|  \| | ___ ______ /  \   _ __ __ _ _   _ _ __ ___   ___ _ __ | |_
| . ` |/ _ \______/ /\ \ | '__/ _` | | | | '_ ` _ \ / _ \ '_ \| __|
| |\  | (_) |    / ____ \| | | (_| | |_| | | | | | |  __/ | | | |_
|_| \_|\___/    /_/    \_\_|  \__, |\__,_|_| |_| |_|\___|_| |_|\__|
                               __/ |
                              |___/
        _____                _                   _
       / ____|              | |                 | |
      | |     ___  _ __  ___| |_ _ __ _   _  ___| |_ ___  _ __
      | |    / _ \| '_ \/ __| __| '__| | | |/ __| __/ _ \| '__|
      | |___| (_) | | | \__ \ |_| |  | |_| | (__| || (_) | |
       \_____\___/|_| |_|___/\__|_|   \__,_|\___|\__\___/|_|

 */

/*
no information is passed to this constructor when creating a new object. It is the constructor that allows
you to make a generic object of this class
 */

/*parameterized constructors and parameters
                                      _            _             _
                                     | |          (_)           | |
 _ __   __ _ _ __ __ _ _ __ ___   ___| |_ ___ _ __ _ _______  __| |
| '_ \ / _` | '__/ _` | '_ ` _ \ / _ \ __/ _ \ '__| |_  / _ \/ _` |
| |_) | (_| | | | (_| | | | | | |  __/ ||  __/ |  | |/ /  __/ (_| |
| .__/ \__,_|_|  \__,_|_| |_| |_|\___|\__\___|_|  |_/___\___|\__,_|
| |
|_|
                     _                   _
                    | |                 | |                    ___
  ___ ___  _ __  ___| |_ _ __ _   _  ___| |_ ___  _ __ ___    ( _ )
 / __/ _ \| '_ \/ __| __| '__| | | |/ __| __/ _ \| '__/ __|   / _ \/\
| (_| (_) | | | \__ \ |_| |  | |_| | (__| || (_) | |  \__ \  | (_>  <
 \___\___/|_| |_|___/\__|_|   \__,_|\___|\__\___/|_|  |___/   \___/\/

                                       _
                                      | |
  _ __   __ _ _ __ __ _ _ __ ___   ___| |_ ___ _ __ ___
 | '_ \ / _` | '__/ _` | '_ ` _ \ / _ \ __/ _ \ '__/ __|
 | |_) | (_| | | | (_| | | | | | |  __/ ||  __/ |  \__ \
 | .__/ \__,_|_|  \__,_|_| |_| |_|\___|\__\___|_|  |___/
 | |
 |_|                                                    


 */

/*
If you already know something about an object prior to creating it then you would use parameterized
constructors

parameterized constructors are used to pass information into instance variables on creation.

The parameters that are defined in the parameterized constructor are placed in a parameter list
and are on the same line as the declaration of the constructor.

the process of sending the initial values to the constructor is called passing a parameter to the constructor

The actual value passed to the constructor is called an argument and the variable that recieves this
value is called the formal parameter

You incluce a line of code in the parameterized constructor that assigns the value of the formal parameter
to the instance variable

When you choose to write a parameterized constructor for a class, the default, no-argument constructor
vanishes.
 */

//example

public class Circle                       //class declaraiton
{
    private double radius;                //Instance variable

    public Circle()                       //no-argument constructor
    {
        //the radius gets a default value of 0.0
    }

    public Circle(double rad)             //parameterized constructor
    {
        radius = rad;                     //the radius is set to rad
    }
}

//Parameters in the parameter list

/*
A parameter is a variable located in a parameter list in the constructor declaration.
A pair of parenthesis after the name of the constructor encloses the entire parameter list.

    for example, the parameterized constructor for the Circle class has one parameter variable in its
  parameter list. The name of the parameter is rad(short for radius) and its data type is double. The
  no-argument constructor for the Circle class does not have any parameters in its parameter list
 */

public Circle()                    //no parameters in parameter list
{

}
public Circle(double rad)          //one parameter in parameter list
{
    radius = rad;
}

//Methods

/*
The real power of an object oriented programming language takes place when you start to manipulate objects.

A method defines an action that allows you to do these manipulations.
A method has 2 options it may perform a service of some kind, or it may compute a value and return an answer,
this action is callsed returning a value.

Methods that simply perform an action are called void methods.
Methods that return a value are called return(or non-void) method.

Return methods must state must define what data type they will return and include a return statement.
(it can return any data type)

Using the word public in the method declaration enusres that the method is availaible for other objects
from other classes to use

*******AP exam**********
Methods that are supposed to return a value must have a reachable return statement.
Methods that are void do not have a return statement.
This is a big deal on the FRQ's on the exam as you will lose points if you include a return statement in a
void method or constructor
 */

//Accesor and Mutator Methods

//When first learning to write methods for a class, new programmers learn two types of methods:

/*
    1. Methods that allow you to access the values stored on the instance variables
    2. Methods that allow you to modify the values of the instance variables

    Methods that return the value of an instance variable are called accessor (or getter)
 methods. Methods that change the value of an instance variable are called mutator (or modifier or setter)
 methods. Methods that dont perform either one of these duties are simply called methods.
 */

//Declaring a method

/*
    Methods are declared using a line of code called a method declaration statement. The declaration
 includes the access modifier, the return type, the name of the method, and the parameter list.
 The method signature only includes the name of the method and the parameter list.

 general form

 accessModifer  returnType  methodName(parameterList)

 **one track mind**
 methods should have only one purpose and the name should clearly describe this purpose
 */

//example

public class Circle                     //Class declaration
{
    private double radius;              // Instance Variable

    public Cirlce()                     //No-argument constructor
    {
        //radius gets default value 0.0
    }

    public Circle(double rad)           // Parameterized constructor
    {
        radius = rad;                   //teh radius is set to rad
    }

    public double getRadius()           //accessor method
    {
        return radius;
    }

    public void setRadius(double rad)   //mutator method
    {
        radius = rad;                   // the radius is set to rad
    }

    public double getArea()             //method that calculates area
    {
        return 3.14 * radius * radius;  // a simple way to compute area and return it
    }

}
    //Putting it all together, The Circle and Circle runner classes

    /*
          Im now going to combine the Circle class that we just created with another class to demonstrate
       code that follows an example of two classes interacting in an object oriented setting. The Circle
       class defined how to make a Circle object. The CircleRunner class is where the programmer creates
       virtual Circle objects and then manipulates them
     */

public class Circle
{
    private double radius;

    public Circle()
    {

    }
    public Circle(rad)
    {
        radius = rad;
    }
    public double getRadius()
    {
        return radius
    }
    public void setRadius(double rad)
    {
        radius = rad;
    }
    public double getArea()
    {
        return 3.14 * radius * radius;
    }

}

public class CircleRunner
{
    public static void main(String[] args)
    {
        Circle myCircle = new Circle(10);
        Circle hisCircle = new Circle();
        Circle herCircle = new Circle();

        System.out.println(myCircle.getArea());
        System.out.println(hisCircle.getArea());

        hisCircle.setRadius(5);
        herCircle.setRadius(2 * hisCircle.getRadius());

        System.out.println(hisCircle.getArea());
        System.out.println(herCircle.getArea())
    }
}