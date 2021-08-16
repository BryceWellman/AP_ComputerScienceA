/** Classes and Objects (Advanced version) **/

/*
    This conceot is the advanced countinuation of Concept 2. In this concept youll find the explanations
    for subjects such as passing parameters by refrence, overloading methods and constructors, and
    the many uses of the word static. Full understanding of these concepts is crucial to scoring a 5 on
    the exam

 */

//Key ideas

/*
    * Objects are passed by refreence, while primitives are passed by value
    * Arrays are objects; therfore, they are passed by reference
    * Data encapsulation is a way of hiding user information
    * Overloaded constructors have the same name but different parameter lists
    * Overloaded methods have teh same name but different parameter lists
    * Static variables are called class variables and are shared among all objects in the same class
    * Static Final variables are called class constants and, once given a value, they cannot be changed during the
      running of the program
    * The keyword this is used to refer to the current object
    * Scope describes the region of the program in which a variable is known
 */

/** Parameters **/

// Primitives are passed by value

/*
    Values that are passed to a method or constructor are called actual parameters (or arguments), while the variables
    in the parameter list of the method declaration are called formal parameters.

    When an actual parameter is of a primitive type, its value cannot be cahnged in the method because only the value
    of the variable is sent to the method.

    The method only has the ability to change the value of the formal parameter not the value of the actual parameter
 */

//Objects are passed by refrence

/*
    //simple answer
    When an object is passed to a method, the method has the ability to change the state of the object

    //technical answer
    When an actual parameter is an object, it is the object reference that is actually the parameter.
    this means that when the method receives the reference and stores it in a formal parameter variable,
    the method now has the ability to change the state of the object because it knows where it lives.

 */

//example

public static void main(String[] args)
        {
            Circle myCircle = new Circle(100);               //radius is 100
            int number = 100;                                // number is 100

            goAhead(myCircle, number);                       // send the arguments

            System.out.println(myCircle.getRadius());        //prints 50 (changed)
            System.out.println(number);                      //prints 100 (unchanged)

        }
        public static void goAhead(Circle c, int n)
        {
            c.setRadius(50);                                //changes the radius of myCircle to 50
            n =50;                                          //changes n to 5, but number stays 100
        }


//Arrays are passed by reference

/*
        An array is an object, so this means that it will be passed by refrence. If you pass an array as an actual
        parameter to a method or constructor, you are actually passing the refrenece to the array, which means that
        the method or contructor has the ability to change the elements in the array.
 */

public static void main(String[] args)
        {
                String[] myFavoriteThings = {"Memes", "Vines", "Snapchat"};

                whoops(myFavoriteThings);                                //the array is the argument

                for (String s : myFavoriteThings)
                        System.out.println(s);                           //fearless pandas everywhere
        }

        public static void whoops(String [] arr)
        {
                for (int i = 0; i < arr.length; i++)
                        arr[i] = "Fearless Pandas";          //changes the arrays values
        }


       /** ^^^^^^^^Destruction of persistant data ^^^^^^^**/

       /*
                recall that this is a one-point penalty on the free response. DONT EVER allow a method to change the
                state of the argument that is passed into it (unless you are asked to do so in the specifications)
        */

        //example
        //Correctly demonstate how to avoid destruction of persistant data.

        /*
                creating a temporay array in the method and copy each of the values from the origional array into the
                new temporary array. the origional array remains untouched.
         */

        public static void main(String[] args){
                String[] myFavoriteThings = {"Memes","Vines","Snapchat"};

                for (String s : myFavoriteThings)
                        System.out.println(s);                          //the array is untouched

                String[] watchThis yeah(myFavoriteThings);

                for (String s : watchThis)
                        System.out.println(s);                          //the array is modified
        }

        public static String[] yeah(Stringp[] arr)
        {
                String[] temp = new String[arr.length];                //creates a temporary array

                for(int i = 0; i < arr.length; i++)
                        temp[i] = arr[i];                              //make a copy of the original

                for (int i = 0; i < temp.length; i++)
                        temp[i] = "Fearless pandas";                   //modify the temporary array

                return temp;                                           //return the temporary array
        }

        /** comparing against a null refrenece **/

        /*
                recall that a nullPoointerException error occurs if you attempt to perform a method on a
                refrence variable that is null. You can avoid having this error thrown by performing a null check.
                compare the refrence variable using the == or != comparator.
         */

        //example
        //demonstarte how to perform a null check using the circle class

        public static void main(String[] args)
        {
                Circle circle1 = new Circle(10);
                Circle circle2;                                 //circle 2 is null

                System.out.println(doANullCheck(circle1));      //send a valid refrence
                System.out.println(doANullCheck(circle2));      //send a null refernce
        }

        public static double doANullCheck(Circle c)
        {
                if (c != null)
                        return c.getarea();                     //return the area if c is not null
                else
                        return -1;                              //return -1 if c is null
        }

/** Overloaded Constructors **/

/*
        It is possible to have more than one constructor in a class. Constructors are always declared
        using the name of the class, but their parameter lists can vary.

        The computer will decide which constructor to use based on the parameter list, so they must differ in one of
        these ways....

        * A differnet number of parameters
        * the same number of parameters but at least one differnet type
        * the same exact parameter types but in a differnt order
 */

//example
//Declare 4 constructors for a class called Student

public class Student
{
        private String firstName;
        private String lastName;
        private int age;

        public Student()
        {

        }

        public Student(String first)
        {
                firstName = first;
        }

        public Student(String first, String last)
        {
                firstName = first;
                lastName = last;
        }

        public Student(String first, String last, int yearsOld)
        {
                firstName = first;
                lastName = last;
                age = yearsOld;
        }
}

/** Overloaded Methods **/

/*
        Methods that have the same name but different parameters lists are called overloaded methods.
        The computer decides which one to use based on the paraameter list

        They can have the same name and may have a different return type but they must be differnet in atleat one
        of these ways

        *a different number of parameters
        *the same number of parameters but atleast one is a different type
        *the same exact parameter types but in a differnt order
 */

//example
//declare four overloaded methods

public void doSomething(int param)                      //has one int parameter
{

}

public void doSomething(double param)                   //has 1 double parameter
{

}
public void doSomething(double a , int b)               //has 2 parameteres
{

}
public void doSomething(int a, double b)                //has 2 params; differnet order
{

}

/** Static, Static, Static **/

//Static Variables

/*
        There are times a class wants to have a variable that is shared with all of the objects of the class. If
        any one of the objects change the variable, the change is reflected across all the objects. The variable
        is declared as if it were a instance variable; however, it uses the keyword static in its declaration.

        Static variables are also called class variables and like all instance variables are declared private
 */

//example
/*
        Say you were hired by starbucks to keep track of the total number of coffees that they serve. You've already
        decided to have a class called starbucksStore, but how can you keep track of the total number of coffees served
        across all the stores? one solution is to make a static variable called totalCoffeesServed then create a method
        to increment the value. it will then increase across all the objects
 */

public class StarbucksStore
{
        private static int totalCoffeesServed = 0;

        public void serveOneCoffee()
        {
                totalCoffeesServed++;
        }

        public int getTotalCoffeesServed()
        {
                return totalCoffeesServed;
        }
}

//static methods

/*
        If a method is labeled static, it can only call other static methods and can only use staic variables.
        The most common place to use static methods is in a runner class. The main method is static and so it
        can only call other static methods. The main method is static because there aren't any objects
        to initiate s call to run the program
 */

//example
//Demonstrte how the main method can call static methods

public class FunnyQuote
{
        public static void main(String[] args)                  //no object required
        {
                System.out.println(tellMeSomething());
        }

        public static String tellMeSomething()                  //main can call this method
        {
                return "I like turtles.";
        }
}


/** static Variables (class variables) **/

/*
        There are times when a class wants to hace a constant that is used by all the objects of the class.
        As the name constant suggests, it cannot be reassigned a different value at any other place in the program.
        In fact a compile-time error will occur if you attempt to change the value.
        Class constants are declared using the keywords static and final.
        writen in all caps and underscores if neccesary.
 */

//example
//As the progrtammer assigned to the starbucks project, you decide to make a variable that holds the logo for all stores

public class StarbucksStore
{
        static final String STARBUCKS_LOGO = "Mermaid";

        /* Other implementation not shown */
}


/** Data Encapsulation **/

//information hiding

/*
        Protecting information by restricting its access is important in software development.
        Since classses are public, all the objects from the class are public. The way that we hide information
        or encapsulate data in Java is to use the privvate access modifier.
 */

//it is expected that all instance variables are declared private on the exam

//What happens if i declare an instance variable public?

/*
        Let's suppose you just want to find out what happens id you declare an instrance variable public.
        The result is that you can use the dot operator to access the variable.
 */

//example
//declare the radius from teh circle example public

//Pretend this is the Circle class
public double radius; //public instance variable NEVER DO THIS

//pretend this is a runner class
Circle myCircle = new Circle(10);       //radius is 10
myCircle.radius = -54;                  //radius is easily changed when public
double result = myCircle.radius;        // result is -54.0

//The integer class has public fields

/*
        The MAX_VALUE and MIN_VALUE are both public constant field, you dont use a method to get them
 */

/** Scope **/

/*
        The scope of a variables refers to the region of teh program in which the variable is known.
        Attempting to use a variable outside of its scope produces a compile-time error.

        Different types of variables have different scopes

        * The scope of local variable is within the nearest paor of curly braces that encloses it.
        * The scope of a parameter is the method or constructor in which it is declared.
        * the scope of an instance variable is teh class in which it is defined
 */

/** Documentation **/

//Javadoc

/*
        javadoc is a tool that generates an HTML-formatted document that summarizes a class (including its constructors,
        instance variables, methods, etc.) in a readable formate. Among programmers, this document itself is often
        referred to as a javadoc. The summary is called the API (application program interface) for that set of classes
        and is extremly useful for programmers.
 */

//Javadoc tags

/*
        Similiar to a hashtag, the @param is a tag that is used in Javadoc comments. When a programmer uses an @param
        tag, they state the name of the parameter and provide a bried description of it. Javadoc tags are automatically
        detected by Javadoc and appear in the API.
                The @return is also a javadoc tag. It is only used in return methods, and the programer identidies
                the name of the variable being returned and a brief description of it.
 */

//precondition and postcondition

/*
        you know what happens when you assume, right? Well a preconditon states what you are allowed to assume about
        a parameter. It's a statement in the documentaion comment before a constructor or method signature that
        describes the expectations of teh parameter sent to the method. On the AP CS Exam, reading the preconditions
        can help you understand the nature of teh parameters. A postcondition is what is expected of teh method after it
        is executed
 */

/** the keyword this **/

/*
        The keyword this is a refreence to the currnet object, or rather, the object whose method or constrtuctor
        is being called. It is alos referred to as the implicit parameter
 */

public static void main(String[] args)
        {
                MyClass m1 = new MyClass("batman");
                m1.doSomething();
        }

        public class MyClass
        {
                private String name;
                public MyClass(String n)
                { name = n; }

                public String getName()
                { return name; }

                public void doSomething()
                {
                        nowDoSomethingWith(this);      //pass "this" to another method
                }

                public void nowDoSomethingWith(MyClass myObject)
                {
                        System.out.println("I am "+ myObject.getName());
                }

        }

//example 2
/*
        A common place to use the keyword this is when the instance variables have the same name as teh parameters
        in a constructor. The keyword this is used on the left side of the assignment statements to assign the instance
        variables teh values of teh parameters. The left side is teh instance variable; the right side is teh parameter
        variable. using this here says, "hey, i understand that we have the same name, so these are my instance
        variables and not the parameters. This usage of the keyword this is not tested on teh exam
 */

public class whatever
{
        private int a;
        private int b;

        public Whatever(int a, int b)           //parameters have the same name as instance variables
        {
                this.a = a;                     //left side are teh instance varibales
                this.b = b;                     //right side are teh parameters
        }
}

/** IllegalArgumentException **/

/*
        If you pass an argument to a method and teh value of the argument does not meet certain criteria required by
        the method, an IllegalArgumentException error may be thrown during run-time. Programmers may also choose to
        write a method that terminates with an ILlegalArgumentException if it does not receive the expected input.
 */

