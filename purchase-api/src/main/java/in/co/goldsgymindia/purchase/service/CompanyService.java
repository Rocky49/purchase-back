/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.CompanyMaster;

/**
 * @author Rocky
 *
 */
public interface CompanyService {

	CompanyMaster saveAndUpdateCompany(CompanyMaster company);
	List<CompanyMaster> allCompany();
}
