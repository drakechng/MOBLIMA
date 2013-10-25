package moblima.model;

import java.io.Serializable;

public class MovieType implements Serializable {

	private int movieTypeID;
	private String movieTypeName;

	public int getMovieTypeID() {
		return this.movieTypeID;
	}

	public void setMovieTypeID(int movieTypeID) {
		this.movieTypeID = movieTypeID;
	}

    /**
     * @return the movieTypeName
     */
    public String getMovieTypeName() {
        return movieTypeName;
    }

    /**
     * @param movieTypeName the movieTypeName to set
     */
    public void setMovieTypeName(String movieTypeName) {
        this.movieTypeName = movieTypeName;
    }

}