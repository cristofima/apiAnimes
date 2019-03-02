// Generated with g9.

package com.demo.api.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "animes", indexes = {
		@Index(name = "animes_anime_nombre_IX", columnList = "anime_nombre", unique = true) })
public class Anime implements Serializable {

	/** Primary key. */
	protected static final String PK = "animeId";

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
	@Column(name = "anime_id", unique = true, nullable = false, precision = 10)
	private int animeId;
	@Column(name = "anime_nombre", unique = true, nullable = false, length = 40)
	private String animeNombre;
	@Column(name = "anime_sinopsis", nullable = false)
	private String animeSinopsis;
	@Column(name = "anime_estado", nullable = false, length = 1)
	private String animeEstado;
	@Column(name = "anime_anio", nullable = false, precision = 10)
	private int animeAnio;
	@Column(name = "anime_tipo", nullable = false, length = 1)
	private String animeTipo;
	@Column(name = "anime_episodios", precision = 10)
	private int animeEpisodios;
	@Column(name = "anime_imagen")
	private byte[] animeImagen;
	@Column(name = "anime_mime_type", length = 12)
	private String animeMimeType;
	@Column(name = "created_at", nullable = false)
	private Timestamp createdAt;
	@Column(name = "updated_at")
	private Timestamp updatedAt;
	@OneToMany(mappedBy = "anime")
	private Set<AnimeGenero> animeGenero;
	@OneToMany(mappedBy = "anime2")
	private Set<Anime> anime3;
	@ManyToOne
	@JoinColumn(name = "anime_precuela_id")
	private Anime anime2;
	@OneToMany(mappedBy = "anime4")
	private Set<Anime> anime5;
	@ManyToOne
	@JoinColumn(name = "anime_secuela_id")
	private Anime anime4;

	/** Default constructor. */
	public Anime() {
		super();
	}

	/**
	 * Access method for animeId.
	 *
	 * @return the current value of animeId
	 */
	public int getAnimeId() {
		return animeId;
	}

	/**
	 * Setter method for animeId.
	 *
	 * @param aAnimeId the new value for animeId
	 */
	public void setAnimeId(int aAnimeId) {
		animeId = aAnimeId;
	}

	/**
	 * Access method for animeNombre.
	 *
	 * @return the current value of animeNombre
	 */
	public String getAnimeNombre() {
		return animeNombre;
	}

	/**
	 * Setter method for animeNombre.
	 *
	 * @param aAnimeNombre the new value for animeNombre
	 */
	public void setAnimeNombre(String aAnimeNombre) {
		animeNombre = aAnimeNombre;
	}

	/**
	 * Access method for animeSinopsis.
	 *
	 * @return the current value of animeSinopsis
	 */
	public String getAnimeSinopsis() {
		return animeSinopsis;
	}

	/**
	 * Setter method for animeSinopsis.
	 *
	 * @param aAnimeSinopsis the new value for animeSinopsis
	 */
	public void setAnimeSinopsis(String aAnimeSinopsis) {
		animeSinopsis = aAnimeSinopsis;
	}

	/**
	 * Access method for animeEstado.
	 *
	 * @return the current value of animeEstado
	 */
	public String getAnimeEstado() {
		return animeEstado;
	}

	/**
	 * Setter method for animeEstado.
	 *
	 * @param aAnimeEstado the new value for animeEstado
	 */
	public void setAnimeEstado(String aAnimeEstado) {
		animeEstado = aAnimeEstado;
	}

	/**
	 * Access method for animeAnio.
	 *
	 * @return the current value of animeAnio
	 */
	public int getAnimeAnio() {
		return animeAnio;
	}

	/**
	 * Setter method for animeAnio.
	 *
	 * @param aAnimeAnio the new value for animeAnio
	 */
	public void setAnimeAnio(int aAnimeAnio) {
		animeAnio = aAnimeAnio;
	}

	/**
	 * Access method for animeTipo.
	 *
	 * @return the current value of animeTipo
	 */
	public String getAnimeTipo() {
		return animeTipo;
	}

	/**
	 * Setter method for animeTipo.
	 *
	 * @param aAnimeTipo the new value for animeTipo
	 */
	public void setAnimeTipo(String aAnimeTipo) {
		animeTipo = aAnimeTipo;
	}

	/**
	 * Access method for animeEpisodios.
	 *
	 * @return the current value of animeEpisodios
	 */
	public int getAnimeEpisodios() {
		return animeEpisodios;
	}

	/**
	 * Setter method for animeEpisodios.
	 *
	 * @param aAnimeEpisodios the new value for animeEpisodios
	 */
	public void setAnimeEpisodios(int aAnimeEpisodios) {
		animeEpisodios = aAnimeEpisodios;
	}

	/**
	 * Access method for animeImagen.
	 *
	 * @return the current value of animeImagen
	 */
	public byte[] getAnimeImagen() {
		return animeImagen;
	}

	/**
	 * Setter method for animeImagen.
	 *
	 * @param aAnimeImagen the new value for animeImagen
	 */
	public void setAnimeImagen(byte[] aAnimeImagen) {
		animeImagen = aAnimeImagen;
	}

	/**
	 * Access method for animeMimeType.
	 *
	 * @return the current value of animeMimeType
	 */
	public String getAnimeMimeType() {
		return animeMimeType;
	}

	/**
	 * Setter method for animeMimeType.
	 *
	 * @param aAnimeMimeType the new value for animeMimeType
	 */
	public void setAnimeMimeType(String aAnimeMimeType) {
		animeMimeType = aAnimeMimeType;
	}

	/**
	 * Access method for createdAt.
	 *
	 * @return the current value of createdAt
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}

	/**
	 * Setter method for createdAt.
	 *
	 * @param aCreatedAt the new value for createdAt
	 */
	public void setCreatedAt(Timestamp aCreatedAt) {
		createdAt = aCreatedAt;
	}

	/**
	 * Access method for updatedAt.
	 *
	 * @return the current value of updatedAt
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Setter method for updatedAt.
	 *
	 * @param aUpdatedAt the new value for updatedAt
	 */
	public void setUpdatedAt(Timestamp aUpdatedAt) {
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
	 * Access method for anime3.
	 *
	 * @return the current value of anime3
	 */
	public Set<Anime> getAnime3() {
		return anime3;
	}

	/**
	 * Setter method for anime3.
	 *
	 * @param aAnime3 the new value for anime3
	 */
	public void setAnime3(Set<Anime> aAnime3) {
		anime3 = aAnime3;
	}

	/**
	 * Access method for anime2.
	 *
	 * @return the current value of anime2
	 */
	public Anime getAnime2() {
		return anime2;
	}

	/**
	 * Setter method for anime2.
	 *
	 * @param aAnime2 the new value for anime2
	 */
	public void setAnime2(Anime aAnime2) {
		anime2 = aAnime2;
	}

	/**
	 * Access method for anime5.
	 *
	 * @return the current value of anime5
	 */
	public Set<Anime> getAnime5() {
		return anime5;
	}

	/**
	 * Setter method for anime5.
	 *
	 * @param aAnime5 the new value for anime5
	 */
	public void setAnime5(Set<Anime> aAnime5) {
		anime5 = aAnime5;
	}

	/**
	 * Access method for anime4.
	 *
	 * @return the current value of anime4
	 */
	public Anime getAnime4() {
		return anime4;
	}

	/**
	 * Setter method for anime4.
	 *
	 * @param aAnime4 the new value for anime4
	 */
	public void setAnime4(Anime aAnime4) {
		anime4 = aAnime4;
	}

	/**
	 * Compares the key for this instance with another Anime.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class Anime and the key objects
	 *         are equal
	 */
	private boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Anime)) {
			return false;
		}
		Anime that = (Anime) other;
		if (this.getAnimeId() != that.getAnimeId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another Anime.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Anime))
			return false;
		return this.equalKeys(other) && ((Anime) other).equalKeys(this);
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
		i = getAnimeId();
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
		StringBuffer sb = new StringBuffer("[Anime |");
		sb.append(" animeId=").append(getAnimeId());
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
		ret.put("animeId", Integer.valueOf(getAnimeId()));
		return ret;
	}

}
