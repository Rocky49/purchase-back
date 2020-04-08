/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.EmpMaster;
import in.co.goldsgymindia.purchase.repos.EmpDAO;

/**
 * @author Rocky
 *
 */
@Service
public class EmpServiceImpl implements EmpService {

	
	@Autowired
	private EmpDAO empRepo;
	@Override
	public EmpMaster saveAndUpdateEmp(EmpMaster emp) {
		return empRepo.saveAndFlush(emp);
	}

	@Override
	public List<EmpMaster> allEmp() {
		return empRepo.findAll();
	}

	@Override
	public EmpMaster validateEmp(String username, String password) {
		try {
			return empRepo.findByEmpUserNameAndEmpPassword(username, password);
		}
		catch(Exception e) {
			System.out.println("Error:" + e.getMessage());
			return null;
		}
	}

}
