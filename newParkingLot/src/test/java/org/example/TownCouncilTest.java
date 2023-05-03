package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownCouncilTest {

    @Test
    void permitOwnerSucceeds() {
        Owner owner = new Owner();
        List<Owner> owners = new ArrayList<>();
        owners.add(owner);

        PrivateCar privateCar = new PrivateCar(owners,"GB-1234-23");
        TownCouncil townCouncil = new TownCouncil();

        Owner owner1 = new Owner();
        List<Owner> owners1 = new ArrayList<>();
        owners1.add(owner1);

        PrivateCar privateCar1 = new PrivateCar(owners1,"GB-1234-23");

        assertEquals(townCouncil.permitOwner(privateCar, owner), 1);
        assertEquals(townCouncil.permitOwner(privateCar1, owner1), 2);

    }


    @Test
    void permitOwnerFails() {
        Owner owner = new Owner();
        List<Owner> owners = new ArrayList<>();

        PrivateCar privateCar = new PrivateCar(owners,"GB-1234-23");
        TownCouncil townCouncil = new TownCouncil();

        assertEquals(townCouncil.permitOwner(privateCar, owner), 0);
    }

    @Test
    void permitOwnerSucceedsForMultipleOwners() {
        Owner owner = new Owner();
        Owner owner1 = new Owner();
        List<Owner> owners = new ArrayList<>();
        owners.add(owner);
        owners.add(owner1);

        PrivateCar privateCar = new PrivateCar(owners,"GB-1234-23");
        TownCouncil townCouncil = new TownCouncil();


        assertEquals(townCouncil.permitOwner(privateCar, owner), 1);
        assertEquals(townCouncil.permitOwner(privateCar, owner1), 2);

    }

    @Test
    void permitOwnerShouldUpdateMap() {
        Owner owner = new Owner();
        List<Owner> owners = new ArrayList<>();
        owners.add(owner);

        PrivateCar privateCar = new PrivateCar(owners,"GB-1234-23");


        Owner owner1 = new Owner();
        List<Owner> owners1 = new ArrayList<>();
        owners1.add(owner1);

        PrivateCar privateCar1 = new PrivateCar(owners1,"GB-1234-23");


        TownCouncil townCouncil = new TownCouncil();
        townCouncil.permitOwner(privateCar, owner);
        townCouncil.permitOwner(privateCar1, owner1);


        assertEquals(townCouncil.permittedVehicles.size(), 2);
    }


}