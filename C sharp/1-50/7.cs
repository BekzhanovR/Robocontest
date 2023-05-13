using System;

class Program
{
    static void Main()
    {
        long n, k;
        n = long.Parse(Console.ReadLine());
        long[] f = new long[46];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 45; i++)
        {
            f[i] = f[i - 2] + f[i - 1];
        }
        Console.WriteLine(f[n] * 2);
    }
}
