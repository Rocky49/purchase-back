/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.DeptMaster;

/**
 * @author Rocky
 *
 */

public interface DeptService {

	DeptMaster saveAndUpdateDept(DeptMaster department);
	List<DeptMaster> allDept();
}
