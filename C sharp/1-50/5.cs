using System;

class Program
{
    static void Main()
    {
        int z = int.Parse(Console.ReadLine());
        int s = 0;
        int n = 0;

        if (z == 0)
        {
            s = -1;
        }
        else
        {
            if (z < 0)
            {
                n = -z;
            }
            else
            {
                n = z;
            }

            int i = 1;
            while (i * i <= n)
            {
                if (n % i == 0)
                {
                    s += 1;
                    if (i * i != n)
                    {
                        s += 1;
                    }
                }
                i += 1;
            }

            if (s % 2 != 0 && z > 0)
            {
                s += 1;
            }
        }

        Console.WriteLine(s);
    }
}
