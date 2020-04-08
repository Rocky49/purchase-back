/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.goldsgymindia.purchase.model.GstSeriesMaster;
import in.co.goldsgymindia.purchase.repos.GstSeriesDAO;

/**
 * @author Rocky
 *
 */
@Service
public class GstSeriesServiceImpl implements GstSeriesService {

	@Autowired
	private GstSeriesDAO gstSeriesRepo;

	@Override
	public GstSeriesMaster saveAndUpdateGstSeries(GstSeriesMaster gstSeries) {
		return gstSeriesRepo.saveAndFlush(gstSeries);
	}
	
	@Override
	public List<GstSeriesMaster> allGstSeries() {
		return gstSeriesRepo.findAll();
	}
	
}
