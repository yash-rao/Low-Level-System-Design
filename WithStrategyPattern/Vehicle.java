package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy drive;
    
    Vehicle(DriveStrategy obj) {
        this.drive = obj;
    }

    public void drive(){
        drive.drive();
    }
}
