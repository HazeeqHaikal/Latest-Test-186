public class App {
    public static void main(String[] args) throws Exception {
        int hourEntry = 13;
        int minEntry = 45;
        int hourExit = 16;
        int minExit = 20;
        double hourlyParkingRate = 2.50;
        ParkingTicketMachine ptml = new ParkingTicketMachine(hourEntry, minEntry, hourExit, minExit, hourlyParkingRate);

        System.out.println("Hour Entry: " + ptml.getHourEntry());
        System.out.println("Hour exit: " + ptml.getHourExit());
    }
}
