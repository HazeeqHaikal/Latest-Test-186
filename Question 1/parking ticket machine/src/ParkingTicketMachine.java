public class ParkingTicketMachine {
    private int hourEntry;
    private int minEntry;
    private int hourExit;
    private int minExit;
    private double hourlyParkingRate;

    public ParkingTicketMachine(int hourEntry, int minEntry, int hourExit, int minExit, double hourlyParkingRate) {
        this.hourEntry = hourEntry;
        this.minEntry = minEntry;
        this.hourExit = hourExit;
        this.minExit = minExit;
        this.hourlyParkingRate = hourlyParkingRate;
    }

    public int getHourEntry() {
        return hourEntry;
    }

    public void setHourEntry(int hourEntry) {
        this.hourEntry = hourEntry;
    }

    public int getMinEntry() {
        return minEntry;
    }

    public void setMinEntry(int minEntry) {
        this.minEntry = minEntry;
    }

    public int getHourExit() {
        return hourExit;
    }

    public void setHourExit(int hourExit) {
        this.hourExit = hourExit;
    }

    public int getMinExit() {
        return minExit;
    }

    public void setMinExit(int minExit) {
        this.minExit = minExit;
    }

    public double getHourlyParkingRate() {
        return hourlyParkingRate;
    }

    public void setHourlyParkingRate(double hourlyParkingRate) {
        this.hourlyParkingRate = hourlyParkingRate;
    }

    public double calcDiffInHours() {
        double diffInHours =  (hourExit + (minExit / 60.00)) - (hourEntry + (minEntry / 60.00));
        return diffInHours;
    }

}
