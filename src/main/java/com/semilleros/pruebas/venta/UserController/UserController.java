package com.semilleros.pruebas.venta.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.semilleros.pruebas.venta.UserService.UserService;
import com.semilleros.pruebas.venta.UserServiceImpl.UserServiceImp;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:8085", maxAge = 3600)
@RestController
@RequestMapping({"/Login"})
@AllArgsConstructor
public class UserController {
	
	
	UserServiceImp usrService;
	
	@GetMapping(path = "/{usrName}/{usrPass}")
	public void validateUser(@PathVariable("usrName") String usrName, @PathVariable("usrPass") String usrPass) {

		String msg = "Usuario: "+usrName+" Pass: "+usrPass;
		System.out.println("eL MENSAJE ES: "+msg);
//		usrService.validUser(usrName, usrPass);
	}
	
}
