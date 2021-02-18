package com.endava.app.entities;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MovieDetails {
	private boolean adult;
	private String backdropPath;
	private Object belongsToCollection;
	private int budget;
	private List<MovieGenre> genre;
	private String homePage;
	private int id;
	private String imdbId;
	private String originalLanguage;
	private String originalTitle;
	private String overview;
	private double popularity;
	private Object posterPath;
	private List<ProductionCompanies> productionCompanies;
	private Date releaseDate;
	private int revenue;
	private int runtime;
	private HashMap<String,String> spokenLanguages;
	private String status;
	private String tagline;
	private String title;
	private boolean video;
	private double voteAverage;
	private int voteCount;

	public MovieDetails(boolean adult, String backdropPath, Object belongsToCollection, int budget, List<MovieGenre> genre, String homePage, int id, String imdbId, String originalLanguage, String originalTitle, String overview, double popularity, Object posterPath, List<ProductionCompanies> productionCompanies, Date releaseDate, int revenue, int runtime, HashMap<String, String> spokenLanguages, String status, String tagline, String title, boolean video, double voteAverage, int voteCount) {
		this.adult = adult;
		this.backdropPath = backdropPath;
		this.belongsToCollection = belongsToCollection;
		this.budget = budget;
		this.genre = genre;
		this.homePage = homePage;
		this.id = id;
		this.imdbId = imdbId;
		this.originalLanguage = originalLanguage;
		this.originalTitle = originalTitle;
		this.overview = overview;
		this.popularity = popularity;
		this.posterPath = posterPath;
		this.productionCompanies = productionCompanies;
		this.releaseDate = releaseDate;
		this.revenue = revenue;
		this.runtime = runtime;
		this.spokenLanguages = spokenLanguages;
		this.status = status;
		this.tagline = tagline;
		this.title = title;
		this.video = video;
		this.voteAverage = voteAverage;
		this.voteCount = voteCount;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}

	public Object getBelongsToCollection() {
		return belongsToCollection;
	}

	public void setBelongsToCollection(Object belongsToCollection) {
		this.belongsToCollection = belongsToCollection;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public List<MovieGenre> getGenre() {
		return genre;
	}

	public void setGenre(List<MovieGenre> genre) {
		this.genre = genre;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public double getPopularity() {
		return popularity;
	}

	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}

	public Object getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(Object posterPath) {
		this.posterPath = posterPath;
	}

	public List<ProductionCompanies> getProductionCompanies() {
		return productionCompanies;
	}

	public void setProductionCompanies(List<ProductionCompanies> productionCompanies) {
		this.productionCompanies = productionCompanies;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public HashMap<String, String> getSpokenLanguages() {
		return spokenLanguages;
	}

	public void setSpokenLanguages(HashMap<String, String> spokenLanguages) {
		this.spokenLanguages = spokenLanguages;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
}
