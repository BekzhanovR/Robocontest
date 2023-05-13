using System;

class Program
{
    static void Main(string[] args)
    {
        string inputA = Console.ReadLine();
        char[] a = inputA.ToCharArray();
        Array.Reverse(a);

        string inputB = Console.ReadLine();
        char[] b = inputB.ToCharArray();
        Array.Reverse(b);

        int maxLength = Math.Max(a.Length, b.Length);
        int[] c = new int[maxLength + 1];

        int carry = 0;
        for (int i = 0; i < maxLength; i++)
        {
            int sum = carry;
            if (i < a.Length)
            {
                sum += int.Parse(a[i].ToString());
            }
            if (i < b.Length)
            {
                sum += int.Parse(b[i].ToString());
            }

            c[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0)
        {
            c[maxLength] = carry;
        }

        bool foundNonZero = false;
        for (int i = c.Length - 1; i >= 0; i--)
        {
            if (c[i] != 0)
            {
                foundNonZero = true;
            }
            if (foundNonZero)
            {
                Console.Write(c[i]);
            }
        }
    }
}