package br.com.qintess.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {

	private Integer userId;
	private Integer id;
	private String title;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getBoolean() {
		return Boolean;
	}

	public void setBoolean(Integer b) {
		Boolean = b;
	}

	private Integer Boolean;
}
