public class BinarySearch
{
    public static void main(String[] args)
    {
        int [] Array = {23, 146, 57, 467, 69, 36, 184, 492, 100};
        int searchTarget = 57;
        insertionSort(Array);

        System.out.println(binarySearch(searchTarget, Array));
    }

    public static boolean binarySearch(int target, int[] data)
    {
        int low = 0;
        int high = data.length;

        while(high >= low)
        {
            int middle = (low + high) / 2;
            if (data[middle] == target)
            {
                return true;
            }
            if (data[middle] < target)
            {
                low = middle + 1;
            }
            if (data[middle] > target)
            {
                high = middle -1;
            }
        }
        return false;
    }

}