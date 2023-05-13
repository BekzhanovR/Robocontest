using System;
class Program
{
    static void Main()
    {
        long A, B, C, N, d;
        N = long.Parse(Console.ReadLine());
        string[] input = Console.ReadLine().Split();
        A = long.Parse(input[0]);
        B = long.Parse(input[1]);
        C = long.Parse(input[2]);
        d = A + B + C;
        if (N <= d)
        {
            Console.WriteLine("Yes");
        }
        else
        {
            Console.WriteLine("No");
        }
    }
}
