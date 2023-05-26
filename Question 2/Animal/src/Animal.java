public class Animal {

    private String name;
    private int age;
    private String breed;
    private boolean availablity;

    // normal constructor
    public Animal(String name, int age, String breed, boolean availablity) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.availablity = availablity;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public boolean getAvailablity() {
        return availablity;
    }

    public void setAvailability(boolean available) {
        this.availablity = available;
    }

    public boolean isAvailable(){
        if(availablity){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nBreed: " + breed + "\nAvailability: " + availablity;
    }

}