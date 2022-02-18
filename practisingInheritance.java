public class practisingInheritance {

    static class Circle
    {
        public double radius;

        public double area(){
            return Math.PI*radius*radius;

        }
        public double perimeter(){
            return 2*Math.PI*radius*radius;

        }
        public double circumference(){
            return perimeter();

        }
    }

    static class Cylinder extends Circle
    {
        public double height;

        public double volume(){
            return area()*height;
        }
    }



    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.radius = 7;
        c1.height = 10;
        System.out.println("Volume: "+c1.volume());

    }
}
