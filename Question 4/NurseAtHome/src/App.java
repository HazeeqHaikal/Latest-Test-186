import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        HomeCare[] homecare = new HomeCare[30];

        int staffAmount = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Enter customer name: ");
            String custName = strInput.nextLine();

            System.out.print("Enter phone number: ");
            String phoneNo = strInput.nextLine();

            System.out.print("Basic Personal Care (P)\nPhysiotherapy (T)\nBaby Care(B)\n\nEnter service type: ");
            char serviceType = strInput.next().charAt(0);

            System.out.print("Enter the duration (hour): ");
            int duration = intInput.nextInt();
            strInput.nextLine();

            Staff[] staff = new Staff[3];
            for(int j = 0; j < 3; j++){
                System.out.print("Enter staff name: ");
                String staffname = strInput.nextLine();

                System.out.print("Enter staff ID: ");
                String staffId = strInput.nextLine();

                System.out.print("Enter staff contact: ");
                String staffContact = strInput.nextLine();

                staff[j] = new Staff(staffname, staffId, staffContact);
            }

            homecare[i] = new HomeCare(custName, phoneNo, phoneNo, serviceType, duration, staff);
        }
    }
}
