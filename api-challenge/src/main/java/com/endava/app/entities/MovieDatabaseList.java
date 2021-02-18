package com.endava.app.entities;

public class MovieDatabaseList {
	private int list_id;
	private String name;
	private String description;
	private String language;

	public MovieDatabaseList(String name, String description, String language) {
		this.name = name;
		this.description = description;
		this.language = language;
	}

	public int getList_id() {
		return list_id;
	}

	public void setList_id(int list_id) {
		this.list_id = list_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
