
public class PairsInArray
{
  public static int printPairs(int arr[])
    {
        int totalPairs = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int current = arr[i];
            for(int j = i + 1; j < arr.length; j++)
            {
                System.out.print("(" + current + ", " + arr[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }

        return totalPairs;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int key = 3;

        //print pairs
        System.out.print(printPairs(arr));
    }
}
