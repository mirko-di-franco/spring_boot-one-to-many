package com.generation.relazionionetomany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "photos")
public class Photo {
	
	//1. CREO L'ENTITÁ
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 200, name = "main_url", nullable = false, unique = true)
	private String url;
	
	private String title;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	
	
	// 2. CREO LA RELAZIONE. Many to one va inserita nella tabella che ha la foreign key
	@ManyToOne
	// GLI DICO QUAL'è LA FOREIGN KEY CHE VERRà COLLEGATA ALL'ID DI USER
	@JoinColumn(name = "user_id")
	//RELAZIONE CON L'ENTITÁ DELLA CLASSE USER
	private User user;
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
