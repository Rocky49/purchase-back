/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.OrderItemMaster;

/**
 * @author Rocky
 *
 */
public interface OrderItemService {
	
	OrderItemMaster saveAndUpdateOrderItem(OrderItemMaster orderItem);
	List<OrderItemMaster> allOrderItem();

}
