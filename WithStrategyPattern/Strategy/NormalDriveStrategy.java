package WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    public void drive(){
        System.out.println("Drive Normally");
    }
}
