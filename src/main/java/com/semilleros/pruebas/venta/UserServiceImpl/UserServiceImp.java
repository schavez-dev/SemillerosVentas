package com.semilleros.pruebas.venta.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semilleros.pruebas.venta.UserRepository.UserCrudRespository;
import com.semilleros.pruebas.venta.UserService.UserService;

import lombok.AllArgsConstructor;
//import com.semilleros.pruebas.venta.model.UserSystem;


@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserCrudRespository usrRepository;
	
	
	
	
	@Override
	public int validUser(String usraName, String usrPassword) {
		System.out.println("Entrando a ServiceImpl");
		System.out.println("usr: "+usraName+"  pass: "+usrPassword);
//	return usrRepository.validaUsr(usraName, usrPassword);
	return 0;
	}

}
