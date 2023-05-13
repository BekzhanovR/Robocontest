using System;

class Program
{
    static void Main()
    {
        long a, b, c, d, e, mn, mx;
        string[] inputs = Console.ReadLine().Split(' ');
        a = long.Parse(inputs[0]);
        b = long.Parse(inputs[1]);
        c = long.Parse(inputs[2]);
        d = long.Parse(inputs[3]);
        e = long.Parse(inputs[4]);

        mn = Math.Min(Math.Min(a, b), Math.Min(c, Math.Min(e, d)));
        mx = Math.Max(Math.Max(a, b), Math.Max(c, Math.Max(e, d)));

        Console.WriteLine((a + b + c + d + e - mx) + " " + (a + b + c + d + e - mn));
    }
}
