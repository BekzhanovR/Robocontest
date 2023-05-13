using System;

namespace ComparisonExample
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string[] numbers = input.Split(' ');

            int a = int.Parse(numbers[0]);
            int b = int.Parse(numbers[1]);

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
}
