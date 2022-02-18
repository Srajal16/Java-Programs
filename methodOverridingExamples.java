public class methodOverridingExamples {
    /*
    class TV
{
    public void switchON(){ System.out.println("TV is Switched ON"); }

    public void changeChannel() { System.out.println("TV Channel is Changed "); }

}

class SmartTV extends TV
{
    @Override
    public void switchON(){ System.out.println("Smart TV is Switched ON"); }

    @Override
    public void changeChannel() { System.out.println("SmartTV Channel is Changed "); }

    public void browse(){ System.out.println("Smart Tv Browsing"); }

}

public class Overriding
{

    public static void main(String[] args)
    {
        TV t=new SmartTV();

        t.switchON();
        t.changeChannel();

    }
     */

    /*
    class Car
{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}

}

class LuxaryCar extends Car
{
    public void changeGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof is Opened");}

}

public class OverridingExample
{

    public static void main(String[] args)
    {
        Car c=new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        //c.openRoof();
    }
     */
}
