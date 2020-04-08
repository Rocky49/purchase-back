/**
 * 
 */
package in.co.goldsgymindia.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.goldsgymindia.purchase.model.OrderMaster;
import in.co.goldsgymindia.purchase.service.OrderService;

/**
 * @author Rocky
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	private ResponseEntity<?> defaultResp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	@PostMapping("new")
	public ResponseEntity<?> newOrderReq(@RequestBody OrderMaster order) {
		if (order != null) {
			return new ResponseEntity<OrderMaster>(orderService.saveAndUpdateOrder(order), HttpStatus.OK);
		}
		return defaultResp;
	}

	@GetMapping("all")
	public ResponseEntity<?> allOrder() {
		return new ResponseEntity<List<OrderMaster>>(orderService.allOrder(), HttpStatus.OK);
	}

	@PutMapping("update")
	public ResponseEntity<?> updateOrder(@RequestBody OrderMaster order) {
		if (order != null) {
			return new ResponseEntity<OrderMaster>(orderService.saveAndUpdateOrder(order), HttpStatus.OK);
		}
		return defaultResp;
	}

}
