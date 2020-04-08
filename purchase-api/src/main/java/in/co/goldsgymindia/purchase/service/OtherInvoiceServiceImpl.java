/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.OtherInvoiceMaster;
import in.co.goldsgymindia.purchase.repos.OtherInvoiceDAO;

/**
 * @author Rocky
 *
 */
@Service
public class OtherInvoiceServiceImpl implements OtherInvoiceService {

	@Autowired
	private OtherInvoiceDAO otherInvoiceRepo;
	@Override
	public List<OtherInvoiceMaster> allOtherInvoice() {
		return otherInvoiceRepo.findAll();
	}

	@Override
	public OtherInvoiceMaster saveAndUpdateOtherInvoice(OtherInvoiceMaster otherInvoice) {

		OtherInvoiceMaster otherInvocieObj = null;
		if(otherInvoice != null) {
			otherInvocieObj = otherInvoiceRepo.saveAndFlush(otherInvoice);
		}
		return otherInvocieObj;
	}

}
