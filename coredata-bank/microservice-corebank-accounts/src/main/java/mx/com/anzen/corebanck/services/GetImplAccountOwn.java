package mx.com.anzen.corebanck.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import mx.com.anzen.corebanck.models.accountOwn;
import mx.com.anzen.corebanck.models.accountThird;

public interface GetImplAccountOwn extends JpaRepository<accountOwn, Integer>  {
	
	/************************ cuentas propios ***********************************/
	@Modifying
    @Query("update  accountOwn set STATUS='true' where STATUS='FALSE' ")
    void updateAccount();
	
	@Modifying
	@Query("delete from accountOwn where status='true'")
	int deleteAccountOwn();
	
	@Query(value="SELECT * FROM accountOwn a where a.client =?1 "
			            + "and a.idSession =?2 and a.accountType=?3 "
			            + "and a.sucursal=?4 and a.account=?5 ",nativeQuery = true)
	List<accountOwn> getAccountOwn(String client,String idSession,String accountType,String sucursal,String account);

}
