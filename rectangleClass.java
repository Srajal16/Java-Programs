public class rectangleClass {

    static class rectangle{
        public double length;
        public double breadth;

        public double area(){
            return length*breadth;
        }

        public double perimeter(){
            return 2*(length+breadth);
        }
    }


    public static void main(String[] args) {

        rectangle r1 = new rectangle();
        r1.length = 10;
        r1.breadth = 20;
        System.out.println("Area is: "+r1.area());
        System.out.println("Perimeter is: "+r1.perimeter());


    }
}
