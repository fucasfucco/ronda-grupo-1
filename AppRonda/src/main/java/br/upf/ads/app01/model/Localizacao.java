package br.upf.ads.app01.model;

import java.io.Serializable;
import java.util.Base64;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Localizacao implements Serializable {
	@Id
	private Integer id;
	private Date dataHora;
	private Float lan;
	private Float lon;
	
	
	@Override
	public String toString() {
		return "Localizacao [id=" + id + ", dataHora=" + dataHora + ", lan=" + lan + ", lon=" + lon + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataHora, id, lan, lon);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Localizacao other = (Localizacao) obj;
		return Objects.equals(dataHora, other.dataHora) && Objects.equals(id, other.id)
				&& Objects.equals(lan, other.lan) && Objects.equals(lon, other.lon);
	}
	
	public Localizacao() {
		super();
	}
	
	public Localizacao(Integer id, Date dataHora, Float lan, Float lon) {
		super();
		this.id = id;
		this.dataHora = dataHora;
		this.lan = lan;
		this.lon = lon;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public Float getLan() {
		return lan;
	}
	public void setLan(Float lan) {
		this.lan = lan;
	}
	public Float getLon() {
		return lon;
	}
	public void setLon(Float lon) {
		this.lon = lon;
	}
	
	
}