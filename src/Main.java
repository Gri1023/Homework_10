public class Main
{

    public static void main(String[] args)
    {
        int a = 100;
        int b = 99;
        int r = a % b;
        while (r >= 0)
        {
            if (r == 0)
            {
                System.out.println(b);
                break;
            }
            else
            {
                a = b;
                b = r;
                r = a % b;
            }
        }
    }
}
