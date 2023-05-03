package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrivateCarTest {

    @Test
    void calculateCharge() {

        Owner owner = new Owner();
        Owner owner1 = new Owner();
        List<Owner> owners = new ArrayList<>();
        owners.add(owner);
        owners.add(owner1);

        PrivateCar privateCar = new PrivateCar(owners,"GB-1234-23");
        System.out.println(privateCar.calculateCharge());

    }
}