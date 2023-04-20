public class Client {

    private String firstName;
    private String lastName;
    private MembershipType memberType;

    public Client(String firstName, String lastName, MembershipType memberType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberType = memberType;
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberType = null;
    }


    public MembershipType getMemberType() {
        return memberType;
    }

    public void setMemberType(MembershipType memberType) {
        this.memberType = memberType;
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

    public void addTrade(Trade trade){}

}
