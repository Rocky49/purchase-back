/**
 * 
 */
package in.co.goldsgymindia.purchase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.goldsgymindia.purchase.model.CompanyMaster;

/**
 * @author Rocky
 *
 */
@Repository
public interface CompanyDAO extends JpaRepository<CompanyMaster, Long> {

}
