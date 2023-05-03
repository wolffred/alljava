package org.example;

import java.util.List;

public class PrivateCar extends Vehicle {

    public PrivateCar(List<Owner> owners,  String numberPlate) {
        super(owners, numberPlate);
        this.setVehicleType(VehicleType.PRIVATECAR);
        this.setChargePerMonth(20);
    }

    @Override
    public double calculateCharge() {
        double newCharge = this.getChargePerMonth() * owners.size();
        this.setChargePerMonth(newCharge);
        return getChargePerMonth();
    }
}
