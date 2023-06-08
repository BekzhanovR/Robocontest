using System;

class Program
{
    static int fff(int n)
    {
        int s = 0, p;
        while (n > 0)
        {
            p = n % 10;
            s = s + p;
            n = n / 10;
        }
        return s * s;
    }

    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int k = 0;
        int i = 1, h = 0;
        while (k < n)
        {
            if (i % fff(i) == 0)
                k++;
            h = i;
            i++;
        }
        Console.WriteLine(h);
    }
}
