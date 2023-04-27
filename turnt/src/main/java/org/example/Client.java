package org.example;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType;


    public Client(String firstName, String lastName, MembershipType membershipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipType = membershipType;
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

    public boolean canTrade(){
        return membershipType.canTrade();
    }

    public void addTrade(Trade trade){

    }
}
