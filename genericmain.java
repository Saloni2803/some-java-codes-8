public class genericmain
{
public static void main(String args[])
{
test<Integer> iobj=new test<Integer>(10);
System.out.print(iobj.getobject());
test<String> iobj=new test<String>(10);
System.out.print(iobj.getobject());
}
}
class test<t>
{
t obj;
test (t obj)
{
this.obj=obj;
}
public t getobject()
{
return this.obj;
}
}