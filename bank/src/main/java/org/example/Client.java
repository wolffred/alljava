package org.example;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType;
    private int tradePoints;
    private int totalNumberOfTrades;



    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tradePoints = tradePoints;
        MembershipType.assignMemberShip(tradePoints);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public int getTradePoints() {
        return tradePoints;
    }

    public void setTradePoints(int tradePoints) {
        this.tradePoints = tradePoints;
        //MembershipTypee.assignMemberShip(getTradePoints());
        setMembershipType(MembershipType.assignMemberShip(tradePoints));
    }

    public void addPoints(){
        this.tradePoints += 1;
        setMembershipType(MembershipType.assignMemberShip(tradePoints));
    }

    public void addTrade(Trade trade){
        if (this.canTrade()) {
            this.addPoints();
            setMembershipType(MembershipType.assignMemberShip(tradePoints));
            this.totalNumberOfTrades += 1;
        }
        else {
            System.out.println("Cannot Trade");
        }
    }

    public boolean canTrade(){
        if(this.membershipType != null){
            return membershipType.canTrade(totalNumberOfTrades);
        }else {
            return true;
        }
    }
}
