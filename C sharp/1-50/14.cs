using System;

class Program
{
    static long ModularPow(long baseNumber, long exponent, long modulus)
    {
        long result = 1;
        while (exponent > 0)
        {
            if (exponent % 2 == 1)
            {
                result = (result * baseNumber) % modulus;
            }
            baseNumber = (baseNumber * baseNumber) % modulus;
            exponent /= 2;
        }
        return result;
    }

    static void Main()
    {
        string[] inputs = Console.ReadLine().Split();
        int n = int.Parse(inputs[0]);
        int k = int.Parse(inputs[1]);

        long output;
        if (n == 0)
        {
            output = 1;
        }
        else
        {
            output = ModularPow(k + 1, n, 1000000007);
        }

        Console.WriteLine(output);
    }
}
