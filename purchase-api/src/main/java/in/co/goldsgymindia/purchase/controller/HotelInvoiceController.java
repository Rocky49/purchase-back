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

import in.co.goldsgymindia.purchase.model.HotelInvoiceMaster;
import in.co.goldsgymindia.purchase.service.HotelInvoiceService;

/**
 * @author Rocky
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("hotel")
public class HotelInvoiceController {

	@Autowired
	private HotelInvoiceService hotelInvoiceService;
	
	private ResponseEntity<?> defaultResp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	
	@PostMapping("new-invoice")
	public ResponseEntity<?> createInvoice(@RequestBody HotelInvoiceMaster hotelInvoice) {
		if(hotelInvoice != null) {
			return new ResponseEntity<HotelInvoiceMaster>(hotelInvoiceService.saveAndUpdateHotelInvoice(hotelInvoice), HttpStatus.OK);
		}
		return defaultResp;
	}
	
	@GetMapping("all-invoice")
	public ResponseEntity<?> allInvoice() {
		return new ResponseEntity<List<HotelInvoiceMaster>>(hotelInvoiceService.allHotelInvoice(), HttpStatus.OK);
	}
	
	@PutMapping("update-invoice")
	public ResponseEntity<?> updateInvoice(@RequestBody HotelInvoiceMaster hotelInvoice) {
		if(hotelInvoice != null) {
			return new ResponseEntity<HotelInvoiceMaster>(hotelInvoiceService.saveAndUpdateHotelInvoice(hotelInvoice), HttpStatus.OK);
		}
		return defaultResp;
	}
}
