import java.util.*;

public class TwoSumArray
{
    public static boolean twoSum(int arr[], int size, int x)
    {
        for(int i = 0; i < size - 1; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                if(arr[i] + arr[j] == x)
                {
                    return true;
                }
            }
        }
      
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of array: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter sum: ");
        int x = sc.nextInt();

        if(twoSum(arr, size, x)  == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
