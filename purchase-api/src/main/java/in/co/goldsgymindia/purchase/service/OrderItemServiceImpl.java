/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.OrderItemMaster;
import in.co.goldsgymindia.purchase.repos.OrderItemDAO;

/**
 * @author Rocky
 *
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemDAO orderItemRepo;
	
	@Override
	public OrderItemMaster saveAndUpdateOrderItem(OrderItemMaster orderItem) {
		OrderItemMaster orderItemObj = null;
		if(orderItem != null) {
			orderItemObj = orderItemRepo.saveAndFlush(orderItem);
		}
		return orderItemObj;
	}

	@Override
	public List<OrderItemMaster> allOrderItem() {
		return orderItemRepo.findAll();
	}

}
