using System;

class Program
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        int[] s = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);

        int max = s[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++)
        {
            if (s[i] > max)
            {
                max = s[i];
                maxIndex = i;
            }
        }

        for (int i = maxIndex; i < n - 1; i++)
        {
            s[i] = s[i + 1];
        }

        int newMax = s[0];
        for (int i = 1; i < n - 1; i++)
        {
            if (s[i] > newMax)
            {
                newMax = s[i];
            }
        }

        Console.WriteLine(newMax);
    }
}
