using System;

public class ArrayMethods
{
    public void print(int[] l)
    {
        for (int i = 0; i < l.Length; i++)
            Console.WriteLine("l[{0}]={1}", i, l[i]);
    }

    public int sequantial(int[] l, int key)
    {
        int size = l.Length;
        for (int i = 0; i < size; i++)
            if (l[i] == key)
                return i;
        return -1;
    }
    public int binary(int[] l, int key)
    {
        int size, mid, first, last;
        first = 0;
        size = l.Length;
        last = size - 1;
        while (last >= first)
        {
            mid = (last + first) / 2;
            if (key == l[mid])
                return mid;
            if (key < l[mid])
                last = mid - 1;
            if (key > l[mid])
                first = mid + 1;
        }
        return -1;
    }
    public void bubble(int[] l)
    {
        int i, j, n = l.Length;
        for (i = 0; i < n - 1; i++)
            for (j = 1; j < n - i; j++)
                if (l[j - 1] > l[j])
                    swap(l, j - 1, j);
    }
    private void swap(int[] l, int x, int y)
    {
        int temp = l[x];
        l[x] = l[y];
        l[y] = temp;
    }

    public void selection(int[] l)
    {
        int i, j, min = 0, n = l.Length;
        for (i = 0; i < n - 1; i++)
        {
            min = i;
            for (j = i + 1; j < n; j++)
                if (l[j] < l[min])
                    min = j;

            swap(l, min, i);
        }
    }
}
    class Program
    {
        static void Main(string[] args)
        {
           
            arraymethods m = new arraymethods();
           int[] s = { 2, 7, 10, 15, 30, 100, 103, 200 };
            Console.WriteLine("Printing array elements before Sequential Search");
            m.print(s);
            if (m.sequantial(s, 100)!=-1)
                Console.WriteLine("element {0} exist at position {1}",100,m.sequantial(s, 100));
            else
                Console.WriteLine("element not exist");
            Console.WriteLine();
            Console.WriteLine();
            int[] r = { 5, 3, 1, 10, 7, 2, 0 };
            Console.WriteLine("Printing array elements before Bubble sorting");
            m.print(r);
            Console.WriteLine();
            m.bubble(r);
            Console.WriteLine("Printing array elements after Bubble sorting");
            m.print(r);
            int[] t = { 5, 3, 1, 10, 7, 2, 0 };
            Console.WriteLine("Printing array elements before Selection sorting");
            m.print(t);
            Console.WriteLine();
            m.selection(t);
            Console.WriteLine("Printing array elements after Selection sorting");
            m.print(t);
            if (m.binary(t, 10) != -1)
                Console.WriteLine("element {0} exist at position {1}", 10, m.binary(t, 10));
            else
                Console.WriteLine("element not exist");

        }
    }



