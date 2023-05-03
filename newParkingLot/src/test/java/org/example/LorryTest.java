package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LorryTest {


    @Test
    void calculateCharge() {
        Owner owner = new Owner();
        List <Owner> owners = new ArrayList<>();

        Lorry lorry = new Lorry(owners,"GB-1234-23",300);
        System.out.println(lorry.calculateCharge());
    }

}