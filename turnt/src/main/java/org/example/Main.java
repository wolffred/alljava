package org.example;

public class Main{

    public static void main (String [] args){
//        double rand = Math.random();
//        System.out.println(" "+rand);

//        int rand = (int)(Math.random()*10 +1);
//        System.out.println(" "+rand);
//
//        int rand = (int)(Math.random()*100 +1);
//        System.out.println(rand);
//
//        if(rand == 0){
//            System.out.println("Frozen");
//        } else if(rand > 0 && rand < 15){
//            System.out.println("Cold");
//        } else if(rand > 14 && rand < 25){
//            System.out.println("Cool");
//        } else if(rand > 24 && rand < 41){
//            System.out.println("Warm");
//        } else if(rand > 40 && rand < 61){
//            System.out.println("Hot");
//        } else if(rand > 60 && rand < 81){
//            System.out.println("Very hot");
//        } else if(rand > 80 && rand < 100){
//            System.out.println("Extremely hot");
//        } else if(rand == 100){
//            System.out.println("Boiling hot");
//        }
//
//
//        int rnd = (int)(Math.random()*10 +1);
//        System.out.println(rnd);
//
//        switch(rnd){
//
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Nine");
//                break;
//            case 10:
//                System.out.println("Ten");
//                break;
//            default:
//                System.out.println("Invalid");
//                break;
//
//        }


        //Trade t1 = new Trade("T1", "APPL", 100, 15.25);

        //t1.setPrice(9);


        FundTrade fundTrade = new FundTrade("T1", "APPL", 90, 100);
        BondTrade bondTrade = new BondTrade("T1", "APPL", 100, 15.25, 100);

//        System.out.println(fundTrade.calcDividend());
//        System.out.println(fundTrade.getPrice());
//
//        MembershipType membershipType = new MembershipType();
//
//        Client client = new Client("Bob", "Donuts", membershipType.assign(0));
//
//        System.out.println(client.getMembershipType());

        Account account = new Account(100);

        account.addTrade(fundTrade);
        account.addTrade(bondTrade);
        account.loop(20);
        System.out.println("j");

    }
}

