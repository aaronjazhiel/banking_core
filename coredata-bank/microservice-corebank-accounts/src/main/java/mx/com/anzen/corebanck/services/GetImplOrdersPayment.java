package mx.com.anzen.corebanck.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.com.anzen.corebanck.models.ordersPayment;

public interface GetImplOrdersPayment extends JpaRepository<ordersPayment, Integer>   {
	/************************ Pagos ***********************************/
	@Query(value="SELECT * FROM ordersPayment  a where a.client =?1 "
					         + "and a.idSession =?2 and a.accountType=?3 and a.name=?4 ",nativeQuery = true)
    List<ordersPayment> getAccountThird(String client,String idSession,String accountType,String nombre);
}
