using System;

class Program
{
    static void Main()
    {
        string[] inputs = Console.ReadLine().Split();
        int n = int.Parse(inputs[0]);
        int k = int.Parse(inputs[1]);

        if (n == 0)
        {
            Console.WriteLine("1");
        }
        else
        {
            Console.WriteLine(k + 1);
        }
    }
}
