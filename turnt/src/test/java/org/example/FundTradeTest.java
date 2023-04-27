package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTradeTest {

    FundTrade fundTrade;


    @BeforeEach
    void setUp(){
        fundTrade = new FundTrade("T1", "APPL", 15.25, 100);
    }

    @Test
    void calcDividend() {
        double result = fundTrade.calcDividend();
        assertEquals(7.625, result);
    }
}