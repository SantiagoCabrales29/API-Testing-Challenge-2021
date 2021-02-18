package com.endava.app.entities;

import java.util.Date;

public class ListItem {
	private String posterPath;
	private boolean adult;
	private String overview;
	private Date releaseDate;
	private String originalTitle;
	private Object genreIds;
	private int id;
	private String mediaType;
	private String originalLanguage;
	private String title;
	private Object backdropPath;
	private double popularity;
	private int voteCount;
	private boolean video;
	private double voteAverage;

	public ListItem(String posterPath, boolean adult, String overview, Date releaseDate, String originalTitle, Object genreIds, int id, String mediaType, String originalLanguage, String title, Object backdropPath, double popularity, int voteCount, boolean video, double voteAverage) {
		this.posterPath = posterPath;
		this.adult = adult;
		this.overview = overview;
		this.releaseDate = releaseDate;
		this.originalTitle = originalTitle;
		this.genreIds = genreIds;
		this.id = id;
		this.mediaType = mediaType;
		this.originalLanguage = originalLanguage;
		this.title = title;
		this.backdropPath = backdropPath;
		this.popularity = popularity;
		this.voteCount = voteCount;
		this.video = video;
		this.voteAverage = voteAverage;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public Object getGenreIds() {
		return genreIds;
	}

	public void setGenreIds(Object genreIds) {
		this.genreIds = genreIds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Object getBackdropPath() {
		return backdropPath;
	}

	public void setBackdropPath(Object backdropPath) {
		this.backdropPath = backdropPath;
	}

	public double getPopularity() {
		return popularity;
	}

	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	public boolean isVideo() {
		return video;
	}

	public void setVideo(boolean video) {
		this.video = video;
	}

	public double getVoteAverage() {
		return voteAverage;
	}

	public void setVoteAverage(double voteAverage) {
		this.voteAverage = voteAverage;
	}
}
