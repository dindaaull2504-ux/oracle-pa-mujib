package Vehicels;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println("The model type is " + vehicle1.getModel());
        System.out.println("The chassis number is " + vehicle1.getChassisNo());

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println("The model type is " + vehicle2.getModel());
        System.out.println("The chassis number is " + vehicle2.getChassisNo());

        System.out.println(vehicle1);
        System.out.println(vehicle2);

        Vehicle.setMake("Seer");
        System.out.println(vehicle1);
        System.out.println(vehicle2);

        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
        System.out.println("Vehicle number " + vehicle3.getChassisNo()
                + " is a " + vehicle3.getModel()
                + " model and has an engine capacity of " + Vehicle.Engine.getCapacity() + "cc");

        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}