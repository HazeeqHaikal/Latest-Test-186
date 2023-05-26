public class Course {
    private String courseCode;
    private String courseName;
    private Lecturer[] lecturer = new Lecturer[3];

    public Course(String courseCode, String courseName, Lecturer lecturer[]) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        for (int i = 0; i < 3; i++) {
            this.lecturer[i] = lecturer[i];
        }
    }

    public String toString() {
        String output = "";
        output += "Course Code: " + courseCode + "\n";
        output += "Course Name: " + courseName + "\n";
        output += "\n";
        for (int i = 0; i < 3; i++) {
            output += lecturer[i].toString() + "\n";
        }
        return output;
    }

}
