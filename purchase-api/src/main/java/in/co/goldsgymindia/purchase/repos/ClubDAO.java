/**
 * 
 */
package in.co.goldsgymindia.purchase.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.goldsgymindia.purchase.model.ClubMaster;

/**
 * @author Rocky
 *
 */
public interface ClubDAO extends JpaRepository<ClubMaster, String>  {

}
