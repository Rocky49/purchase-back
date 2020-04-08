/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.OrderMaster;

/**
 * @author Rocky
 *
 */
public interface OrderService {
	
	OrderMaster saveAndUpdateOrder(OrderMaster order);
	List<OrderMaster> allOrder();
}
