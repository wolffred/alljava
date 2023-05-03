package org.example;

import java.util.List;

public class MotorBike extends Vehicle{
    private int capacity;
    public MotorBike(List<Owner> owners,  String numberPlate, int capacity) {
        super(owners, numberPlate);
        this.capacity = capacity;
        this.setVehicleType(VehicleType.MOtORBIKE);
        calculateCharge();
    }




    @Override
    public double calculateCharge() {
        if(this.capacity < 1){
        }
        else if(this.capacity <= 850){
            this.setChargePerMonth(7);
        }
        else {
            this.setChargePerMonth(10);
        }
        return this.getChargePerMonth();
    }
}
