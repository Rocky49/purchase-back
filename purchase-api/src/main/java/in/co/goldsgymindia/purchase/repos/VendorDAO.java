/**
 * 
 */
package in.co.goldsgymindia.purchase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.goldsgymindia.purchase.model.VendorMaster;

/**
 * @author Rocky
 *
 */
@Repository
public interface VendorDAO extends JpaRepository<VendorMaster, Long> {

}
