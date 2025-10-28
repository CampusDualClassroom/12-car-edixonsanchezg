package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.accelerate();
        c1.turnAngleOfWheels(20);
        c1.brake();
        c1.stop();
        c1.setReverse(true);
        c1.showDetails();

    }

}