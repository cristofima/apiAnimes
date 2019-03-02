// Generated with g9.

package com.demo.api.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "generos")
public class Genero implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gen_id", unique = true, nullable = false, precision = 10)
	private int genId;
	@Column(name = "gen_nombre", nullable = false, length = 20)
	private String genNombre;
	
	@Column(name = "created_at", nullable = false)
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updatedAt;
	@OneToMany(mappedBy = "genero")
	private Set<AnimeGenero> animeGenero;

	/**
	 * Access method for genId.
	 *
	 * @return the current value of genId
	 */
	public int getGenId() {
		return genId;
	}

	/**
	 * Setter method for genId.
	 *
	 * @param aGenId the new value for genId
	 */
	public void setGenId(int aGenId) {
		genId = aGenId;
	}

	/**
	 * Access method for genNombre.
	 *
	 * @return the current value of genNombre
	 */
	public String getGenNombre() {
		return genNombre;
	}

	/**
	 * Setter method for genNombre.
	 *
	 * @param aGenNombre the new value for genNombre
	 */
	public void setGenNombre(String aGenNombre) {
		genNombre = aGenNombre;
	}

	/**
	 * Access method for createdAt.
	 *
	 * @return the current value of createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * Setter method for createdAt.
	 *
	 * @param aCreatedAt the new value for createdAt
	 */
	public void setCreatedAt(Date aCreatedAt) {
		createdAt = aCreatedAt;
	}

	/**
	 * Access method for updatedAt.
	 *
	 * @return the current value of updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Setter method for updatedAt.
	 *
	 * @param aUpdatedAt the new value for updatedAt
	 */
	public void setUpdatedAt(Date aUpdatedAt) {
		updatedAt = aUpdatedAt;
	}

	/**
	 * Access method for animeGenero.
	 *
	 * @return the current value of animeGenero
	 */
	public Set<AnimeGenero> getAnimeGenero() {
		return animeGenero;
	}

	/**
	 * Setter method for animeGenero.
	 *
	 * @param aAnimeGenero the new value for animeGenero
	 */
	public void setAnimeGenero(Set<AnimeGenero> aAnimeGenero) {
		animeGenero = aAnimeGenero;
	}

	/**
	 * Compares the key for this instance with another Genero.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class Genero and the key objects
	 *         are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Genero)) {
			return false;
		}
		Genero that = (Genero) other;
		if (this.getGenId() != that.getGenId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another Genero.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Genero))
			return false;
		return this.equalKeys(other) && ((Genero) other).equalKeys(this);
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
		i = getGenId();
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
		StringBuffer sb = new StringBuffer("[Genero |");
		sb.append(" genId=").append(getGenId());
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
		ret.put("genId", Integer.valueOf(getGenId()));
		return ret;
	}

	@PrePersist
	public void prePersist() {
		Date now  = new Date();
		createdAt = now;
		updatedAt = now;
	}

	@PreUpdate
	public void preUpdate() {
		updatedAt = new Date();
	}
}
