package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car (String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){
        this.brand = "Citroën";
        this.model = "Xsara";
        this.fuel = "Diesel";
    }

    public void start() {
        if (this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        }else{
            System.out.println("Vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("No se puede apagar el vehículo. Primero tiene que estar detenido");
        }
    }
    public void accelerate(){
        if (this.tachometer > 0 && this.speedometer < MAX_SPEED) {
            this.speedometer += 10;
            if (this.speedometer > MAX_SPEED) {
                this.speedometer = MAX_SPEED;

            }
        }

    }

    public void brake(){
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            if (this.speedometer < 0) {
                this.speedometer = 0;
            }
        }

    }

    public void turnAngleOfWheels(int angle){
        if (angle > 45) {
            this.wheelsAngle = 45;
        } else if (angle < -45) {
            this.wheelsAngle = -45;
        } else {
            this.wheelsAngle = angle;
        }

    }

    public String showSteeringWheelDetail(){

        return "Ángulo actual de las ruedas: " + this.wheelsAngle + " grados.";
    }

    public boolean isReverse(){


        return this.reverse;
    }

    public void setReverse(boolean reverse){
        if (reverse) {
            if (this.speedometer == 0) {
                this.reverse = true;
                this.gear = "R";
            }
        } else {
            this.reverse = false;
            this.gear = "N";
        }
    }

    public void showDetails(){
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocidad: " + this.speedometer);
        System.out.println("Tacómetro: " + this.tachometer);
        System.out.println("Marcha: " + this.gear);
        System.out.println("Marcha atrás: " + this.reverse);
        System.out.println("Ángulo ruedas: " + this.wheelsAngle);
    }
    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {

        return this.tachometer == 0;
    }

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
