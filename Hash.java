import java.util.*;

class Nw
{
int age;
String name;
void details()
{
System.out.println("Age="+age);
System.out.println("My name is "+name);
}
}
class Hash
{
public static void main(String[] args)
{
Nw n=new Nw();
n.age=19;
n.name="saloni";
n.details();
int a=n.hashCode();
System.out.print(a);
}
}