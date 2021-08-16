//algorithms

/*
the word algorithm can be simply defined as 'a process to be followed to solve
a problem
 */

 /*
    In this chapter i will teach you to write your own algorithms using examples
    rather tahn teach youall of the infinite algorithms out there
  */

/** The Swap Algorithm **/

/*
    Swapping is the concept of switching values that are stored in two variables
    this algorithm will be crucial for sorting algorithms (taught in concept 12)
    you are going to need to use a temporary value to swap the values
 */


int a = 6;
int b = 8;
c = a;
a = b;
b = c;                 //the value of b is now 6 and the value of a is 8

/** The copy algorithm for the Array and the ArrayList **/

/*
    Making a copy of an Array or an ArrayList means to create a brand-new object
    that is a duplicate of the original. This is diffrent that creating a new array
    or arrayList variable that refrences teh same object. This is diffrent because
    these are now 2 diffent objects in memory and you can edit one without editing
    the other
 */

//array for-loop

int[] original = {23, 51, 14, 50};
int[] duplicate = new int[original.length];

for(int i =0; i < original.length; i++);
        {
            duplicate[i] = original[i];
        }

// array for-each loop

int[] original = {23, 51, 14, 50};
int[] duplicate = new int[original.length];
int index = 0;

for(int temp : original)
        {
            duplicate[index] = temp;
            index ++;
        }

//ArrayList for loop

ArrayList<Integer> original = new ArrayList<Integer>();
original.add(23);
original.add(51);
original.add(14);
original.add(50);
ArrayList<Integer> duplicate = new ArrayList<Integer>();

for (int i = 0; i < original.size(); i++)
        {
            duplicate.add(original.get(i));  //get the original and add it to the
                                                    //duplicate
        }


//ArrayList for-each Loop
ArrayList<Integer> original = new ArrayList<Integer>();
original.add(23);
original.add(51);
original.add(14);
original.add(50);
ArrayList<Integer> duplicate = new ArrayList<Integer>();

for (Integer temp : original)
        {
            dublicate.add(temp);
        }

/** The Sequential Search Algorithm **/

/*
    When you search for an ITunes for a song, how does it actually find the song?
    It may use a sequential search in the process of looking at each of the
    the elements one at a time until you find what you need
 */

//search for sweet caroline in a list of song titles

//Look at every item in the list

public int searchForTitle(String[] titles, String target)
        {
            int foundIndex = -1;                       //default index -1 shows if not found
            for (int i = 0; i < titles.length; i++)
            {
                if (titles[i].equals(target))
                {
                    foundIndex = i;                    //remember this index
                }
            }
            return foundIndex;                     //return the index
        }

//Stop looking if you find teh target (more efficent)

public int searchForTitle(String[] titles, String target)
        {
            int index = 0;
            while (index < titles.length)
            {
                if (titles[index].equals(target))
                {
                    return index;                 //target was found
                }
                index++;                          //target was not found
            }
            return -1;    //after searching teh entire list, the target was not found
        }

/** Efficiency **/
/*
    an efficent algorithm does its job in teh fastest way it can. Efficent programs are optimized to reduce CPU
    usage time and storage use

    The second algorithm is more effiecnt than the first because it stops once it finds its target and will
    not countinue to use the CPU after its goal was completed.
 */

/** the Accumulate Algorithm **/

/*
    Suppose you have list of all the baseball players on a team and you want to find teh total number of hits
    that the team had.
 */

//Array for-each loop

public int findSum(int[] arr)
        {
            int sum = 0;               //initalizing the sum to 0
            for(int value : arr)       //for every int in arr
            {
                sum += value;          // add the element to the sum
            }
            return sum;               // return teh sum
        }

//Array for loop

public int findSum(int[] arr)
        {
            int sum = 0;
            for (int i = 0; i < arr.length; i++)
            {
                sum += arr[i];
            }
            return sum;
        }

//using a 2-D Array (Row-major order)

public int findSum(int[][] arr)
        {
            int sum = 0;                                           //initilize sum to 0
            for (int row = 0; row < arr.length; row++)             //do every row
            {
                for (int col = 0; col < arr[row].length; col++)

                {                                                 //do every column in the row
                    sum += arr[row][col];                         // add value in cell to sum
                }
            }
            return sum;                                          //return sum
        }

/** the Find-Highest algorithm **/

/*
    Find the highest score in a list, maybe a high score?
 */

//using an array (for loop)
public int findHigh(int[] arr)
        {
            int high = arr[0];
            for (int i = 1; i < arr.length; i++)
            {
                if (arr[i] > high)
                    high = arr[i];
            }
            return high;
        }

//using an array (for-each loop)

public int findHigh(int[] arr)
        {
            int high = arr[0];
            for (int value : arr)
            {
                if (value > high)
                {
                    high = value;
                }
            }
            return high
        }

//using a 2-D array (row-major order)

public int findHigh(int[][] arr)
        {
            int high = arr[0][0];
            for (int row = 0; row < arr.length; row++)
            {
                for (int col = 0; col < arr[row].length; col++)
                {
                    if (arr[row][col] > high)
                    {
                        high = arr[row][col];
                    }
                }
            }
            return high;
        }

// using an ArrayList (for-each loop)

public int findHigh(ArrayList<Integer> arr)
        {
            int high = arr.get(0);
            for (int value : arr)
            {
                if (value > high)
                {
                    high = value;
                }
            }
            return high;
        }

//using an ArrayList (for loop)

public int findHigh(ArrayList<Integer> arr)
        {
            int high = arr.get(0);
            for (int i = 0; i < arr.size(); i++)
            {
                if (arr.get(i) > high)
                {
                    high = arr.get(i);
                }
            }
            return high;
        }

/** Find the lowest algorithm **/

/*
    The find lowest is similar but to make sure to find the lowest you cant set the iniitial to the first
    number in the list, you have to set the high to a really high number (use Integer.MAX_VALUE)
    or set a low value to a really low number (use Integer.MIN_VALUE)
 */
