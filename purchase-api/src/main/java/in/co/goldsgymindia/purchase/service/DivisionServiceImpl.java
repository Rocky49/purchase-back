/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.DivisionMaster;
import in.co.goldsgymindia.purchase.repos.DivisionDAO;

/**
 * @author Rocky
 *
 */
@Service
public class DivisionServiceImpl implements DivisionService {

	@Autowired
	private DivisionDAO divisionRepo;
	@Override
	public DivisionMaster saveAndUpdateDivision(DivisionMaster division) {
		return divisionRepo.saveAndFlush(division);

	}

	@Override
	public List<DivisionMaster> allDivision() {
		return divisionRepo.findAll();
	}

	
}
