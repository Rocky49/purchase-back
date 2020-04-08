/**
 * 
 */
package in.co.goldsgymindia.purchase.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "order_master")
public @Getter @Setter class OrderMaster {

	@Id
	@Column(nullable = false, name = "order_id")
	private String orderId;
	@OneToOne
	@JoinColumn(nullable = false, name = "order_type_fk")
	private OrderTypeMaster orderTypeRef;
	@OneToOne
	@JoinColumn(nullable = false, name = "division_fk")
	private DivisionMaster divisionRef;
	@OneToOne
	@JoinColumn(nullable = false, name = "gst_series_fk")
	private GstSeriesMaster gstSeriesRef;
	@Column(nullable = false, name = "requester_name")
	private String requesterName;
	@OneToOne
	@JoinColumn(nullable = false, name = "branch_fk")
	private ClubMaster branchRef;
	@OneToOne
	@JoinColumn(nullable = false, name = "dept_fk")
	private DeptMaster deptRef;
	@Column(nullable = false, name = "approval")
	private String approval;
	@OneToOne
	@JoinColumn(nullable = false, name = "vendor_fk")
	private VendorMaster vendorRef;
	@Column(nullable = false, name = "subject")
	private String subject;
	@Column(nullable = false, name = "po_body")
	private String poBody;
	@Column(nullable = false, name = "status")
	private String status;
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
			this.isDeleted = false;
		else
			this.isDeleted = isDeleted;
	}

}
