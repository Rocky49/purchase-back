/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.OrderwisePolicy;
import in.co.goldsgymindia.purchase.repos.OrderwisePolicyDAO;

/**
 * @author Rocky
 *
 */
@Service
public class OrderwisePolicyServiceImpl implements OrderwisePolicyService {

	@Autowired
	private OrderwisePolicyDAO orderwisePolicyRepo;

	@Override
	public OrderwisePolicy saveAndUpdateOrderwisePolicy(OrderwisePolicy orderwisePolicy) {
		OrderwisePolicy orderwisePolicyObj = null;
		if (orderwisePolicy != null) {
			orderwisePolicyObj = orderwisePolicyRepo.saveAndFlush(orderwisePolicy);
		}
		return orderwisePolicyObj;
	}

	@Override
	public List<OrderwisePolicy> allOrderwisePolicy() {
		return orderwisePolicyRepo.findAll();
	}

}
