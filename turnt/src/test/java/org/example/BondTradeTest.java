package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondTradeTest {

    BondTrade bondTrade;


    @BeforeEach
    void setUp(){
        bondTrade = new BondTrade("T1", "APPL", 100, 15.25, 100);
    }

    @Test
    void calcDividend() {
        double result = bondTrade.calcDividend();
        assertEquals(100, result);
    }
}