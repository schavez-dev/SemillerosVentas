package com.semilleros.pruebas.venta.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.semilleros.pruebas.venta.UserServiceImpl.UserServiceImp;
import com.semilleros.pruebas.venta.model.UserSystem;

@CrossOrigin(origins = "http://localhost:8085", maxAge = 3600)
@RestController
@RequestMapping({ "/Login" })
public class UserController {

	@Autowired
	UserServiceImp usrService;

	@GetMapping(path = "/{usrName}/{usrPass}")
	public int validateUser(@PathVariable("usrName") String usrName, @PathVariable("usrPass") String usrPass) {

		String msg = "Usuario: " + usrName + " Pass: " + usrPass;
		System.out.println("eL MENSAJE ES: " + msg);
		return usrService.validUser(usrName, usrPass);
	}

	// Lista todo los usuarios con CRUD
	@GetMapping(path = "/todos-los-usr")
	public List<UserSystem> getAllUsers() {
		String msg = "Preparando para listar a todos los usuarios ";
		System.out.println(msg);
		return usrService.getUsers();

	}

	// Lista todos los usuarios realizados por consulta
	@GetMapping(path = "/todos-x-usr")
	public List<UserSystem> getUsersXNombre() {
		String msg = "Todos los usuarios por nombre ";
		System.out.println(msg);
		return usrService.getUsers();
	}

	// para ver si laja la consulta con like
	@GetMapping(path = "/todos-x-like")
	public int getXNombre() {
		String msg = "Probando el LIKE";
		System.out.println(msg);
		return usrService.getUsersXname();
	}

	// para ver si laja la consulta con like y el parametro
	@GetMapping(path = "/todos-x-parametro")
	public int getXNombreParametro() {
		String msg = "Probando consulta con JPA";
		System.out.println(msg);
		return usrService.getNameParametro("patron");
	}
}
