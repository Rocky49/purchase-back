/**
 * 
 */
package in.co.goldsgymindia.purchase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.goldsgymindia.purchase.model.PolicyMaster;

/**
 * @author Rocky
 *
 */
@Repository
public interface PolicyDAO extends JpaRepository<PolicyMaster, Long> {
	
}
