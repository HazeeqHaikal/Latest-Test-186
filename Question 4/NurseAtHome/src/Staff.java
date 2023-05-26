public class Staff {
    private String staffname;
    private String staffId;
    private String staffContact;

    public Staff(String staffname, String staffId, String staffContact) {
        this.staffname = staffname;
        this.staffId = staffId;
        this.staffContact = staffContact;
    }

    public String toString() {
        return "Staff Name: " + staffname + "\nStaff ID: " + staffId + "\nStaff Contact: " + staffContact;
    }
}
