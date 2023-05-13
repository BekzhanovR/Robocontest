using System;

class Program
{
    static void Main(string[] args)
    {
        int jil;
        string x = "";

        jil = Convert.ToInt32(Console.ReadLine());

        if (jil < 10)
        {
            x = "000";
        }
        else if (jil < 100)
        {
            x = "00";
        }
        else if (jil < 1000)
        {
            x = "0";
        }

        if (jil % 400 == 0 || (jil % 4 == 0 && jil % 100 != 0))
        {
            x = $"12/09/{x}{jil}";
        }
        else
        {
            x = $"13/09/{x}{jil}";
        }

        Console.WriteLine(x);
    }
}
