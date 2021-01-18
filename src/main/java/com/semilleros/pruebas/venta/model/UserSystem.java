package com.semilleros.pruebas.venta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
//@Table(name = "tUsuariosSystem", schema="semillerosBD")
@Table(name = "t_usuarios_system", schema = "semillerosBD")
public class UserSystem {

	@Id
	@Column(name = "ID_USR", nullable = false, unique = true)
	private int id;
	@Column(name = "ID_ROLE_USR", nullable = false, unique = true)
	private int idRole;
	@Column(name = "NOMBRE_USR")
	private String nameUsr;
	@Column(name = "PSW_USR")
	private String pswUsr;

}
