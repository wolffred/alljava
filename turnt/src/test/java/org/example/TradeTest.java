package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    private Trade trade1;


    @BeforeEach
    void setUp(){
        //trade1 = new Trade("T1", "APPL", 100, 15.25);
    }

    @Test
    void setPrice() {
        String trades = trade1.setPrice(02.00);
        assertEquals("Price set", trades);
    }
}