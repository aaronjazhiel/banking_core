package mx.com.anzen.corebanck.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.com.anzen.corebanck.models.accountInterbank;
import mx.com.anzen.corebanck.models.ordersPayment;

public interface GetImplAccountInterbank extends JpaRepository<accountInterbank, Integer>   {
	/************************ Pagos ***********************************/
	@Query(value="SELECT * FROM accountInterbank  a where a.client =?1 "
					         + "and a.idSession =?2 and a.accountType=?3 and a.account=?4 ",nativeQuery = true)
    List<accountInterbank> getAccountInterbank(String client,String idSession,String accountType,String account);
}
