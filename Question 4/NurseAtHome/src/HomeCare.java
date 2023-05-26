public class HomeCare {
    private String custName;
    private String phoneNo;
    private String location;
    private char serviceType;
    private int duration;
    private Staff[] staff = new Staff[3];

    public HomeCare(String custName, String phoneNo, String location, char serviceType, int duration, Staff[] staff) {
        this.custName = custName;
        this.phoneNo = phoneNo;
        this.location = location;
        this.serviceType = serviceType;
        this.duration = duration;
        for (int i = 0; i < 3; i++) {
            this.staff[i] = staff[i];
        }
    }

    public String toString() {
        String staffArray = "";
        for (int i = 0; i < 3; i++) {
            staffArray += staff[i] + "\n";
        }
        return "Customer name: " + custName + "\nPhone Number: " + phoneNo + "\nLocation: " + location
                + "\nService Type: " + serviceType + "\nDuration: " + duration + "\n" + staffArray;
    }

    public double calcServiceCharge(){
        double totalServiceCharge = 0;

        switch(serviceType){
            case 'P':
                totalServiceCharge = 60.00 * duration;
                break;
            case 'T':
                totalServiceCharge = 120.00 * duration;
            case 'B':
                totalServiceCharge = 80.00 * duration;
        }

        if(duration > 5){
            totalServiceCharge *= 0.95;
        }

        return totalServiceCharge;
    }
}