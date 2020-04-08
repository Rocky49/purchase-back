/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.PolicyMaster;
import in.co.goldsgymindia.purchase.repos.PolicyDAO;

/**
 * @author Rocky
 *
 */
@Service
public class PolicyServiceImpl implements PolicyService{

	@Autowired
	private PolicyDAO policyRepo;

	@Override
	public PolicyMaster saveAndUpdatePolicy(PolicyMaster policy) {

		PolicyMaster protocolObj = null;
		if(policy != null) {
			protocolObj = policyRepo.saveAndFlush(policy);
		}
		return protocolObj;
	}

	@Override
	public List<PolicyMaster> allPolicy() {
		return policyRepo.findAll();
	}
	
}
