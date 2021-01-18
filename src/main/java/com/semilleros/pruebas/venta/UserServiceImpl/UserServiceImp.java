package com.semilleros.pruebas.venta.UserServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.semilleros.pruebas.venta.UserRepository.UserCrudRespository;
import com.semilleros.pruebas.venta.UserService.UserService;
import com.semilleros.pruebas.venta.model.UserSystem;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserServiceImp implements UserService {

	private UserCrudRespository usrRepository;

	@Override
	public int validUser(String usraName, String usrPassword) {
		System.out.println("Entrando a ServiceImpl");
		System.out.println("usr: " + usraName + "  pass: " + usrPassword);
		int resultado = 0;
		List<UserSystem> temp = usrRepository.findByNameUsrAndPswUsr(usraName, usrPassword);

		System.out.println("t:: " + temp);
		if (temp.isEmpty()) {
			// El usuario NO existe
			resultado = 99;
		} else {
			// El usuario SI existe
			resultado = 100;
		}
		System.out.println(resultado);
		return resultado;
	}

	@Override
	public List<UserSystem> getUsers() {
		System.out.println("Entrando a la capa de ImplService");
		List<UserSystem> usuarios = (List<UserSystem>) usrRepository.findAll();
		System.out.println("Los usuarios son \n" + usuarios);
//		return (List<UserSystem>) usrRepository.findAll();
		return usuarios;
	}

	@Override
	public List<UserSystem> getUsersXnombre() {
		// todo esbozo de método generado automáticamente
		List<UserSystem> usrs = usrRepository.findXnombreUsr();
		System.out.println(usrs);
		return usrs;
	}

	@Override
	public int getUsersXname() {
		System.out.println("Antes de entrar al repo");
		int usrs = usrRepository.findXUsr();
		System.out.println(usrs);
		return usrs;
	}

	@Override
	public int getNameParametro(String parametrocount) {
		System.out.println("Antes de entrar al repo con el parametro");
		System.out.println("El parametro es --> " + parametrocount);
		List<UserSystem> t = usrRepository.findBynameUsr(parametrocount);
		System.out.println("t: " + t);
		int result = 0;
		if (t != null && !t.isEmpty()) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}

}
