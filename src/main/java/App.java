import java.sql.Driver;
import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        DriverProfile possibleDriver = new DriverProfile();

        //gather age for verification
        myApp.input(possibleDriver);

        possibleDriver.verify_can_drive();

        possibleDriver.build_and_print();
    }
    public void input(DriverProfile possibledriver)
    {
        //set
        System.out.print("What is your age? ");
        possibledriver.setAge(in.nextInt());
    }

}
