public class cylinderClass {

    static class cylinder{
        public double radius;
        public double height;

        public double lidArea(){
            return Math.PI*radius*radius;
        }
        public double totalSurfaceArea(){
            return 2*Math.PI*radius*(radius+height);
        }
        public double volume(){
            return Math.PI*radius*radius*height;
        }
    }

    public static void main(String[] args) {

        cylinder c1 = new cylinder();
        c1.height = 7;
        c1.radius = 10;
        System.out.println("Area: "+c1.lidArea());
        System.out.println("TSA: "+c1.totalSurfaceArea());
        System.out.println("Volume: "+c1.volume());


    }
}
/*
class Student
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    public String toString()
    {
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}

public class StudentTest
{

    public static void main(String[] args)
    {
        Student s=new Student();

        s.roll=1;
        s.name="John";
        s.course="CS";
        s.m1=70;
        s.m2=80;
        s.m3=65;

        System.out.println("Total :"+s.total());
        System.out.println("Average :"+s.average());

        System.out.println("Details:\n "+ s );

    }

}

Student Class
 */
