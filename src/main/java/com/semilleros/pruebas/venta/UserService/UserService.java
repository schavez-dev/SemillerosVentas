package com.semilleros.pruebas.venta.UserService;

import java.util.List;
import javax.transaction.Transactional;
import com.semilleros.pruebas.venta.model.UserSystem;

@Transactional
public interface UserService {
	//Validar el usr y psw
	int validUser(String usraName ,String usrPassword);
	
	//Listar a todos los usuarios
	List<UserSystem> getUsers();
	
	//Listar por nombre de usuario
	List<UserSystem> getUsersXnombre();
	
	//Listar por nombre de usuario
	int getUsersXname();
	
	//Listar nombre por parametro
	int getNameParametro(String parametrocount);
}
