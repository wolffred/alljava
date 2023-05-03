package org.example;

import java.util.HashMap;
import java.util.Map;

public class TownCouncil {
    private int permitNumber = 0;
    private String permitNumberr = Integer.toString(permitNumber);
    Map<Vehicle, Integer> permittedVehicles = new HashMap<>();
    Map<Vehicle, String> permittedVehicless = new HashMap<>();

    public int permitOwner(Vehicle vehicle, Owner owner){
        if(vehicle.owners.contains(owner)){
            permitNumber++;
            permittedVehicles.put(vehicle, permitNumber);
            permittedVehicless.put(vehicle, permitNumberr);
            return permitNumber;
        }
        else {
            return permitNumber;
        }
    }

}
