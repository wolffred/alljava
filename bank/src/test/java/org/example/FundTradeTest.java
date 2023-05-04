package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTradeTest {

    private FundTrade fundTrade;
    @BeforeEach
    public void setUp() throws TradeIDException {
        fundTrade = new FundTrade("T1", "APPl", 100, 100, 0.5);
    }

    @Test
    void calcDividend() {
        assertEquals(50, fundTrade.calcDividend());
    }
}