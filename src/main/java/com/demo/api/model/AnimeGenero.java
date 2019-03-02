// Generated with g9.

package com.demo.api.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "animesgeneros", indexes = {
		@Index(name = "animeGeneroAkKAngenAnimesge", columnList = "anime_id,gen_id", unique = true) })
public class AnimeGenero implements Serializable {

	/** Primary key. */
	protected static final String PK = "angenId";

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	/**
	 * Access method for the lockFlag property.
	 *
	 * @return the current value of the lockFlag property
	 */
	public Integer getLockFlag() {
		return lockFlag;
	}

	/**
	 * Sets the value of the lockFlag property.
	 *
	 * @param aLockFlag the new value of the lockFlag property
	 */
	public void setLockFlag(Integer aLockFlag) {
		lockFlag = aLockFlag;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "angen_id", unique = true, nullable = false, precision = 10)
	private int angenId;
	@ManyToOne
	@JoinColumn(name = "anime_id")
	private Anime anime;
	@ManyToOne
	@JoinColumn(name = "gen_id")
	private Genero genero;

	/** Default constructor. */
	public AnimeGenero() {
		super();
	}

	/**
	 * Access method for angenId.
	 *
	 * @return the current value of angenId
	 */
	public int getAngenId() {
		return angenId;
	}

	/**
	 * Setter method for angenId.
	 *
	 * @param aAngenId the new value for angenId
	 */
	public void setAngenId(int aAngenId) {
		angenId = aAngenId;
	}

	/**
	 * Access method for anime.
	 *
	 * @return the current value of anime
	 */
	public Anime getAnime() {
		return anime;
	}

	/**
	 * Setter method for anime.
	 *
	 * @param aAnime the new value for anime
	 */
	public void setAnime(Anime aAnime) {
		anime = aAnime;
	}

	/**
	 * Access method for genero.
	 *
	 * @return the current value of genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Setter method for genero.
	 *
	 * @param aGenero the new value for genero
	 */
	public void setGenero(Genero aGenero) {
		genero = aGenero;
	}

	/**
	 * Gets the group fragment animeId for member anime.
	 *
	 * @return Current value of the group fragment
	 * @see Anime
	 */
	public int getAnimeAnimeId() {
		return (getAnime() == null ? null : getAnime().getAnimeId());
	}

	/**
	 * Sets the group fragment animeId from member anime.
	 *
	 * @param aAnimeId New value for the group fragment
	 * @see Anime
	 */
	public void setAnimeAnimeId(int aAnimeId) {
		if (getAnime() != null) {
			getAnime().setAnimeId(aAnimeId);
		}
	}

	/**
	 * Gets the group fragment genId for member genero.
	 *
	 * @return Current value of the group fragment
	 * @see Genero
	 */
	public int getGeneroGenId() {
		return (getGenero() == null ? null : getGenero().getGenId());
	}

	/**
	 * Sets the group fragment genId from member genero.
	 *
	 * @param aGenId New value for the group fragment
	 * @see Genero
	 */
	public void setGeneroGenId(int aGenId) {
		if (getGenero() != null) {
			getGenero().setGenId(aGenId);
		}
	}

	/**
	 * Compares the key for this instance with another AnimeGenero.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class AnimeGenero and the key
	 *         objects are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AnimeGenero)) {
			return false;
		}
		AnimeGenero that = (AnimeGenero) other;
		if (this.getAngenId() != that.getAngenId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another AnimeGenero.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof AnimeGenero))
			return false;
		return this.equalKeys(other) && ((AnimeGenero) other).equalKeys(this);
	}

	/**
	 * Returns a hash code for this instance.
	 *
	 * @return Hash code
	 */
	@Override
	public int hashCode() {
		int i;
		int result = 17;
		i = getAngenId();
		result = 37 * result + i;
		return result;
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[AnimeGenero |");
		sb.append(" angenId=").append(getAngenId());
		sb.append("]");
		return sb.toString();
	}

	/**
	 * Return all elements of the primary key.
	 *
	 * @return Map of key names to values
	 */
	public Map<String, Object> getPrimaryKey() {
		Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
		ret.put("angenId", Integer.valueOf(getAngenId()));
		return ret;
	}

}
