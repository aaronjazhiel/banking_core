package mx.com.anzen.corebanck.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.com.anzen.corebanck.models.accountThird;

public interface GetImplAccountThird extends JpaRepository<accountThird, Integer>  {

	/************************ cuentas terceros ***********************************/
	@Query(value="SELECT * FROM accountThird a where a.client =?1 "
					         + "and a.idSession =?2 and a.accountType=?3 "
					         + "and a.sucursal=?4 and a.account=?5 ",nativeQuery = true)
    List<accountThird> getAccountThird(String client,String idSession,String accountType,String sucursal,String account);
	
}
