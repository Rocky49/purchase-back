/**
 * 
 */
package in.co.goldsgymindia.purchase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.goldsgymindia.purchase.model.OrderMaster;

/**
 * @author Rocky
 *
 */
@Repository
public interface OrderDAO extends JpaRepository<OrderMaster, String> {

}
