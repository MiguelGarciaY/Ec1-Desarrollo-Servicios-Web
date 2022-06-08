package com.idat.ec1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="malla_curricular")
public class MallaCurricular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private Integer año;
	
	@OneToOne
	@JoinColumn(
			name="id_universidad",
			nullable = false,
			unique=true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_universidad) references Universidad(id_universidad)")
			)
	private Universidad universidad;
	
	@OneToMany(mappedBy = "curso")
	private List<Curso> curso=new ArrayList<>();
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Integer getAño() {
		return año;
	}
	public void setAño(Integer año) {
		this.año = año;
	}
	
	
}
