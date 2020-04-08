/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.stereotype.Component;

import in.co.goldsgymindia.purchase.model.ClubMaster;

/**
 * @author Rocky
 *
 */
@Component
public interface ClubService {
	ClubMaster saveAndUpdateClub(ClubMaster club);
	List<ClubMaster> allClub();
}
