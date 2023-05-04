package org.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;
    Trade trade;
    Trade trade1;
    Trade bondTrade;

    @BeforeEach
    public void setUp() throws TradeIDException {
        account = new Account();
        trade = new BondTrade("T1", "APPl", 100,65, 60);
        trade1 = new BondTrade("T1", "APPl", 100,65, 60);
        bondTrade = new BondTrade("T1", "APPl", 100, 50);


    }

    @Test
    public void aboveTwn() throws TradeIDException {

//        account.arrayOfTrades[0] =trade;
//        account.arrayOfTrades[1] =bondTrade;
//        System.out.println(account.arrayOfTrades.length);

        account.setArrayOfTrades(trade);
        account.setArrayOfTrades(bondTrade);
        account.addNewTrade(trade);
        account.addNewTrade(bondTrade);


        account.aboveTen();
        //account.aboveTen();

    }

}