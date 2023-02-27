public class Car {
    public void openDoors(){
        System.out.println("Open the door");
    }
    public void insertKey(){
        System.out.println("Insert key");
    }
    public void start(){
        System.out.println("Start the vehicle");
    }
    public void upShift(){
        System.out.println("Change the gear++");
    }
    public void turnOnAc(){
        System.out.println("Turn on Ac");
    }
    public void accelerate(){
        System.out.println("Acceleration..");
    }

    public void turnSteeringWheel(){
        System.out.println("Car turns<-- -->");
    }
    public void downshift(){
        System.out.println("Gear change--");
    }
    public void applyBrake(){
        System.out.println("Breaking..");
    }
    public void blowHorn(){
        System.out.println("Blow horn");
    }
    public void turnOffEngine(){
        System.out.println("Off the engine");
    }

    public static void main(String[] args) {
        Car kumsCar = new Car();
        kumsCar.openDoors();
        kumsCar.insertKey();
        kumsCar.start();
        kumsCar.upShift();
        kumsCar.turnOnAc();
        kumsCar.accelerate();
        kumsCar.applyBrake();
        kumsCar.turnSteeringWheel();
        kumsCar.downshift();
        kumsCar.blowHorn();
        kumsCar.turnOffEngine();
    }
}
