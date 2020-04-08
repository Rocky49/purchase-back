/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.HotelInvoiceMaster;

/**
 * @author Rocky
 *
 */
public interface HotelInvoiceService {
	
	HotelInvoiceMaster saveAndUpdateHotelInvoice(HotelInvoiceMaster hotelInvoice);
	List<HotelInvoiceMaster> allHotelInvoice();
}
