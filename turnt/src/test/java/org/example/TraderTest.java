package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {

    private FundTrade trade;
    private Trader trader;
    private Account account;

    @BeforeEach
    void setUp(){
        account = new Account(12);
        trade = new FundTrade("T1", "APPL", 15.25, 100);
        trader = new Trader("Bob", account);
    }

    @Test
    void addTrade() {
        double result = trader.addTrade(trade);
        assertEquals(1537, result);

    }
}