package moblima.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cineplex implements Serializable {

    private String cineplexName;
    private int cinplexID;
    private String cineplexAddress;
    private int numOfCinema;
    private ArrayList<Cinema> cinemaList;

    public Cineplex() {
        cinemaList = new ArrayList();
        numOfCinema = cinemaList.size();
    }

    public String getCineplexName() {
        return this.cineplexName;
    }

    public void setCineplexName(String cineplexName) {
        this.cineplexName = cineplexName;
    }

    public int getCinplexID() {
        return this.cinplexID;
    }

    public void setCinplexID(int cinplexID) {
        this.cinplexID = cinplexID;
    }

    public String getCineplexAddress() {
        return this.cineplexAddress;
    }

    public void setCineplexAddress(String cineplexAddress) {
        this.cineplexAddress = cineplexAddress;
    }
    
    public ArrayList<Cinema> getCinemaList(){
        return cinemaList;
    }

    public void addCinemaToCineplex(Cinema cinema) {
        cinemaList.add(cinema);
        setNumOfCinema(cinemaList.size());
    }

    public void removeCinemaFromCineplex(Cinema cinema) {
        if (cinemaList.contains(cinema)) {
            cinemaList.remove(cinema);
            setNumOfCinema(cinemaList.size());
        }
    }

    /**
     * @return the numOfCinema
     */
    public int getNumOfCinema() {
        return numOfCinema;
    }

    /**
     * @param numOfCinema the numOfCinema to set
     */
    private void setNumOfCinema(int numOfCinema) {
        this.numOfCinema = numOfCinema;
    }
}