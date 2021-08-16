public class MergeSort
{
    private static int[] myArray;
    private static int[] tempArray;

    public static void main(String[] args)
    {
        int[] inputArray = {69,420, 211, 132, 413, 134, 87, 92, 212};
        mergeSort(inputArray);
        for (int i : inputArray)
        {
            System.out.print(i+"\t");
        }
    }

    private static void mergeSort(int arr[])
    {
        myArray = arr;
        int length = arr.length;
        tempArray = new int[length];
        setUpMerge(0, length -1);
    }

    private static void setUpMerge(int lower, int higher)
    {
        if (lower < higher)
        {
            int middle = lower + (higher - lower) /2;
            setUpMerge(lower, middle);
            setUpMerge(middle + 1, higher);
            doTheMerge(lower, middle, higher);
        }
    }

    private static void doTheMerge(int lower, int middle, int higher)
    {
        for (int i = lower; i <= higher; i++)
        {
            tempArray[i]=myArray[i];
        }
        int i = lower;
        int j = middle;
        int k = lower;
        while (i <= middle && j <= higher)
        {
            if (tempArray[i] <= tempArray[j])
            {
                myArray[k] = tempArray[i];
                i++;
            }
            else
            {
                myArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i<=middle)
        {
            myArray[k] = tempArray[i];
            k++;
            i++;
        }
    }

}