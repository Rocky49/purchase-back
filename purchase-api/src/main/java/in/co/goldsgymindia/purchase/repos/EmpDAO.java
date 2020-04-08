/**
 * 
 */
package in.co.goldsgymindia.purchase.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.goldsgymindia.purchase.model.EmpMaster;

/**
 * @author Rocky
 *
 */
@Repository
public interface EmpDAO extends JpaRepository<EmpMaster, String> {
	
	EmpMaster findByEmpUserNameAndEmpPassword(String username, String password);
}
