package org.example;

import java.util.List;

public class Lorry extends Vehicle{
    private int capacity;
    private int extraCharge;
    private int initialCharge = 30;
    private int maxCapacity = 151;
    private int capacityDifference;
    private int chargeRate = 20;

    public Lorry(List<Owner> owners, String numberPlate, int capacity) {
        super(owners, numberPlate);
        this.setVehicleType(VehicleType.LORRY);
        this.capacity = capacity;
        calculateCharge();
    }

    @Override
    public double calculateCharge() {
        if (this.capacity < maxCapacity){
            this.setChargePerMonth(initialCharge);
            return this.getChargePerMonth();
        }
        else {
            capacityDifference = this.capacity - (maxCapacity - 1);
            int extraCapacity = capacityDifference / chargeRate;
            extraCharge = initialCharge + (5 * extraCapacity);
            this.setChargePerMonth(extraCharge);
            return this.getChargePerMonth();
        }
    }
}
