/**
 * 
 */
package in.co.goldsgymindia.purchase.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.goldsgymindia.purchase.model.GstSeriesMaster;

/**
 * @author Rocky
 *
 */
@Repository
public interface GstSeriesDAO extends JpaRepository<GstSeriesMaster, String> {

}
