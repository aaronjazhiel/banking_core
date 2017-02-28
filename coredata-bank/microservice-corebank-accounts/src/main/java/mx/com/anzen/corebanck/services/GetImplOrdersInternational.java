package mx.com.anzen.corebanck.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.com.anzen.corebanck.models.ordersInternational;

public interface GetImplOrdersInternational extends JpaRepository<ordersInternational, Integer>  {

	/************************ cuentas terceros ***********************************/
	@Query(value="SELECT * FROM ordersInternational a where a.client =?1 "
					         + "and a.idSession =?2 and a.accountType=?3 "
					         + "and a.swift=?4 and a.beneficiary=?5 ",nativeQuery = true)
    List<ordersInternational> getOrdersInternational(String client,String idSession,String accountType,String swift,String beneficiary);
	
}
