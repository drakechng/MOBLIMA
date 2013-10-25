/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moblima.main;

import java.util.ArrayList;
import java.util.Scanner;
import moblima.controller.*;
import moblima.model.Cineplex;

/**
 *
 * @author Chng Yao Guang, U1222229A <sce.cz2002.cyg.lab#>
 */
public class AdminMain {

    private BookingController bookingController;
    private CineplexController cineplexController;
    private MovieController movieController;
    private PriceController priceController;
    private SessionController sessionController;
    private Scanner in;
    private boolean authenticated;

    public static void main(String[] args) {
        AdminMain adminMain = new AdminMain();
//        Cineplex cineplex = new Cineplex();
//        cineplex.setCinplexID(1);
//        cineplex.setCineplexName("The Cathay");
//        cineplex.setCineplexAddress("2 Handy Rd, 229233");
//        ArrayList l = new ArrayList();
//        l.add(cineplex);
//        DataController.writeSerializedObject("cineplex.dat", l);
        adminMain.initalize();
    }

    public AdminMain() {
        in = new Scanner(System.in);
        authenticated = false;
    }

    private void initalize() {

        System.out.println("Welcome to ABC Movie Complex");
        while (authenticate() && loadMainMenu()) {
        }
        System.out.println("Good Bye!");
    }

    private boolean authenticate() {
        String username, password;
        int attempts = 0;
        System.out.println("Login");
        while (!authenticated && attempts < 3) {
            System.out.print("Username: ");
            username = in.next();
            System.out.println("Password: ");
            password = in.next();
            if ("admin".equals(username) && "password".equals(password)) {
                authenticated = true;
            } else {
                System.out.println("Invalid Login");
            }
            attempts++;
        }
        return authenticated;
    }

    private boolean loadMainMenu() {
        String selection = "0";
        while (!selection.equals("Q")) {
            System.out.println("\nPlease select one of the management modules:");
            System.out.println("1 - Cineplex Management");
            System.out.println("2 - Movie Listing Management");
            System.out.println("3 - Pricing Management");
            System.out.println("4 - Session Management");
            System.out.println("Q - Exit Application");
            selection = in.next();

            switch (selection) {
                case "1":
                    cineplexController = new CineplexController();
                    cineplexController.main();
                    break;
                case "2":
                    movieController = new MovieController();
                    break;
                case "3":
                    priceController = new PriceController();
                    break;
                case "4":
                    sessionController = new SessionController();
                case "Q":
                    return false;
            }
        }
        return true;
    }
}
