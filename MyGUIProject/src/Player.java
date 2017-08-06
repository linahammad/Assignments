public class Player extends Human
{
private int number;
public Player(String n, double a, int num)
{
 super(n, a);
 number = num;
}
public void setNumber(int n)
{
    if (n>0)
        number = n;
}
public int getANumber()
{
    return number;
}

public boolean equals (Object obj)
{
   if (obj == this)
       return true;
   if (obj == null || obj.getClass() != this.getClass())
       return false;
   Player p2 = (Player)obj;
   boolean temp = (number == p2.number) && ( getName()==p2.getName() ) && (getAge()== p2.getAge());
   return temp;
}
public String toString()
{
    return super.toString()+" , Number: "+ number+"\n";
}

}
