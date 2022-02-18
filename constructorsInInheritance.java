/*
class Parent
{
    public Parent()
    {
        System.out.println("Parent Constrcutor");
    }

}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor");
    }
}
public class InheritConst
{

    public static void main(String[] args)
    {
        GrandChild c=new GrandChild();
    }
 */

/*
class Parent
{
    Parent()
    {
        System.out.println("Non-Param of parent");
    }
    Parent(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Param of child");
    }
    Child(int y)
    {
        System.out.println("Param of child");
    }
    Child(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class SuperConstr {

    public static void main(String[] args) {
        //Child c=new Child();
        //Child c=new Child(20);
        Child c=new Child(10,20);
    }
 */