/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.goldsgymindia.purchase.model.CompanyMaster;
import in.co.goldsgymindia.purchase.repos.CompanyDAO;

/**
 * @author Rocky
 *
 */
@Repository
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDAO companyRepo;
	@Override
	public CompanyMaster saveAndUpdateCompany(CompanyMaster company) {
		return companyRepo.saveAndFlush(company);
	}

	@Override
	public List<CompanyMaster> allCompany() {
		return companyRepo.findAll();
	}

}
