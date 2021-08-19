public class Concept1
{
    public static void main(String[] args)
    {
        /** data types
         * ------------------------------------------------------------------------------------------------
         *  _____        _          _______
         * |  __ \      | |        |__   __|
         * | |  | | __ _| |_ __ _     | |_   _ _ __   ___  ___
         * | |  | |/ _` | __/ _` |    | | | | | '_ \ / _ \/ __|
         * | |__| | (_| | || (_| |    | | |_| | |_) |  __/\__ \
         * |_____/ \__,_|\__\__,_|    |_|\__, | .__/ \___||___/
         *                                __/ | |
         *                               |___/|_|
         *--------------------------------------------------------------------------------------------------
         */
           // datatype variableName = value;

        //int and double datatypes
        int numberOfPokemon = 25;           //numberOfPokemon gets a value of 25
        double health = 112.7;              //health gets the value 112.7
        double gpa = 3;                     //a double can recieve an int variable
        double a = 2.4, b = 5.6, c = 4;     //multiple varibales on the same line

        //varibles are stored in the computers ram, each assigned at a specific memory address

        //boolean variable types
        boolean userHasWon = false;         //userHasWon is False
        boolean unicornIsVisible = true;    //unicornIsVisible is True

        /** arithmetic operators
         *  ---------------------------------------------------------------------------------------------------
         *  _ _   _                    _   _                                   _
         *            (_) | | |                  | | (_)                                 | |
         *   __ _ _ __ _| |_| |__  _ __ ___   ___| |_ _  ___    ___  _ __   ___ _ __ __ _| |_ ___  _ __ ___
         *  / _` | '__| | __| '_ \| '_ ` _ \ / _ \ __| |/ __|  / _ \| '_ \ / _ \ '__/ _` | __/ _ \| '__/ __|
         * | (_| | |  | | |_| | | | | | | | |  __/ |_| | (__  | (_) | |_) |  __/ | | (_| | || (_) | |  \__ \
         *  \__,_|_|  |_|\__|_| |_|_| |_| |_|\___|\__|_|\___|  \___/| .__/ \___|_|  \__,_|\__\___/|_|  |___/
         *                                                          | |
         *                                                          |_|
         *  ----------------------------------------------------------------------------------------------------
         */
        int addition = 7+3;        //=10 (simple addition)
        int subtraction = 7-3;     //=4 (simple subtraction)
        int multiplication = 7*3;  //=21 (simple multiplication)
        int division = 7/3;        //=2 (in Java the decimal is left out of an answer)
        int modulo = 7 % 3;        //=1 (Modluo is the remainder after division)

        /* accumulating
           /\                             | |     | | (_)
          /  \   ___ _   _ _ __ ___  _   _| | __ _| |_ _ _ __   __ _
         / /\ \ / __| | | | '_ ` _ \| | | | |/ _` | __| | '_ \ / _` |
        / ____ \ (__| |_| | | | | | | |_| | | (_| | |_| | | | | (_| |
       /_/    \_\___|\__,_|_| |_| |_|\__,_|_|\__,_|\__|_|_| |_|\__, |
                                                                __/ |
                                                               |___/
         */

        //acumulations are first calculated on right of '=' then the value replaces the variable on the left
        //ex.
        int score = 0;        //create variable and assign initial value of 0
        score = score + 100;  //add 100 to the initial score

        /* shortcut operators
             _____ _                _             _        ____                       _
            / ____| |              | |           | |      / __ \                     | |
           | (___ | |__   ___  _ __| |_ ___ _   _| |_    | |  | |_ __   ___ _ __ __ _| |_ ___  _ __ ___
            \___ \| '_ \ / _ \| '__| __/ __| | | | __|   | |  | | '_ \ / _ \ '__/ _` | __/ _ \| '__/ __|
            ____) | | | | (_) | |  | || (__| |_| | |_    | |__| | |_) |  __/ | | (_| | || (_) | |  \__ \
           |_____/|_| |_|\___/|_|   \__\___|\__,_|\__|    \____/| .__/ \___|_|  \__,_|\__\___/|_|  |___/
                                                                | |
                                                                |_|
         */
        int score = 90;
        score += 10;          //adds 10 to the score (score is now 100)
        score -= 25;          //subtracts 25 from the score (score is now 75)
        score *= 10;          //multiplies score by 10 (score is now 750)
        score /= 5;           //divides score by 5 (score is now 150)
        score %= 3;           //score % 3 (sore is now 0)

        /* incrementing and decrementing a variable---------------------------------------------------------------------
         _                                          _   _                               _
        (_)                                        | | (_)                             | |
         _ _ __   ___ _ __ ___ _ __ ___   ___ _ __ | |_ _ _ __   __ _    __ _ _ __   __| |
        | | '_ \ / __| '__/ _ \ '_ ` _ \ / _ \ '_ \| __| | '_ \ / _` |  / _` | '_ \ / _` |
        | | | | | (__| | |  __/ | | | | |  __/ | | | |_| | | | | (_| | | (_| | | | | (_| |
        |_|_| |_|\___|_|  \___|_| |_| |_|\___|_| |_|\__|_|_| |_|\__, |  \__,_|_| |_|\__,_|
                                                                 __/ |
                                                                |___/
            _                                         _   _                                       _       _     _
           | |                                       | | (_)                                     (_)     | |   | |
         __| | ___  ___ _ __ ___ _ __ ___   ___ _ __ | |_ _ _ __   __ _    __ _  __   ____ _ _ __ _  __ _| |__ | | ___
        / _` |/ _ \/ __| '__/ _ \ '_ ` _ \ / _ \ '_ \| __| | '_ \ / _` |  / _` | \ \ / / _` | '__| |/ _` | '_ \| |/ _ \
       | (_| |  __/ (__| | |  __/ | | | | |  __/ | | | |_| | | | | (_| | | (_| |  \ V / (_| | |  | | (_| | |_) | |  __/
        \__,_|\___|\___|_|  \___|_| |_| |_|\___|_| |_|\__|_|_| |_|\__, |  \__,_|   \_/ \__,_|_|  |_|\__,_|_.__/|_|\___|
                                                                   __/ |
                                                                  |___/
       --------------------------------------------------------------------------------------------------------------
         */
        i++;         //increments i by 1
        i = i + i;   //increments i by 1
        i+=1;        //increments i by 1

        i--;         //decrements i by 1
        i = i - 1;   //decrements i by 1
        i-=1;        //decrements i by 1

        /* Casting
          _____          _   _
         / ____|        | | (_)
        | |     __ _ ___| |_ _ _ __   __ _
        | |    / _` / __| __| | '_ \ / _` |
        | |___| (_| \__ \ |_| | | | | (_| |
         \_____\__,_|___/\__|_|_| |_|\__, |
                                      __/ |
                                      |___/
         */
        //casting is used to tell a variable to act as another for the sake of calculation
        int atBats = 5;
        int hits = 2;
        double battingAverage = (double)hits / atBats;

        //manually rounding double variables
        double roundMe = 53.6;
        int result = (int) (roundMe + .5);     //result is 54, int rounds down, so you need to add .5

        /** Relational Operators
          _____      _       _   _                   _    ____                       _
         |  __ \    | |     | | (_)                 | |  / __ \                     | |
         | |__) |___| | __ _| |_ _  ___  _ __   __ _| | | |  | |_ __   ___ _ __ __ _| |_ ___  _ __ ___
         |  _  // _ \ |/ _` | __| |/ _ \| '_ \ / _` | | | |  | | '_ \ / _ \ '__/ _` | __/ _ \| '__/ __|
         | | \ \  __/ | (_| | |_| | (_) | | | | (_| | | | |__| | |_) |  __/ | | (_| | || (_) | |  \__ \
         |_|  \_\___|_|\__,_|\__|_|\___/|_| |_|\__,_|_|  \____/| .__/ \___|_|  \__,_|\__\___/|_|  |___/
                                                              | |
                                                              |_|
         */
        // = vs. == (= is an assignment variable, == is a comparison operator for equality)
        // ! - the 'not' operator

        int a = 6;
        System.out.println(a == 10); //False
        System.out.println(a < 10);  //True
        System.out.println(a >= 10); //False
        System.out.println(a != 10); //True

        // ! as a toggle switch (! can be used as a clever toggle switch)
        boolean playerOneTurn = true;     //playerOneTurn is True
        playerOneturn = !playerOneTurn;   //playerOneTurn is False
        playerOneTurn = !playerOneTurn;   //playerOneTurn is True

        /** Logical Operators
         _                 _           _    ____                       _   _
        | |               (_)         | |  / __ \                     | | (_)
        | |     ___   __ _ _  ___ __ _| | | |  | |_ __   ___ _ __ __ _| |_ _  ___  _ __  ___
        | |    / _ \ / _` | |/ __/ _` | | | |  | | '_ \ / _ \ '__/ _` | __| |/ _ \| '_ \/ __|
        | |___| (_) | (_| | | (_| (_| | | | |__| | |_) |  __/ | | (_| | |_| | (_) | | | \__ \
        |______\___/ \__, |_|\___\__,_|_|  \____/| .__/ \___|_|  \__,_|\__|_|\___/|_| |_|___/
                      __/ |                      | |
                     |___/                       |_|
         */
            /* Coumpound conditionals
                                                           _                       _ _ _   _                   _
                                                          | |                     | (_) | (_)                 | |
            ___ ___  _ __ ___  _ __   ___  _   _ _ __   __| |   ___ ___  _ __   __| |_| |_ _  ___  _ __   __ _| |___
           / __/ _ \| '_ ` _ \| '_ \ / _ \| | | | '_ \ / _` |  / __/ _ \| '_ \ / _` | | __| |/ _ \| '_ \ / _` | / __|
          | (_| (_) | | | | | | |_) | (_) | |_| | | | | (_| | | (_| (_) | | | | (_| | | |_| | (_) | | | | (_| | \__ \
           \___\___/|_| |_| |_| .__/ \___/ \__,_|_| |_|\__,_|  \___\___/|_| |_|\__,_|_|\__|_|\___/|_| |_|\__,_|_|___/
                              | |
                              |_|
             */

        //AND = && (True only if both conditions are True
        //OR = || (True if atleast one variable is true

        //Truth table
                /*
                    First Op.(A)| Second Op.(B)| (A&&B)  | (A||B)
                    ------------|--------------|---------|-------
                        True    |    True      |  True   |  True
                        True    |    False     |  False  |  True
                        False   |    True      |  False  |  True
                        False   |    False     |  False  |  False
                */

        int a = 3, b = 4, c = 5;
        System.out.println(a <= 3 && b != 4);             // False is printed
        System.out.println(4 % 2 == 1 || c / 2 == 1);     // False is printed
        System.out.println(a > 2 && (b > 5 || c < 6));    // True is printed

        /* Short circuit evaluation
          _____ _                _          _                _ _                     _             _   _
         / ____| |              | |        (_)              (_) |                   | |           | | (_)
        | (___ | |__   ___  _ __| |_    ___ _ _ __ ___ _   _ _| |_    _____   ____ _| |_   _  __ _| |_ _  ___  _ __
         \___ \| '_ \ / _ \| '__| __|  / __| | '__/ __| | | | | __|  / _ \ \ / / _` | | | | |/ _` | __| |/ _ \| '_ \
         ____) | | | | (_) | |  | |_  | (__| | | | (__| |_| | | |_  |  __/\ V / (_| | | |_| | (_| | |_| | (_) | | | |
        |_____/|_| |_|\___/|_|   \__|  \___|_|_|  \___|\__,_|_|\__|  \___| \_/ \__,_|_|\__,_|\__,_|\__|_|\___/|_| |_|

         */

        //as soon as the result of the final is known the remainder is not even preformed

        System.out.println(1 < 3 || (a >= c - b % a + (b + a / 7) - (a % b +c)))
                //as soon as 1 < 3 returns true the final is true since it is an or statement, the rest never runs

        int total = 0;
        int count = 0;
        boolean result = (count != 0 && total / count > 0);
            //short circuit evaluation avoids the divide by 0 error, because the first false makes the && false overall

        /* DeMorgan's Law
         _____       __  __                             _       _
        |  __ \     |  \/  |                           ( )     | |
        | |  | | ___| \  / | ___  _ __ __ _  __ _ _ __ |/ ___  | |     __ ___      __
        | |  | |/ _ \ |\/| |/ _ \| '__/ _` |/ _` | '_ \  / __| | |    / _` \ \ /\ / /
        | |__| |  __/ |  | | (_) | | | (_| | (_| | | | | \__ \ | |___| (_| |\ V  V /
        |_____/ \___|_|  |_|\___/|_|  \__, |\__,_|_| |_| |___/ |______\__,_| \_/\_/
                                       __/ |
                                      |___/
         */

        /*

               Compound conditional | Applying DeMorgans law
               ---------------------|-----------------------
                     !(a && b)      |      !a || !b
                     !(a || b)      |      !a && !b

         */

        int a = 2, b = 3;
        boolean result1 = !(b == 3 && a < 1);       //result1 is True   b != 3 || a > 1
        boolean result2 = !(a != 2 || b <= 4);      //result2 is False  a == 2 && b >= 4

        /** Conditional statements
           _____                _ _ _   _                   _       _        _                            _
          / ____|              | (_) | (_)                 | |     | |      | |                          | |
         | |     ___  _ __   __| |_| |_ _  ___  _ __   __ _| |  ___| |_ __ _| |_ ___ _ __ ___   ___ _ __ | |_ ___
         | |    / _ \| '_ \ / _` | | __| |/ _ \| '_ \ / _` | | / __| __/ _` | __/ _ \ '_ ` _ \ / _ \ '_ \| __/ __|
         | |___| (_) | | | | (_| | | |_| | (_) | | | | (_| | | \__ \ || (_| | ||  __/ | | | | |  __/ | | | |_\__ \
         \_____\___/|_| |_|\__,_|_|\__|_|\___/|_| |_|\__,_|_| |___/\__\__,_|\__\___|_| |_| |_|\___|_| |_|\__|___/

         */

        //If you want your program to be dynamic and branch out based off of inputs you will need coditional staements

        /* The If Statement
         _______ _            _____  __    _____ _        _                            _
        |__   __| |          |_   _|/ _|  / ____| |      | |                          | |
           | |  | |__   ___    | | | |_  | (___ | |_ __ _| |_ ___ _ __ ___   ___ _ __ | |_
           | |  | '_ \ / _ \   | | |  _|  \___ \| __/ _` | __/ _ \ '_ ` _ \ / _ \ '_ \| __|
           | |  | | | |  __/  _| |_| |    ____) | || (_| | ||  __/ | | | | |  __/ | | | |_
           |_|  |_| |_|\___| |_____|_|   |_____/ \__\__,_|\__\___|_| |_| |_|\___|_| |_|\__|

         */

        //a conditional statement in its simpilest form, the program executes code if a condition is met, skipped otherwise

        if (condition)
        {
            //code to be executed
        }

        /* The If-Else statement
         _______ _            _____  __        ______ _                _        _                            _
        |__   __| |          |_   _|/ _|      |  ____| |              | |      | |                          | |
           | |  | |__   ___    | | | |_ ______| |__  | |___  ___   ___| |_ __ _| |_ ___ _ __ ___   ___ _ __ | |_
           | |  | '_ \ / _ \   | | |  _|______|  __| | / __|/ _ \ / __| __/ _` | __/ _ \ '_ ` _ \ / _ \ '_ \| __|
           | |  | | | |  __/  _| |_| |        | |____| \__ \  __/ \__ \ || (_| | ||  __/ | | | | |  __/ | | | |_
           |_|  |_| |_|\___| |_____|_|        |______|_|___/\___| |___/\__\__,_|\__\___|_| |_| |_|\___|_| |_|\__|

         */

        //This allows the program to execute certain code if conditon is true and another if it is false
        if (condition)
        {
            //command
        }
        else
        {
            //command2
        }
        //example 3(conditional)--------------------------------------------------------------------------------
        if (condition1 && condition2)
        {
            //both conditions are true
        }
        else
        {
            //either one is false or both are false
        }
        //example 4 (nested)----------------------------------------------------------------------------------
        if (condition1)
        {
            //condition1 is True
            if (condition2)
            {
                //condition1 is True and so is condition2
            }
            else
            {
                //condition1 is True, but condition2 is False
            }
        }
        else
        {
            //condition1 is False
            if (condition2)
            {
                //condition1 is False, but condition2 is True
            }
            else
            {
                //condition1 is False and so is condition2
            }
        }
        //example 5 (single line) -------------------------------------------------------------------------
        if (condition)
            //single line commands dont need brackets
        else
            //single line coomands dont need brackets

        /* The Dangling else
         _______ _                _                   _ _                    _
        |__   __| |              | |                 | (_)                  | |
           | |  | |__   ___    __| | __ _ _ __   __ _| |_ _ __   __ _    ___| |___  ___
           | |  | '_ \ / _ \  / _` |/ _` | '_ \ / _` | | | '_ \ / _` |  / _ \ / __|/ _ \
           | |  | | | |  __/ | (_| | (_| | | | | (_| | | | | | | (_| | |  __/ \__ \  __/
           |_|  |_| |_|\___|  \__,_|\__,_|_| |_|\__, |_|_|_| |_|\__, |  \___|_|___/\___|
                                                 __/ |           __/ |
                                                |___/           |___/
         */

        //happens when curly brackets are not use correctly, else statements connect to the closet if, not correct one

        if (condition)
            //preformed when condition1 is true
            if(condition2)
                //preformed when condition 1 and 2 are True
        else
            //preformed when both 1 and 2 are both false (connected to the closet if)

        /** Scope of a variable
           _____                               __          __      __        _       _     _
          / ____|                             / _|         \ \    / /       (_)     | |   | |
         | (___   ___ ___  _ __   ___    ___ | |_    __ _   \ \  / /_ _ _ __ _  __ _| |__ | | ___
          \___ \ / __/ _ \| '_ \ / _ \  / _ \|  _|  / _` |   \ \/ / _` | '__| |/ _` | '_ \| |/ _ \
          ____) | (_| (_) | |_) |  __/ | (_) | |   | (_| |    \  / (_| | |  | | (_| | |_) | |  __/
         |_____/ \___\___/| .__/ \___|  \___/|_|    \__,_|     \/ \__,_|_|  |_|\__,_|_.__/|_|\___|
                          | |
                          |_|
         */

        //refers to code that knows that varible exists
        //local variables are only known within the block of code they are written in

        {
            //a group of code within curly baraces
            //is called a "block of code". Variables written within a block
            //of code are only known within that block of code.
        }

        /** Looping statements
         _                       _                   _        _                            _
        | |                     (_)                 | |      | |                          | |
        | |     ___   ___  _ __  _ _ __   __ _   ___| |_ __ _| |_ ___ _ __ ___   ___ _ __ | |_ ___
        | |    / _ \ / _ \| '_ \| | '_ \ / _` | / __| __/ _` | __/ _ \ '_ ` _ \ / _ \ '_ \| __/ __|
        | |___| (_) | (_) | |_) | | | | | (_| | \__ \ || (_| | ||  __/ | | | | |  __/ | | | |_\__ \
        |______\___/ \___/| .__/|_|_| |_|\__, | |___/\__\__,_|\__\___|_| |_| |_|\___|_| |_|\__|___/
                          | |             __/ |
                          |_|            |___/
         */
        /*
            Suppose your strict teacher has caught you chewing gum in their class and your punishment
            is to write out "I will not chew gum in class." 100 times. If you were to use a computer
            to cheat the system (as most programmers like to do) You would use loop to cheat your way through this
         */

        /* For Loop
         ______            _
        |  ____|          | |
        | |__ ___  _ __   | |     ___   ___  _ __
        |  __/ _ \| '__|  | |    / _ \ / _ \| '_ \
        | | | (_) | |     | |___| (_) | (_) | |_) |
        |_|  \___/|_|     |______\___/ \___/| .__/
                                            | |
                                            |_|
         */

        //General Form for Creating a for Loop
        for (initialize loop control variable(LCV);condition using LCV; modifying LCV)
        {
            //instructions to be repeated
        }

        /*
            The loop uses a loop control variable (LCV) to repeat instructions. The variable is typically an int
            and is allowed to have a one-letter name like i, j, k and so on. Yes this does break the "have a
            meaningful variable name", but like us its a rebel
         */
       ------------------------------------------------------------------|
        for (int i = 0; /*step 1*/ i < 5; /*step 2*/ i++; /*step4*/ )    |
        {                                                                |
            System.out.println(i); //step 3                              |
        }                                                                |
        //step 5                                                         |
        ------------------------------------------------------------------
        //step1 = declares and initilizes the loop control variable
        //step2 = Evaluates the condition to see if the loop should countinue
        //step3 = preforms the code if step2 is True
        //step4 = modifies the LCV in someway, usually increments or decrements (increments in our case)
        //step5 = when the condition evaluates false, the for loop is exited

        //-------------------------------------------------------------------------------------------------

        for (int i = 0; i < 100; i++;)
        {
            System.out.println("I will not chew gum in class.");
        }
        //This for loop would return "I will not chew gum in class." 100 times (we have succefully cheated life)

        //--------------------------------------------------------------------------------------------------------

        //the LCV cannot be refreenced outside of the for loop ex.
        for (int k = 1; k <= 4; k++)
        {
            System.out.println(k);
        }
        System.out.println(k*10);
        // "Compile-time error: k cannot be resolved to a variable" is returned

        //----------------------------------------------------------------------------------------------------------

        //you can however declare the LCV outside of the for loop and then you can refrence it outside the for loop
        int i;
        for (i = 1; i < 5;i++)
        {
            System.out.println(i);
        }
        System.out.println(i);
        /*
                returns:
                1
                2
                3
                4
                5
         */

        /----------------------------------------------------------------------------------------------------------

        /* The Nested For Loop
         _______ _             _   _           _           _     __              _
        |__   __| |           | \ | |         | |         | |   / _|            | |
           | |  | |__   ___   |  \| | ___  ___| |_ ___  __| |  | |_ ___  _ __   | |     ___   ___  _ __
           | |  | '_ \ / _ \  | . ` |/ _ \/ __| __/ _ \/ _` |  |  _/ _ \| '__|  | |    / _ \ / _ \| '_ \
           | |  | | | |  __/  | |\  |  __/\__ \ ||  __/ (_| |  | || (_) | |     | |___| (_) | (_) | |_) |
           |_|  |_| |_|\___|  |_| \_|\___||___/\__\___|\__,_|  |_| \___/|_|     |______\___/ \___/| .__/
                                                                                                  | |
                                                                                                  |_|
         */

        //General Form for a nested loop-------------------------------------------------------------

        for (initiilize OLCV; condition using OLCV; modify OLCV)
        {
            for (initilize ILCV; condition using ILCV; modify ILCV)
            {
                //instructions to be repeated
            }
        }

        //----------------------------------------------------------------------------------------------

        //Example--------------------------------------------------------------------------------------

        for (int i = 0; i < 3; i++)                   //outer loop repeated 3 times
        {
            for (int j = 1; j < 5; j++)              //inner loop repeated 4 times
            {
                System.out.println(i + "    " + j);  //total iterations 12 (3*4)
            }
        }

        /*
              returns
              0    1
              0    2
              0    3
              0    4
              1    1
              1    2
              1    3
              1    4
              2    1
              2    2
              2    3
              2    4
         */

        //--------------------------------------------------------------------------------------------------------

        /** While Loops
        __          ___     _ _         _
        \ \        / / |   (_) |       | |
         \ \  /\  / /| |__  _| | ___   | |     ___   ___  _ __  ___
          \ \/  \/ / | '_ \| | |/ _ \  | |    / _ \ / _ \| '_ \/ __|
           \  /\  /  | | | | | |  __/  | |___| (_) | (_) | |_) \__ \
            \/  \/   |_| |_|_|_|\___|  |______\___/ \___/| .__/|___/
                                                         | |
                                                         |_|
         */
        /*
            consider a software that is used at a store to check put a customer. The clerk would drag items over
            a scanner until there are no items left to be scanned. A while loop works bes tin this situation
            because it scans until there are no more left. If the customer told us how many items they had before then
            a if statement would be better.
         */

        //---------------------------------------------------------------------------------

        //general form for a while loop
        while (condition)
        {
            //one or more instructions to be repeated
        }

        //example1---------------------------------------------------------------------

        int items = 25;
        while (items != 0)
        {
            //scan each item
            //add the price to the total
        }

        //example2--------------------------------------------------------------------

        System.out.print("Enter Secret Passcode:  ");
        int secretPasscode = /* int provided by user */
        while (secretPasscode != 1234)
        {
            System.out.println("Sorry that is not the secret passcode. Try again:  ");
            secretPasscode = /* provided by user */
        }
        System.out.println("congratulations you have gained access to the vault.");

        /*
            returns
            Enter the passcode: 9999
            Sorry that is not the secret passcode. Try again:  8888
            Sorry that is not the secret passcode. Try again:  1234
            congratulations you have gained access to the vault.
         */

        //---------------------------------------------------------------------------------------------

        /** Flags in Programming
         ______ _                    _          _____                                               _
        |  ____| |                  (_)        |  __ \                                             (_)
        | |__  | | __ _  __ _ ___    _ _ __    | |__) | __ ___   __ _ _ __ __ _ _ __ ___  _ __ ___  _ _ __   __ _
        |  __| | |/ _` |/ _` / __|  | | '_ \   |  ___/ '__/ _ \ / _` | '__/ _` | '_ ` _ \| '_ ` _ \| | '_ \ / _` |
        | |    | | (_| | (_| \__ \  | | | | |  | |   | | | (_) | (_| | | | (_| | | | | | | | | | | | | | | | (_| |
        |_|    |_|\__,_|\__, |___/  |_|_| |_|  |_|   |_|  \___/ \__, |_|  \__,_|_| |_| |_|_| |_| |_|_|_| |_|\__, |
                         __/ |                                   __/ |                                       __/ |
                        |___/                                   |___/                                       |___/
         */

        //--------------------------------------------------------------------------------------------------------
        /*
            Flags are virtual ways to signal something important has happened. Normally Boolean variables are used
            as flags. origionally set to False and then changed to True when something important happens
         */

        boolean gameOver = false;
        while (!gameOver)
        {
            //play the game
            //When a player wins, set gameOver = True
        }

        //--------------------------------------------------------------------------------------------------------

        /** The Infinite Loop
         _______ _             _____        __ _       _ _          _
        |__   __| |           |_   _|      / _(_)     (_) |        | |
           | |  | |__   ___     | |  _ __ | |_ _ _ __  _| |_ ___   | |     ___   ___  _ __
           | |  | '_ \ / _ \    | | | '_ \|  _| | '_ \| | __/ _ \  | |    / _ \ / _ \| '_ \
           | |  | | | |  __/   _| |_| | | | | | | | | | | ||  __/  | |___| (_) | (_) | |_) |
           |_|  |_| |_|\___|  |_____|_| |_|_| |_|_| |_|_|\__\___|  |______\___/ \___/| .__/
                                                                                     | |
                                                                                     |_|
         */

        //If you make a mistake when making a loop so that the loop never ends you get a infinite loop

        //----------------------------------------------------------------------------------------------------

        //accidently getting a infinite loop when using a for loop:
        for (int i = 0; i < 10; i--)
        {
            i++;
            // i will always revert back to zero and i will never not be be greater < 10 resulting in a infinite loop
        }

        //------------------------------------------------------------------------------------------------------

        //accidently getting an infinite loop when using a while loop:
        int i = 0;
        while (i<10)
        {
            //do something forever because i never increments
        }

        //-------------------------------------------------------------------------------------------------------

        /** Boundary testing
         ____                        _                     _______        _   _
        |  _ \                      | |                   |__   __|      | | (_)
        | |_) | ___  _   _ _ __   __| | __ _ _ __ _   _      | | ___  ___| |_ _ _ __   __ _
        |  _ < / _ \| | | | '_ \ / _` |/ _` | '__| | | |     | |/ _ \/ __| __| | '_ \ / _` |
        | |_) | (_) | |_| | | | | (_| | (_| | |  | |_| |     | |  __/\__ \ |_| | | | | (_| |
        |____/ \___/ \__,_|_| |_|\__,_|\__,_|_|   \__, |     |_|\___||___/\__|_|_| |_|\__, |
                                                   __/ |                               __/ |
                                                  |___/                               |___/

         */
        /*
            A very comman error when using a for loop or while loop is called a boundary error. It means you
            accodently went one number past or one number short of the right amount. This concept is tested
            many times on the APCS exam.

         */
        //-------------------------------------------------------------------------------------------------

        for (int i = 0; i < maximum; i++)
        {
            //the loop will run "maximum" number of times if you make 1 then it will run 1 too high
        }

        //-------------------------------------------------------------------------------------------------

        /** Bases other than Decimal
         ____                               _   _                  _   _
        |  _ \                             | | | |                | | | |
        | |_) | __ _ ___  ___  ___     ___ | |_| |__   ___ _ __   | |_| |__   __ _ _ __
        |  _ < / _` / __|/ _ \/ __|   / _ \| __| '_ \ / _ \ '__|  | __| '_ \ / _` | '_ \
        | |_) | (_| \__ \  __/\__ \  | (_) | |_| | | |  __/ |     | |_| | | | (_| | | | |
        |____/ \__,_|___/\___||___/   \___/ \__|_| |_|\___|_|      \__|_| |_|\__,_|_| |_|

                               _____            _                 _
                              |  __ \          (_)               | |
                              | |  | | ___  ___ _ _ __ ___   __ _| |
                              | |  | |/ _ \/ __| | '_ ` _ \ / _` | |
                              | |__| |  __/ (__| | | | | | | (_| | |
                              |_____/ \___|\___|_|_| |_| |_|\__,_|_|
         */

        /*
            As humans we are familliar with base 10 or decimal, but computers are familiar with base 2 (binary),
            base 8 (octal), base 16 (hexadecimal). The APCS exam requires you to know how to convert between all 3
            and also understand the underpinnings of place value systems other than decimal

           --------------------------------------------------------------------------
           |  System    | Base | Digits                          | Number of Digits |
            ------------|------|---------------------------------|------------------|
            Decimal     |  10  | 0,1,2,3,4,5,6,7,8,9             |        10        |
            Binary      |  2   | 0,1                             |        2         |
            Octal       |  8   | 0,1,2,3,4,5,6,7                 |        8         |
            Hexadecimal |  16  | 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F |        16        |
            -------------------------------------------------------------------------
         */

        /* Decimal
         _____            _                 _
        |  __ \          (_)               | |
        | |  | | ___  ___ _ _ __ ___   __ _| |
        | |  | |/ _ \/ __| | '_ ` _ \ / _` | |
        | |__| |  __/ (__| | | | | | | (_| | |
        |_____/ \___|\___|_|_| |_| |_|\__,_|_|

         */
        /*
                2   3  7  5 dec =   2 x 10^3 = 2000
                ^   ^  ^  ^         3 x 10^2 = 300
                |   |  |  |         7 x 10^1 = 70
                |   |  |  |       + 5 x 10^0 = 5
              10^3  |10^1 |          ---------------
                  10^2  10^0                     2375 dec
         */

        /* Binary to Decimal
         ____  _                           _           _____            _                 _
        |  _ \(_)                         | |         |  __ \          (_)               | |
        | |_) |_ _ __   __ _ _ __ _   _   | |_ ___    | |  | | ___  ___ _ _ __ ___   __ _| |
        |  _ <| | '_ \ / _` | '__| | | |  | __/ _ \   | |  | |/ _ \/ __| | '_ ` _ \ / _` | |
        | |_) | | | | | (_| | |  | |_| |  | || (_) |  | |__| |  __/ (__| | | | | | | (_| | |
        |____/|_|_| |_|\__,_|_|   \__, |   \__\___/   |_____/ \___|\___|_|_| |_| |_|\__,_|_|
                                   __/ |
                                  |___/
         */

        /*
               1   0   0   1 bin =  1 x 2^3 = 8
               ^   ^   ^   ^        0 x 2^2 = 0
               |   |   |   |        0 x 2^1 = 0
               |   |   |   |      + 1 x 2^0 = 1
              2^3  |  2^1  |      --------------
                  2^2     2^0     therefore 1001 = 9 dec
         */

        /* Octal to Decimal
          ____       _        _    _           _____            _                 _
         / __ \     | |      | |  | |         |  __ \          (_)               | |
        | |  | | ___| |_ __ _| |  | |_ ___    | |  | | ___  ___ _ _ __ ___   __ _| |
        | |  | |/ __| __/ _` | |  | __/ _ \   | |  | |/ _ \/ __| | '_ ` _ \ / _` | |
        | |__| | (__| || (_| | |  | || (_) |  | |__| |  __/ (__| | | | | | | (_| | |
         \____/ \___|\__\__,_|_|   \__\___/   |_____/ \___|\___|_|_| |_| |_|\__,_|_|
        */

        /*
              2   3   7   5 oct =  2 x 8^3 = 1024
              ^   ^   ^   ^        3 x 8^2 = 192
              |   |   |   |        7 x 8^1 = 56
              |   |   |   |      + 5 x 8^0 = 5
             8^3  |  8^1  |      ---------------
                 8^2     8^0      2375 oct = 1277 dec
         */

        /* hexadecimal to Decimal

        _    _                    _           _                 _    _           _____            _                 _
       | |  | |                  | |         (_)               | |  | |         |  __ \          (_)               | |
       | |__| | _____  ____ _  __| | ___  ___ _ _ __ ___   __ _| |  | |_ ___    | |  | | ___  ___ _ _ __ ___   __ _| |
       |  __  |/ _ \ \/ / _` |/ _` |/ _ \/ __| | '_ ` _ \ / _` | |  | __/ _ \   | |  | |/ _ \/ __| | '_ ` _ \ / _` | |
       | |  | |  __/>  < (_| | (_| |  __/ (__| | | | | | | (_| | |  | || (_) |  | |__| |  __/ (__| | | | | | | (_| | |
       |_|  |_|\___/_/\_\__,_|\__,_|\___|\___|_|_| |_| |_|\__,_|_|   \__\___/   |_____/ \___|\___|_|_| |_| |_|\__,_|_|
        */

        /*
             2   A   F   5 hex = 2  x 16^3 = 8192
             ^   ^   ^   ^       10 x 16^2 = 2560
             |   |   |   |       15 x 16^1 = 240
             |   |   |   |     +  5 x 16^0 = 5
           16^3  | 16^1  |     -------------------
               16^2    16^0     2AF5 hex = 10997 dec
         */

        /**
         * Why do computer scientists get xmas and halloween confused?? 31 oct = 25 dec
         */

        /** Commenting code
          _____                                     _   _                 _____          _
         / ____|                                   | | (_)               / ____|        | |
        | |     ___  _ __ ___  _ __ ___   ___ _ __ | |_ _ _ __   __ _   | |     ___   __| | ___
        | |    / _ \| '_ ` _ \| '_ ` _ \ / _ \ '_ \| __| | '_ \ / _` |  | |    / _ \ / _` |/ _ \
        | |___| (_) | | | | | | | | | | |  __/ | | | |_| | | | | (_| |  | |___| (_) | (_| |  __/
         \_____\___/|_| |_| |_|_| |_| |_|\___|_| |_|\__|_|_| |_|\__, |   \_____\___/ \__,_|\___|
                                                                 __/ |
                                                                |___/
         */

            //obviously "//" is how you do an inline comment

            /*
                this is how you do a
                multiline comment
             */

        /**
         * This is a JavaDoc comment (documentation comments)
         * You will see thes on the APCS exam
         */

        /** Types of errors
         _______                              __    ______
        |__   __|                            / _|  |  ____|
           | |_   _ _ __   ___  ___     ___ | |_   | |__   _ __ _ __ ___  _ __ ___
           | | | | | '_ \ / _ \/ __|   / _ \|  _|  |  __| | '__| '__/ _ \| '__/ __|
           | | |_| | |_) |  __/\__ \  | (_) | |    | |____| |  | | | (_) | |  \__ \
           |_|\__, | .__/ \___||___/   \___/|_|    |______|_|  |_|  \___/|_|  |___/
               __/ | |
              |___/|_|

         */

        /* Compile-time errors
          _____                      _ _             _   _
         / ____|                    (_) |           | | (_)
        | |     ___  _ __ ___  _ __  _| | ___ ______| |_ _ _ __ ___   ___     ___ _ __ _ __ ___  _ __ ___
        | |    / _ \| '_ ` _ \| '_ \| | |/ _ \______| __| | '_ ` _ \ / _ \   / _ \ '__| '__/ _ \| '__/ __|
        | |___| (_) | | | | | | |_) | | |  __/      | |_| | | | | | |  __/  |  __/ |  | | | (_) | |  \__ \
         \_____\___/|_| |_| |_| .__/|_|_|\___|       \__|_|_| |_| |_|\___|   \___|_|  |_|  \___/|_|  |___/
                      | |
                      |_|
         */


        /*
            You will get these errors when you have errors in your syntax. The compiler cant compile your code and
            returns a compile-times error

            common causes

            Forgetting a semicolon at the end of a line
            Forgetting to put a data type for a variable
            Using a keyword as a variable name
            Forgetting to initilize a variable
            Forgettign a curly brace
         */

        /* Run-time exeptions
         _____                   _   _                                           _   _
        |  __ \                 | | (_)                                         | | (_)
        | |__) |   _ _ __ ______| |_ _ _ __ ___   ___     _____  _____ ___ _ __ | |_ _  ___  _ __  ___
        |  _  / | | | '_ \______| __| | '_ ` _ \ / _ \   / _ \ \/ / __/ _ \ '_ \| __| |/ _ \| '_ \/ __|
        | | \ \ |_| | | | |     | |_| | | | | | |  __/  |  __/>  < (_|  __/ |_) | |_| | (_) | | | \__ \
        |_|  \_\__,_|_| |_|      \__|_|_| |_| |_|\___|   \___/_/\_\___\___| .__/ \__|_|\___/|_| |_|___/
                                                                          | |
                                                                          |_|
         */
        /*
            If your program crashes while it is running then you have a run-time error. The compiler will display the
            error and it may have the word exeption in it.

            common apperances

            ArithmeticExeption (explained in this concept)
            NullPointerExeption (explained in Concept 3: The string class)
            IndexOutOfBoundsExeption (explained in Concept 5: Data Structures)
            ArrayIndexOutOfBoundsExeption (explained in concept 5: Data Structures)
            IllegalExeption (explained in concept 7: Classes and Objects)
         */

        /* Logic Errors
         _                 _         ______
        | |               (_)       |  ____|
        | |     ___   __ _ _  ___   | |__   _ __ _ __ ___  _ __ ___
        | |    / _ \ / _` | |/ __|  |  __| | '__| '__/ _ \| '__/ __|
        | |___| (_) | (_| | | (__   | |____| |  | | | (_) | |  \__ \
        |______\___/ \__, |_|\___|  |______|_|  |_|  \___/|_|  |___/
                      __/ |
                     |___/

         */
        /*
            when your program compiles anf runs without crashing, but doesent do what you expected it to do, then you
            have a logic error. A logic error is the most challenging error to fox because you have to figure out
            where the problem is in you code. Is your math correct? Are your if statements comparing correctly?
            Does your loop actually do what it's supposed to? Are any statments out of order?

            This requires you to read your code very carefully

            You will have to do plenty of this i n multiple choice questions on the APCS exam
         */

        /* Debugging
         _____       _                       _
        |  __ \     | |                     (_)
        | |  | | ___| |__  _   _  __ _  __ _ _ _ __   __ _
        | |  | |/ _ \ '_ \| | | |/ _` |/ _` | | '_ \ / _` |
        | |__| |  __/ |_) | |_| | (_| | (_| | | | | | (_| |
        |_____/ \___|_.__/ \__,_|\__, |\__, |_|_| |_|\__, |
                                  __/ | __/ |         __/ |
                                 |___/ |___/         |___/

         */

        /*
            Fun fact: Grace Murray documented the first actual computer bug on September 9, 1947. It was a Moth
            that got caught in relay #70 in Panel F of the Harvard Mark II Computer
         */

        //the process of removing these errors is called "debugging" you will have to debug on the APCS exam

        System.out.println() //is a great debugging device, you can print steps of ur code to check that it works

    }
}

