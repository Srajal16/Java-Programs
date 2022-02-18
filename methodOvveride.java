public class methodOvveride {

    static class Super
    {
        public void display()
        {
            System.out.println("Super Display");
        }
    }

   static class Sub extends Super
    {
        public void display()
        {
            System.out.println("Sub Display");
        }
    }

    public static void main(String[] args) {
        {
            Super s=new Sub();
            s.display();

        }

    }
}


