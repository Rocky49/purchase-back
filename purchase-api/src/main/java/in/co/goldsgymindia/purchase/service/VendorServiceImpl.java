/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.VendorMaster;
import in.co.goldsgymindia.purchase.repos.VendorDAO;

/**
 * @author Rocky
 *
 */
@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDAO vendorRepo;
	@Override
	public VendorMaster saveAndUpdateVendor(VendorMaster vendor) {
		VendorMaster vendorObj = null;
		if(vendor != null) {
			vendorObj = vendorRepo.saveAndFlush(vendor);
		}
		return vendorObj;
	}

	@Override
	public List<VendorMaster> showAllVendor() {
		return vendorRepo.findAll();
	}

}
