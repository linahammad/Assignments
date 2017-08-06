using System;
using System.Collections;
    class CStack
    {
        private int p_index;
        private ArrayList list;
        public CStack()
        {
            list = new ArrayList();
            p_index = -1;
        }
        public int count
        {
            get
            {
                return list.Count;
            }
        }
        public void push(object item)
        {
            list.Add(item);
            p_index++;
        }
        public object pop()
        {
            object obj = list[p_index];
            list.RemoveAt(p_index);
            p_index--;
            return obj;
        }
        public void clear()
        {
            list.Clear();
            p_index = -1;
        }
        public object peek()
        {
            return list[p_index];
        }
    }
       





 class Program
    {
        static void Main(string[] args)
        {
            string s1,s2,s3;
            bool palindrome=true;
            CStack st = new CStack();
            s1 = "ok";
           while (s1 != "Enough"){
               Console.WriteLine("Enter String to find if it is Palindrome or not ");
               s1 = Console.ReadLine();
            for (int i = 0; i < s1.Length ; i++)

            {
                st.push(s1.Substring(i, 1));
            }
            int pos = 0;
            while (st.count > 0)
            {
                s2 = st.pop().ToString();
                s3 = s1.Substring(pos, 1);
                if (s2 != s3)
                {
                    palindrome = false;
                    break;
                }
                pos++;
            }
            if(palindrome)
                Console.WriteLine("{0} is palindrom string ",s1);
            else 
                Console.WriteLine("{0} is Not Palindrome",s1);
                
           }}}
       
