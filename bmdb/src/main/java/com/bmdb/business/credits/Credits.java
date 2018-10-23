package com.bmdb.business.credits;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Credits {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int actorId;
	private int movieId;
	private String CharacterName;
	
	public Credits(int id, int actorId, int movieId, String characterName) {
		super();
		this.id = id;
		this.actorId = actorId;
		this.movieId = movieId;
		CharacterName = characterName;
	}

	public Credits() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getCharacterName() {
		return CharacterName;
	}

	public void setCharacterName(String characterName) {
		CharacterName = characterName;
	}

	@Override
	public String toString() {
		return "Credits [id=" + id + ", actorId=" + actorId + ", movieId=" + movieId + ", CharacterName="
				+ CharacterName + "]";
	}
	
	

}
