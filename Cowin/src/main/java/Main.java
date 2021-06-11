import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        VaccineService vaccineService = new VaccineService();


       while (true) {
           boolean isAvailable = vaccineService.isAvailable();

           if (isAvailable) {

               //Todo:notify
               vaccineService.notifyOnMac();
               System.out.println("Available");
           }

           //calls after X minutes
           Thread.sleep(5*60*1000);
       }



    }
}
