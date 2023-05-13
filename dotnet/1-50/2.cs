using System;

class Program
{
    static void Main(string[] args)
    {
        string[] inputs = Console.ReadLine().Split(' ');
        int a = Convert.ToInt32(inputs[0]);
        int b = Convert.ToInt32(inputs[1]);
        string x;

        if (a > b)
        {
            x = ">";
        }
        else if (a == b)
        {
            x = "=";
        }
        else
        {
            x = "<";
        }

        Console.WriteLine(x);
    }
}
