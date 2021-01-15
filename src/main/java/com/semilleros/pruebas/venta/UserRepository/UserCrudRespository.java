package com.semilleros.pruebas.venta.UserRepository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import com.semilleros.pruebas.venta.model.UserSystem;


@Repository
public interface UserCrudRespository extends CrudRepository<UserSystem, Integer >{
	
//	@Query("SELECT count(*) from semillerosBD.tUsuariosSystem where NOMBRE_USR = 'admin'AND PSW_USR = 'admin123'")
//	int validaUsr(@PathVariable("usr") String userName,@PathVariable("pass") String userPass);
}
