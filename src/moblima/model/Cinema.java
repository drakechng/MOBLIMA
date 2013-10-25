package moblima.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cinema implements Serializable {

	private int cinemaID;
	private String cinemaClass;
	private String cinemaCode;
        private String cinemaName;
        private ArrayList<Session> sessionList;

	public int getCinemaID() {
		return this.cinemaID;
	}

	public void setCinemaID(int cinemaID) {
		this.cinemaID = cinemaID;
	}

	public String getCinemaClass() {
		return this.cinemaClass;
	}

	public void setCinemaClass(String cinemaClass) {
		this.cinemaClass = cinemaClass;
	}

	public String getCinemaCode() {
		return this.cinemaCode;
	}

	public void setCinemaCode(String cinemaCode) {
		this.cinemaCode = cinemaCode;
	}
        
        public void addSessionToCinema(Session session){
            sessionList.add(session);
        }
        
        public void removeSessionFromCinema(Session session){
            if(sessionList.contains(session)){
                sessionList.remove(session);
            }
        }

    /**
     * @return the cinemaName
     */
    public String getCinemaName() {
        return cinemaName;
    }

    /**
     * @param cinemaName the cinemaName to set
     */
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

}