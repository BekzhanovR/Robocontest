using System;
using System.Linq;

class Program
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        int[] s = Console.ReadLine().Split().Select(int.Parse).ToArray();

        foreach (int i in s)
        {
            if (s.Count(x => x == i) == 1)
            {
                Console.WriteLine(i);
            }
        }
    }
}
