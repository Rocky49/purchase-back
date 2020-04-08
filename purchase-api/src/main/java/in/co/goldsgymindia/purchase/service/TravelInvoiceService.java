/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.TravelInvoiceMaster;

/**
 * @author Rocky
 *
 */
public interface TravelInvoiceService {

	TravelInvoiceMaster saveAndUpdateTravelInvoice(TravelInvoiceMaster travelInvoice);
	List<TravelInvoiceMaster> allTravelInvoice();
	
}
