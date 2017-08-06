public abstract class Human implements HumanInterface
{
 private String name;
 private double age;
 
 public Human(String n, double a)
 {
  name= n;
  age = a;
 }
 public String toString()
 {
 return name+", "+ age+ " yrs old";    
 }
 public String getName()
{
    return name;
}
public double getAge()
{
 return age;   
}
public void setName(String s)
{
    name = s;
}
public void setAge(double a)
{
    if (a>0)
        age = a;
}
}
