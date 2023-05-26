public class App {
    public static void main(String[] args) throws Exception {
        Lecturer[] lecturer = new Lecturer[3];

        lecturer[0] = new Lecturer("Suffian Omar", 175234, "Professor"); 
        lecturer[1] = new Lecturer("Abdul Hadi Razman", 195745, "Senior Lecturer");
        lecturer[2] = new Lecturer("Ayu Nazirah Ismail", 185678, "Associate Professor");

        Course course = new Course("CSC253", "Multimedia", lecturer);

        System.out.println(course.toString());
    }
}
