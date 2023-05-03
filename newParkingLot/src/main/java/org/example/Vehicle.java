package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    List<Owner> owners = new ArrayList<>();
    private double chargePerMonth;
    private String numberPlate;
    private VehicleType vehicleType;


    public Vehicle(List<Owner> owners,  String numberPlate) {
        this.owners = owners;
        this.numberPlate = numberPlate;
    }


    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public double getChargePerMonth() {
        return chargePerMonth;
    }

    public void setChargePerMonth(double chargePerMonth) {
        this.chargePerMonth = chargePerMonth;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract double calculateCharge();
}
