package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client client;
    FundTrade fundTrade;

    @BeforeEach
    public void setUp() throws TradeIDException {
        client = new Client("John", "Doe");
        fundTrade = new FundTrade("T1", "APPl", 100, 100, 0.5);
    }

//    @Test
//    public void assignMembership(){
//        System.out.println(client.getMembershipType());
//
//        //client.setTradePoints(90);
//        //client.addPoints();
//        assertTrue(client.canTrade());
//        client.addTrade(fundTrade);
//        client.addTrade(fundTrade);
//        client.addTrade(fundTrade);
//        client.addTrade(fundTrade);
//        client.addTrade(fundTrade);
//        client.addTrade(fundTrade);
//        MembershipType memb = client.getMembershipType();
//        assertEquals("org.example.bronze", memb.getClass().getName().toLowerCase());
//
//
//    }

    @Test
    public void assignMembership(){
        System.out.println(client.getMembershipType());

        //client.setTradePoints(90);
        //client.addPoints();
        assertTrue(client.canTrade());
        client.addTrade(fundTrade);
        client.addTrade(fundTrade);
        client.addTrade(fundTrade);
        client.addTrade(fundTrade);
        client.addTrade(fundTrade);
        client.addTrade(fundTrade);
        MembershipType memb = client.getMembershipType();
        assertEquals("Bronze", memb.toString());


    }

}