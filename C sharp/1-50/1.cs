using System;

namespace SumOfTwoNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string[] numbers = input.Split(' ');

            int var1 = Convert.ToInt32(numbers[0]);
            int var2 = Convert.ToInt32(numbers[1]);

            int sum = var1 + var2;
            Console.WriteLine(sum);
        }
    }
}
