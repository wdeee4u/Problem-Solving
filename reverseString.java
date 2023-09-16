import java.util.*;

public class ReverseString
{
    public static StringBuilder strRev(String str, StringBuilder sb)
    {
        for(int i = 0; i < str.length()/2; i++)
        {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        return sb;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reversed string: " + strRev(str, sb));
    }
}
