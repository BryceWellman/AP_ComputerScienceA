public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] myArray = {69,420, 211, 132, 413, 134, 87};
        insertionSort(myArray);
        for (int i : myArray)
        {
            System.out.print(i+"\t");
        }
    }

    public static void insertionSort(int[] arr)
    {
        for (int j = 1; j < arr.length; j++)
        {
            int temp = arr[j];
            int index = j;
            while (index > 0 && temp < arr[index - 1])
            {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = temp;
        }
    }
}