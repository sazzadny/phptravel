package practice;

public class Bicycle {
    int gear; // Class variable
    int speed;

    public Bicycle(int gear, int speed){ //Method variable
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBreak(int decrement){
        //gear -= decrement;
        speed -= decrement; // speed = speed = decrement
    }
    public void speedUp(int increment){
        //gear += increment;
        speed += increment; // speed = speed + increment

    }
    public void showData(){
        System.out.println("No. of gears are " + gear);
        System.out.println("Speed of bicycle is " + speed);
    }

}
