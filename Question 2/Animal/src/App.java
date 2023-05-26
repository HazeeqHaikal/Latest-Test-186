import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animal = new Animal[2];

        animal[0] = new Animal("Lucky", 2, "Labrador Retriever", true);
        animal[0].setAvailability(true);

        animal[1] = new Animal("Milo", 1, "German Shepherd", false);
        animal[1].setAvailability(false);


        int count = 0;
        for (int i = 0; i < 2; i++) {
            if(animal[i].isAvailable()){
                count++;
            }
        }

        System.out.println("Total available animal for adoption in the shelter: " + count);

        int total = 0;
        double average = 0;

        for(int i = 0; i < 2; i++){
            total += animal[i].getAge();
        }

        average = total / 2.0;

        System.out.println("Average age of all animals in the shelter: " + average);

    }
}
