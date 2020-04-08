/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;


import in.co.goldsgymindia.purchase.model.PolicyMaster;

/**
 * @author Rocky
 *
 */
public interface PolicyService {
	PolicyMaster saveAndUpdatePolicy(PolicyMaster protocol);
	List<PolicyMaster> allPolicy();
}
