package WithoutStrategyPattern;

public class Vehicle{
    public void drive() {
        System.out.println("Normal Drive");
    }
    public static void main(String a[]) {
        Vehicle v = new Vehicle();
        v.drive();
        SportsVehicle s = new SportsVehicle();
        s.drive();
    }
}