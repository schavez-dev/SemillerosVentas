package com.semilleros.pruebas.venta.UserRepository;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.semilleros.pruebas.venta.model.UserSystem;

@Transactional
@Repository
public interface UserCrudRespository extends CrudRepository<UserSystem, Integer >{
	
//	@Query("SELECT count(*) from semillerosBD.t_usuarios_system where NOMBRE_USR = 'admin' AND PSW_USR = 'admin123'")
//	@Query( value = "SELECT count(*) from semillerosBD.t_usuarios_system where NOMBRE_USR = :usr AND PSW_USR = :pass ", nativeQuery = true)
//	int validaUsr(@PathVariable("usr") String userName,@PathVariable("pass") String userPass);
//	int validaUsr(String userName, String userPass);
	
	//De esta manera si se puedo sacar la informacion 
	@Query(value = "SELECT NOMBRE_USR FROM t_usuarios_system", nativeQuery = true)
	public List<UserSystem> findXnombreUsr();
	
	//Para buscar por nombre
	@Query(value = "SELECT count(NOMBRE_USR) FROM t_usuarios_system WHERE NOMBRE_USR like '%admin%'", nativeQuery = true)
	public int findXUsr();
	
	//Para usar con un PathVariable
//	@Query(value = "SELECT count(*) FROM t_usuarios_system WHERE NOMBRE_USR = ':vAdmin'", nativeQuery = true)
//	public int findByName(@PathVariable("vAdmin") String userName);
	List<UserSystem> findBynameUsr(String nombreParam);
	
	//Volvemos a intentar lo del primer metodo
	List<UserSystem>  findByNameUsrAndPswUsr(String nombreUsr,String pswUsr);
	
}
