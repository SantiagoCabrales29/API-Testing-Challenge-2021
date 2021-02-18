package com.endava.app.entities;

import java.util.List;

public class ListDetails {
	private String createdBy;
	private String description;
	private int favoriteCount;
	private String id;
	private List<ListItem> items;
	private int itemCount;
	private String iso_639_1;
	private String name;
	private String posterPath;

	public ListDetails(String createdBy, String description, int favoriteCount, String id, List<ListItem> items, int itemCount, String iso_639_1, String name, String posterPath) {
		this.createdBy = createdBy;
		this.description = description;
		this.favoriteCount = favoriteCount;
		this.id = id;
		this.items = items;
		this.itemCount = itemCount;
		this.iso_639_1 = iso_639_1;
		this.name = name;
		this.posterPath = posterPath;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getFavoriteCount() {
		return favoriteCount;
	}

	public void setFavoriteCount(int favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ListItem> getItems() {
		return items;
	}

	public void setItems(List<ListItem> items) {
		this.items = items;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getIso_639_1() {
		return iso_639_1;
	}

	public void setIso_639_1(String iso_639_1) {
		this.iso_639_1 = iso_639_1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
}
