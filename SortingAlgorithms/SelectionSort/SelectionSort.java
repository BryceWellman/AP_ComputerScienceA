public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] myArray = {69,420, 211, 132, 413, 134, 87};
        selectionSort(myArray);
        for (int i : myArray)
        {
            System.out.print(i+"\t");
        }
    }

    public static void selectionSort(int[] arr)
    {
        for (int j = 0; j < arr.length - 1; j++)
        {
            int index = j;
            for (int k = j + 1; k < arr.length; k++)
            {
                if (arr[k] < arr[index])
                    index = k;
            }

            int temp = arr[j];
            arr[j] = arr[index];
            arr[index] = temp;
        }
    }


}