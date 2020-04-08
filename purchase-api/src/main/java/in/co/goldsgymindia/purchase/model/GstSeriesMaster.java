/**
 * 
 */
package in.co.goldsgymindia.purchase.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Rocky
 *
 */
@Component
@Entity
@Table(name = "gst_series_master")
public @Getter @Setter class GstSeriesMaster {
	
	@Id
	@Column(name = "gst_series")
	private String gstSeries;
	@Column(name = "business_type")
	private String businessType;
	@Column(name = "state_name")
	private String stateName;
	@Column(name = "state_name_code")
	private String stateNameCode;
	@Column(name = "start_year")
	private Integer startYear;
	@Column(name = "end_year")
	private Integer endYear; 
	@Column(name = "gst_no")
	private String gstNum;
	@Column(updatable = false, nullable = false, name = "created_date")
	private Date createdDate;
	@Column(updatable = false, nullable = false, name = "created_by")
	private String createdBy;
	@Column(updatable = true, nullable = true, name = "modified_date")
	private Date modifiedDate;
	@Column(updatable = true, nullable = true, name = "modified_by")
	private String modifiedBy;
	@Column(name = "is_deleted", nullable = false)
	private Boolean isDeleted;

	public void setIsDeleted(Boolean isDeleted) {
		if (isDeleted == null)
			// default will be false
			this.isDeleted = false;
		else
			this.isDeleted = isDeleted;
	}
	
	public void setCreatedDate(Date createdDate) {
		if(createdDate == null) {
			//on each new creation this will insert value in database.
			this.createdDate = Calendar.getInstance().getTime();
		}
	}

}
