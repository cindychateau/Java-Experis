package com.experis.cynthia.modelos;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // AI
	private long id;
	
	@NotEmpty
	@Size(min=2, max=100)
	private String nombre;
	
	@NotEmpty
	@Size(min=2, max=100)
	private String apellido;
	
	@NotEmpty
	@Size(min=2, max=200)
	private String email;
	
	@Column(updatable=false) //Este atributo solo se ingresa una vez, y NUNCA se actualiza
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@JsonManagedReference(value="direcciones-json") //Objeto Usuario SI va a mostrar dirección
	@OneToOne(mappedBy="usuario", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Direccion direccion;
	
	@JsonBackReference(value="salones-json") //No mandamos el salon
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="salon_id") //Llave foránea
	private Salon salon;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="usuarios_tienen_hobbies",
			joinColumns = @JoinColumn(name="usuario_id"), //la columna que une con ESTA clase
			inverseJoinColumns = @JoinColumn(name="hobby_id") //columna que se une a mi contraparte
			)
	private List<Hobby> hobbies;
	
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Usuario(long id, String nombre, String apellido, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	@PrePersist //Antes de hacer un nuevo registro
	protected void onCreate() {
		this.createdAt = new Date(); //DEFAULT CURRENT_TIMESTAMP
	}
	
	@PreUpdate //Antes de la actualización
	protected void onUpdate() {
		this.updatedAt = new Date(); // DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

	public List<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}
	
	
	
}
