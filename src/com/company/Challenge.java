package com.company;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    private int speed=0;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(int speed) {
        this.speed += speed;
    }

    public String startEngine(boolean engine){
        if(this.engine == false && this.speed==0){
            this.engine = engine;
            this.speed = 10;

        }
        return "Engine has started gruuuuu";
    }
    public String accelerate(int boost){
        this.speed = boost;
        return "Engine accelerated to "+ this.speed;
    }

    public String brake(){
        this.speed  = 0;
        return "Engine has stopped";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Ferarri extends  Car {
    public Ferarri() {
        super(8, "Ferrari 488");
    }

    @Override
    public String startEngine(boolean engine) {
        super.startEngine(engine);
        setEngine(engine);
        if (isEngine()) {
            setSpeed(10);
            return "Engine has Stared "+ getSpeed();
        }
        return "Engine has not Stared ";

    }

    @Override
    public String accelerate(int boost) {
        if(isEngine()) {
            setSpeed(boost);
            return "Accelerating to " + boost;
        }else {
            return "Engine has not started cannot accelerate";
        }
    }

    @Override
    public String brake() {
        return "Engine speed is " + getSpeed();
    }
}

class Porsche extends Car {
    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }


}

public class Challenge {
    public static void main(String[] args) {
            Car car = new Ferarri();

            System.out.println("name: "+car.getName()+"\n"+car.startEngine(true)+"\n"
                    +car.accelerate(10)+"\n"+"Total speed "+car.getSpeed()+"\n\n");

            Car car1 = new Porsche(6, "Porsche Panamera");
                System.out.println("name: "+car1.getName()+"\n"+car1.startEngine(true)+"\n"
                +car1.accelerate(10)+"\n"+"Total speed "+car1.getSpeed());

    }
}
