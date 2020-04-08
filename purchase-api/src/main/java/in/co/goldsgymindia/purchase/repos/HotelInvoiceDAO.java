/**
 * 
 */
package in.co.goldsgymindia.purchase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.goldsgymindia.purchase.model.HotelInvoiceMaster;

/**
 * @author Rocky
 *
 */
@Repository
public interface HotelInvoiceDAO extends JpaRepository<HotelInvoiceMaster, String> {

}
