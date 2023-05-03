package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MotorBikeTest {

    @Test
    void calculateCharge() {

        Owner owner = new Owner();
        List<Owner> owners = new ArrayList<>();

        MotorBike motorBike = new MotorBike(owners,"GB-1234-23", 0);
        System.out.println(motorBike.calculateCharge());

    }
}