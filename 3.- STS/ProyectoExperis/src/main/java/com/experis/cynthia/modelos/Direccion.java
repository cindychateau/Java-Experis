package com.experis.cynthia.modelos;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="direcciones")
public class Direccion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // AI
	private Long id;
	
	@Size(min=2, max=100)
	private String calle;
	
	@Size(min=2, max=5)
	private String numero;
	
	@Size(min=2, max=100)
	private String ciudad;
	
	@Min(10000)
	@Max(99999) // 100000
	private int cp;
	
	@Size(min=2,max=100)
	private String pais;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@OneToOne(fetch=FetchType.LAZY) //tipo de relación
	@JoinColumn(name="usuario_id") //llave foránea
	private Usuario usuario; //Objeto usuario al cual la dirección se relaciona

	public Direccion() {
	}
	
	

	public Direccion(String calle, String numero, String ciudad, int cp,String pais) {
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.cp = cp;
		this.pais = pais;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist //Antes de crear el registro
	protected void onCreate() {
		this.createdAt = new Date(); 
	}
	
	@PreUpdate //Antes de actualizar
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
