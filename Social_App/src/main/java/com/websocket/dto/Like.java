package com.websocket.dto;

public class Like {
	@Override
	public String toString() {
		return "[id=" + id + ", post_id=" + post_id + ", user_id=" + user_id + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}
	private int id;
    private int post_id;
    private int user_id;
    private String created_at;
    private String updated_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
    
    
}
