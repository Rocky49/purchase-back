/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.OrderwisePolicy;


/**
 * @author Rocky
 *
 */
public interface OrderwisePolicyService {
	OrderwisePolicy saveAndUpdateOrderwisePolicy(OrderwisePolicy orderwisePolicy);
	List<OrderwisePolicy> allOrderwisePolicy();
}
