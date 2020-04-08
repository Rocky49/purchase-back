/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.OrderTypeMaster;


/**
 * @author Rocky
 *
 */
public interface OrderTypeService {
	OrderTypeMaster saveAndUpdateOrderType(OrderTypeMaster orderType);
	List<OrderTypeMaster> allOrderType();
}
