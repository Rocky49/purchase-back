/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.HotelInvoiceMaster;
import in.co.goldsgymindia.purchase.repos.HotelInvoiceDAO;

/**
 * @author Rocky
 *
 */
@Service
public class HotelInvoiceServiceImpl implements HotelInvoiceService {

	@Autowired
	private HotelInvoiceDAO hotelInvoiceRepo;
	@Override
	public HotelInvoiceMaster saveAndUpdateHotelInvoice(HotelInvoiceMaster hotelInvoice) {
		return hotelInvoiceRepo.saveAndFlush(hotelInvoice);
	}

	@Override
	public List<HotelInvoiceMaster> allHotelInvoice() {
		return hotelInvoiceRepo.findAll();
	}

}
