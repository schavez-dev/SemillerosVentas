package com.semilleros.pruebas.venta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tUsuariosSystem")
@Data
public class UserSystem {

	@Id
	@Column
	private int id;
	@Column
	private int idRole;
	@Column
	private String nameUsr;
	@Column
	private String pswUsr;	
	
}
