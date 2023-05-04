package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {

    private Trade trade;
    private Account account;
    private Trader trader;

    @BeforeEach
    void setUp(){
        trade = new BondTrade("T1", "APPl", 100, 50);
        account = new Account();
        trader = new Trader("Bob", account);

    }

    @Test
    void addTrade() {
        assertEquals(9000, trader.addTrade(trade));
    }
}