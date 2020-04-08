/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.OrderMaster;
import in.co.goldsgymindia.purchase.repos.OrderDAO;

/**
 * @author Rocky
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderRepo;
	@Override
	public OrderMaster saveAndUpdateOrder(OrderMaster order) {

		OrderMaster orderObj = null;
		if(order != null) {
			orderObj = orderRepo.saveAndFlush(order);
		}
		return orderObj;
	}

	@Override
	public List<OrderMaster> allOrder() {
		return orderRepo.findAll();
	}
	
}
