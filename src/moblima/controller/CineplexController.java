/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moblima.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import moblima.model.Cineplex;
import moblima.model.Cinema;

/**
 *
 * @author Chng Yao Guang, U1222229A <sce.cz2002.cyg.lab#>
 */
public class CineplexController {

    private int ID;
    private ArrayList<Cineplex> cineplexList;
    private List list;
    private Scanner in;

    public CineplexController() {
        cineplexList = new ArrayList();
        in = new Scanner(System.in);
    }

    public void main() {
        ID = 0;
        String response = new String();

        while (!response.equals("B")) {

            // Load Cineplex List
            cineplexList = loadCineplex();
            
            // Display Cineplex List
            printCineplex(cineplexList);

            System.out.println("\nPlease select an action");
            System.out.println("1 - View Cineplex Information");
            System.out.println("2 - Add New Cineplex");
            System.out.println("3 - Edit Existing Cineplex");
            System.out.println("4 - Add Cinema to Cineplex");
            System.out.println("B - Back to Main Menu");
            response = in.next();

            switch (response) {
                case "1":
                    viewCineplex();
                    break;
                case "2":
                    createCineplex();
                    break;
                case "3":
                    updateCineplex();
                case "B":
                    break;
            }
        }
    }

    public Cineplex selectCineplex() {
        int response;
        printCineplex(cineplexList);
        response = in.nextInt();
        return cineplexList.get(response - 1);
    }

    public Cinema selectCinema(Cineplex cineplex) {
        int response;
        printCinema(cineplex.getCinemaList());
        response = in.nextInt();
        return cineplex.getCinemaList().get(response - 1);
    }

    private void printCineplex(ArrayList<Cineplex> cineplexList) {
        System.out.println("\n==============================\nCineplex Management\n==============================");
        for (Cineplex cineplex : cineplexList) {
            System.out.printf("%d: %s, %s - Total Cinema: %d\n", cineplex.getCinplexID(), cineplex.getCineplexName(), cineplex.getCineplexAddress(), cineplex.getNumOfCinema());
        }
    }

    private void printCinema(ArrayList<Cinema> cinemaList) {
        System.out.println("\n==============================\nCineplex Management\n==============================");
        for (Cinema cinema : cinemaList) {
            System.out.printf("%d: %s, %s\n", cinema.getCinemaID(), cinema.getCinemaClass(), cinema.getCinemaName());
        }
    }

    private void viewCineplex() {
        Cineplex cineplex;
        int response;
        System.out.println("Please select a cineplex number:");
        response = in.nextInt();
        cineplex = cineplexList.get(response - 1);

        System.out.printf("Cineplex ID: %d\n", cineplex.getCinplexID());
        System.out.printf("Cineplex Name: %s\n", cineplex.getCineplexName());
        System.out.printf("Cineplex Address: %s\n", cineplex.getCineplexAddress());

        System.out.println("Cinemas -");
        for (Cinema cinema : cineplex.getCinemaList()) {
            System.out.printf("Cinema Class: %s\n", cinema.getCinemaClass());
        }

    }

    private void createCineplex() {
        CinemaController cinemaController;
        Cineplex cineplex = new Cineplex();
        String response = new String();

        cineplex.setCinplexID(ID);
        System.out.println("Please enter a name for the cineplex");
        cineplex.setCineplexName(in.next());
        System.out.println("Please enter the address for the cineplex");
        cineplex.setCineplexAddress(in.next());

        while (!response.equals("N")) {
            cinemaController = new CinemaController();
            cineplex.addCinemaToCineplex(cinemaController.createCinema());
            System.out.println("Add another Cinema? Y - Yes, N - No");
            response = in.next();
        }

        cineplexList.add(cineplex);

        saveCineplex();
    }

    private void updateCineplex() {
        String input = new String();
        System.out.println("Please select the cineplex number");
        int index = in.nextInt();
        Cineplex cineplex = cineplexList.get(index - 1);
        System.out.printf("Existing Name: %s\n", cineplex.getCineplexName());
        System.out.println("New Name [leave blank to skip]:");
        input = in.next();
        if (!input.isEmpty()) {
            cineplex.setCineplexName(input);
        }

        System.out.printf("Existing Address: %s\n", cineplex.getCineplexAddress());
        System.out.println("New Address [leave blank to skip]: ");
        input = in.next();
        if (!input.isEmpty()) {
            cineplex.setCineplexAddress(input);
        }

        // Remove existing object from list
        cineplexList.remove(index - 1);

        // Add New Object to previous index
        cineplexList.add(index - 1, cineplex);

        saveCineplex();
    }

    private ArrayList<Cineplex> loadCineplex() {
        cineplexList = new ArrayList();
        try {
            list = DataController.readSerializedObject("cineplex.dat");
            for (int i = 0; i < list.size(); i++) {
                Cineplex cineplex = (Cineplex) list.get(i);
                cineplexList.add(cineplex);
            }

            // Read the last added ID and set next new ID
            ID = cineplexList.get(cineplexList.size() - 1).getCinplexID() + 1;
        } catch (Exception ex) {
        }
        
        return cineplexList;
    }

    private void saveCineplex() {
        DataController.writeSerializedObject("cineplex.dat", cineplexList);
    }
}
