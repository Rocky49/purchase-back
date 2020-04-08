/**
 * 
 */
package in.co.goldsgymindia.purchase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.goldsgymindia.purchase.model.OtherInvoiceMaster;

/**
 * @author Rocky
 *
 */
@Repository
public interface OtherInvoiceDAO extends JpaRepository<OtherInvoiceMaster, String> {

}
