/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.EmpMaster;

/**
 * @author Rocky
 *
 */
public interface EmpService {
	EmpMaster saveAndUpdateEmp(EmpMaster employee);
	List<EmpMaster> allEmp();
	EmpMaster validateEmp(String username, String password);
}
