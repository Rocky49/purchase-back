/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.OrderTypeMaster;
import in.co.goldsgymindia.purchase.repos.OrderTypeDAO;

/**
 * @author Rocky
 *
 */
@Service
public class OrderTypeServiceImpl implements OrderTypeService {

	@Autowired
	private OrderTypeDAO orderTypeRepo;
	@Override
	public OrderTypeMaster saveAndUpdateOrderType(OrderTypeMaster orderType) {

		OrderTypeMaster orderTypeObj = null;
		if(orderType != null) {
			orderTypeObj = orderTypeRepo.saveAndFlush(orderType);
		}
		return orderTypeObj;
	}

	@Override
	public List<OrderTypeMaster> allOrderType() {
		return orderTypeRepo.findAll();
	}

}
