package moblima.model;

import java.io.Serializable;

public class Ticket implements Serializable {

    private String ticketID;
    private int seatRow;
    private int seatColumn;
    private Session session;
    
    public Ticket(Session session, String ticketID, int seatRow, int seatColumn){
        this.ticketID = ticketID;
        this.session = session;
        this.seatRow = seatRow;
        this.seatColumn = seatColumn;
        addTicket();
    }

    public String getTicketID() {
        return this.ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public int getSeatRow() {
        return this.seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatColumn() {
        return this.seatColumn;
    }

    public void setSeatColumn(int seatColumn) {
        this.seatColumn = seatColumn;
    }

    private void addTicket() {
        session.addTicketToSession(this);
    }
}