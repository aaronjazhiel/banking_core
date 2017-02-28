package mx.com.anzen.corebanck.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.com.anzen.corebanck.models.establishmentQuery;

public interface GetImplEstablishmentQuery extends JpaRepository<establishmentQuery, Integer>  {

	/************************ cuentas terceros ***********************************/
	@Query(value="SELECT * FROM establishmentQuery a where a.client =?1 "
					         + "and a.idSession =?2 and a.accountType=?3 "
					         + "and a.establishment=?4  ",nativeQuery = true)
    List<establishmentQuery> getEstablishmentQuery(String client,String idSession,
    		                                 String accountType,String establishment);
	
}