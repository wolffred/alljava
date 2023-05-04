package org.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondTradeTest {

    private BondTrade bondTrade;
    @BeforeEach
    public void setUp(){
        bondTrade = new BondTrade("T1", "APPl", 100, 50);
    }

    @Test
    void calcDividend() {
        assertEquals(50, bondTrade.calcDividend());
    }
}