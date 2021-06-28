package br.upf.ads.app01.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Ocorrencia
 *
 */
@Entity
public class Ocorrencia implements Serializable {

	   
	@Id
	private Long id;
	private Date dataHora;
	private String titulo;
	private String descricao;
	private Float lat;
	private Float lon;
	private String foto;
	public Ocorrencia(Long id, Date dataHora, String titulo, String descricao, Float lat, Float lon, String foto) {
		super();
		this.id = id;
		this.dataHora = dataHora;
		this.titulo = titulo;
		this.descricao = descricao;
		this.lat = lat;
		this.lon = lon;
		this.foto = foto;
	}
 
	
	private static final long serialVersionUID = 1L;

	public Ocorrencia() {
		super();
	}
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getLat() {
		return lat;
	}

	public void setLat(Float lat) {
		this.lat = lat;
	}

	public Float getLon() {
		return lon;
	}

	public void setLon(Float lon) {
		this.lon = lon;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataHora, descricao, foto, id, lat, lon, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ocorrencia other = (Ocorrencia) obj;
		return Objects.equals(dataHora, other.dataHora) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(foto, other.foto) && Objects.equals(id, other.id) && Objects.equals(lat, other.lat)
				&& Objects.equals(lon, other.lon) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Ocorrencia [id=" + id + ", dataHora=" + dataHora + ", titulo=" + titulo + ", descricao=" + descricao
				+ ", lat=" + lat + ", lon=" + lon + ", foto=" + foto + "]";
	}  
	
}