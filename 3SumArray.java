import java.util.*;

public class ThreeSumArray
{
    public static boolean threeSum(int arr[], int size, int x)
    {
        for(int i = 0; i < size - 2; i++)
        {
            for(int j = i + 1; j < size - 1; j++)
            {
                for(int k = i + 2; k < size; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == x)
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] Args)
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

        if(threeSum(arr, size, x) == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
