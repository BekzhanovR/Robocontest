using System;
using System.Linq;

namespace SumOfNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            int[] numbers = input.Split(' ').Select(int.Parse).ToArray();

            int sum = numbers.Sum();
            Console.WriteLine(sum);
        }
    }
}
