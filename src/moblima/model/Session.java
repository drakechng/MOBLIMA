package moblima.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Session implements Serializable {

	private String dateTime;
        private Cinema cinema;
        private Movie movie;
        private ArrayList<Ticket> ticketList;
        
        public Session(Cinema cinema, Movie movie){
            this.cinema = cinema;
            this.movie = movie;
            ticketList = new ArrayList();
            addSession();
        }

	public String getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
        
        private void addSession(){
            cinema.addSessionToCinema(this);
        }
        
        public void deleteSession(){
            cinema.removeSessionFromCinema(this);
        }
        
        public void addTicketToSession(Ticket ticket){
            ticketList.add(ticket);
        }
        
        public void removeTicketFromSession(Ticket ticket){
            if(ticketList.contains(ticket)){
                ticketList.remove(ticket);
            }
        }
}