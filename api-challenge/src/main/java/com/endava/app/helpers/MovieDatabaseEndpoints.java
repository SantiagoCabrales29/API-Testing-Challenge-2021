package com.endava.app.helpers;

public class MovieDatabaseEndpoints {
	public static final String createToken = "authentication/token/new";
	public static final String createSessionId = "authentication/session/new";
	public static final String list = "list";
	public static final String addMovieToList = "list/%s/add_item";
	public static final String getList = "list/%s";
	public static final String clearList = "list/%s/clear";
	public static final String rateMovie = "movie/%s/rating";
	public static final String rateTvShow = "tv/%s/rating";
	public static final String rateTvEpisode = "/tv/%s/season/%t/episode/%u";

	public static String addMovieToList(int id){
		return String.format(addMovieToList, id);
	}

	public static String getList(int id){
		return String.format(getList, id);
	}

	public static String clearList(int id){
		return String.format(clearList, id);
	}

	public static String rateMovie(int id){
		return String.format(rateMovie, id);
	}

	public static String rateTvShow(int id){
		return String.format(rateTvShow, id);
	}

}
