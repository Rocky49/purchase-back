/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.ClubMaster;
import in.co.goldsgymindia.purchase.repos.ClubDAO;

/**
 * @author Rocky
 *
 */
@Service
public class ClubServiceImpl implements ClubService {

	@Autowired
	private ClubDAO clubRepo;

	@Override
	public List<ClubMaster> allClub() {
		return clubRepo.findAll();
	}

	@Override
	public ClubMaster saveAndUpdateClub(ClubMaster club) {
		return clubRepo.saveAndFlush(club);
	}
}
