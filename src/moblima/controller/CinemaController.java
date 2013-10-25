/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moblima.controller;

import java.util.Scanner;
import moblima.model.Cinema;
/**
 *
 * @author Chng Yao Guang, U1222229A <sce.cz2002.cyg.lab#>
 */
public class CinemaController {
    
    private Cinema cinema;
    private Scanner in;
    
    public CinemaController(){
        cinema = new Cinema();
        in = new Scanner(System.in);
    }
    
    public CinemaController(Cinema cinema){
        this.cinema = cinema;
    }
    
    public Cinema getCinema(){
        return cinema;
    }
    
    public Cinema createCinema(){
        System.out.println("Set Class: ");
        cinema.setCinemaClass(in.next());
        return cinema;
    }
    
}
