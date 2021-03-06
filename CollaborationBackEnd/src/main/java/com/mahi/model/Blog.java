package com.mahi.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="Blog",schema="mahitha")
@Entity
public class Blog
{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long blogId;
	private String title;
	private String description;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	private SignUp user;
	private String status;
	public long getBlogId() {
		return blogId;
	}
	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public SignUp getUser() {
		return user;
	}
	public void setUser(SignUp user) {
		this.user = user;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
