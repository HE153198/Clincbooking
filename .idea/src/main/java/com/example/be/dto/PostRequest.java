package com.example.be.dto;

public class PostRequest {
	
	private String idClinic;
	
	private String idTypePost;
	
	private String content;

	private String id;

	public PostRequest() {
		super();
	}

	public String getIdClinic() {
		return idClinic;
	}

	public String getIdTypePost() {
		return idTypePost;
	}

	public String getContent() {
		return content;
	}

	public void setIdClinic(String idClinic) {
		this.idClinic = idClinic;
	}

	public void setIdTypePost(String idTypePost) {
		this.idTypePost = idTypePost;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
