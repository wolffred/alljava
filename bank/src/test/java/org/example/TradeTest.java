package org.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {
    private Trade trade;

    @BeforeEach
    void setUp(){
        trade = new BondTrade("T1", "APPl", 100, 60);
    }


    @Test
    void setPrice() {
        trade.setPrice(9);
        assertEquals(9, trade.getPrice());
    }
}