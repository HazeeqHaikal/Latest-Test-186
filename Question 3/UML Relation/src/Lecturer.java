public class Lecturer {
    private String lectName;
    private int lectID;
    private String lectDesignation;

    public Lecturer(String lectName, int lectID, String lectDesignation){
        this.lectName = lectName;
        this.lectID = lectID;
        this.lectDesignation = lectDesignation;
    }

    public String toString(){
        String output = "";
        output += "Lecturer Name: " + lectName + "\n";
        output += "Lecturer ID: " + lectID + "\n";
        output += "Lecturer Designation: " + lectDesignation + "\n";
        return output;
    }
}