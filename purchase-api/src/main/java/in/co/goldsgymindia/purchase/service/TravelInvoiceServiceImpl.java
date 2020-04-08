/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.TravelInvoiceMaster;
import in.co.goldsgymindia.purchase.repos.TravelInvoiceDAO;

/**
 * @author Rocky
 *
 */
@Service
public class TravelInvoiceServiceImpl implements TravelInvoiceService {

	@Autowired
	private TravelInvoiceDAO travelInvoiceRepo;
	@Override
	public TravelInvoiceMaster saveAndUpdateTravelInvoice(TravelInvoiceMaster travelInvoice) {
	
		TravelInvoiceMaster travelInvoiceObj = null;
		if (travelInvoice != null) {
			travelInvoiceObj = travelInvoiceRepo.saveAndFlush(travelInvoice);
		}
		return travelInvoiceObj;
	}

	@Override
	public List<TravelInvoiceMaster> allTravelInvoice() {
		return travelInvoiceRepo.findAll();
	}

}
