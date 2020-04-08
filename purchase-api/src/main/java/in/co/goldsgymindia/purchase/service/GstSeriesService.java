/**
 * 
 */
package in.co.goldsgymindia.purchase.service;

import java.util.List;

import in.co.goldsgymindia.purchase.model.GstSeriesMaster;

/**
 * @author Rocky
 *
 */
public interface GstSeriesService {

	GstSeriesMaster saveAndUpdateGstSeries(GstSeriesMaster gstSeries);
	List<GstSeriesMaster> allGstSeries();
}
