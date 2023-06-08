using System;

class Program
{
    static int[] a = { 1000000000, 1000000, 1000, 100 };
    static string[] b = { "milliard ", "million ", "ming ", "yuz " };
    static string[] c = { "", "o'n ", "yigirma ", "o'ttiz ", "qirq ", "ellik ", "oltmish ", "yetmish ", "sakson ", "to'qson " };
    static string[] d = { "", "bir ", "ikki ", "uch ", "to'rt ", "besh ", "olti ", "yetti ", "sakkiz ", "to'qqiz " };

    static string Natural(long n)
    {
        for (int i = 0; i < 4; i++)
        {
            if (n >= a[i])
            {
                return Natural(n / a[i]) + b[i] + Natural(n % a[i]);
            }
        }
        return c[n / 10] + d[n % 10];
    }

    static void Main()
    {
        long n = Convert.ToInt64(Console.ReadLine());
        string result = Natural(n);
        Console.WriteLine(result);
    }
}