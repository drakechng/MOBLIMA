package moblima.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Booking implements Serializable {

	private int bookingID;
	private String TID;
        private ArrayList<Ticket> ticketList;
        private Transaction transaction;
        
        public Booking(){
            ticketList = new ArrayList();
        }

	public int getBookingID() {
		return this.bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public String getTID() {
		return this.TID;
	}

	public void setTID(String TID) {
		this.TID = TID;
	}
        
        public void setTicketList(ArrayList ticketList){
            this.ticketList = ticketList;
        }
        
        public void addTicketsToBooking(Ticket ticket){
            ticketList.add(ticket);
        }
        
        public void setTransaction(Transaction transaction){
            this.transaction = transaction;
        }
        
        public Transaction getTransaction(){
            return transaction;
        }

}