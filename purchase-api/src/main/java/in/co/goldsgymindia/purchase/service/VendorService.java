/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.VendorMaster;

/**
 * @author Rocky
 *
 */
public interface VendorService {
	
	VendorMaster saveAndUpdateVendor(VendorMaster vendor);
	List<VendorMaster> showAllVendor();
}
