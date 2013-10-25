package moblima.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Movie implements Serializable  {

	private int movieID;
	private String movieCode;
	private String movieStatus;
	private boolean isBlockBuster;
	private String movieInfo;
	private int movieType;
        private int movieDuration;
        private ArrayList<Session> sessionList;
        private ArrayList<MovieType> movieTypesList;
        
        public Movie(){
            sessionList = new ArrayList();
            movieTypesList = new ArrayList();
        }

	public int getMovieID() {
		return this.movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieCode() {
		return this.movieCode;
	}

	public void setMovieCode(String movieCode) {
		this.movieCode = movieCode;
	}

	public String getMovieStatus() {
		return this.movieStatus;
	}

	public void setMovieStatus(String movieStatus) {
		this.movieStatus = movieStatus;
	}

	public boolean isIsBlockBuster() {
		return this.isBlockBuster;
	}

	public void setIsBlockBuster(boolean isBlockBuster) {
		this.isBlockBuster = isBlockBuster;
	}

	public String getMovieInfo() {
		return this.movieInfo;
	}

	public void setMovieInfo(String movieInfo) {
		this.movieInfo = movieInfo;
	}

	public int getMovieType() {
		return this.movieType;
	}

	public void setMovieType(int movieType) {
		this.movieType = movieType;
	}
        
        public void addSessionToMovie(Session session){
            sessionList.add(session);
        }
        
        public void removeSessionFromMovie(Session session){
            if(sessionList.contains(session)){
                sessionList.remove(session);
            }
        }
        
        public void addMovieType(MovieType movieType){
            movieTypesList.add(movieType);
        }
        
        public void removeMovieType(MovieType movieType){
            if(movieTypesList.contains(movieType)){
                movieTypesList.remove(movieType);
            }
        }

    /**
     * @return the movieDuration
     */
    public int getMovieDuration() {
        return movieDuration;
    }

    /**
     * @param movieDuration the movieDuration to set
     */
    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

}