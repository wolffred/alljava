package org.example;

public class MembershipType {

    public boolean canTrade() {
        return true;
    }

    public static  MembershipType assign(int points){
        MembershipType member = null;
        if (points < 1){
            member =  null;
        }
        else if(points < 10 && points > 0){
            member =  new Bronze();
        } else if (points > 9 && points < 20) {
            member =  new Silver();
        } else if (points > 19) {
            member = new Gold();
        }
        return member;
    }
}
