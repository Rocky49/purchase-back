/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.OtherInvoiceMaster;

/**
 * @author Rocky
 *
 */
public interface OtherInvoiceService {
	
	OtherInvoiceMaster saveAndUpdateOtherInvoice(OtherInvoiceMaster otherInvoice);
	List<OtherInvoiceMaster> allOtherInvoice();
}
