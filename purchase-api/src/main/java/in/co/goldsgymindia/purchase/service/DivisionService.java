/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.DivisionMaster;

/**
 * @author Rocky
 *
 */
public interface DivisionService {

	DivisionMaster saveAndUpdateDivision(DivisionMaster division);
	List<DivisionMaster> allDivision();
}
