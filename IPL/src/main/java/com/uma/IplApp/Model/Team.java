package com.uma.IplApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "IPL_Team")
public class Team {
	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "coach")
	private String coach;
	@Column(name = "owner")
	private String owner;
	@Column(name = "captain")
	private String captain;
	@Column(name = "logo")
	private String logo;
	@Column(name = "homeVenue")
	private String homeVenue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getHomeVenue() {
		return homeVenue;
	}

	public void setHomeVenue(String homeVenue) {
		this.homeVenue = homeVenue;
	}

}
