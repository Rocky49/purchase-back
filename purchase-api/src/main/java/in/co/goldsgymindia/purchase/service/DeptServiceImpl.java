/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.DeptMaster;
import in.co.goldsgymindia.purchase.repos.DeptDAO;

/**
 * @author Rocky
 *
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDAO deptRepo;
	@Override
	public DeptMaster saveAndUpdateDept(DeptMaster dept) {
			return deptRepo.saveAndFlush(dept);
	}

	@Override
	public List<DeptMaster> allDept() {
		return deptRepo.findAll();
	}

}
