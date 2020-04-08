/**
 * 
 */
package in.co.goldsgymindia.purchase.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table (name = "travel_invoice_master")
public @Getter @Setter class TravelInvoiceMaster {
	@Id
	@Column(nullable = false, name = "travel_invoice_id")
	private String travelInvoiceId;
	@OneToOne
	@JoinColumn(nullable = false, name = "emp_fk")
	private EmpMaster empRef;
	@OneToOne
	@JoinColumn(nullable = false, name = "company_fk")
	private CompanyMaster companyRef;
	@ManyToOne
	@JoinColumn(nullable = false, name = "division_fk")
	private DivisionMaster divisionRef;
	@Column(nullable = false, name = "traveler_name")
	private String travelerName;
	@OneToOne
	@JoinColumn(nullable = false, name = "branch_fk")
	private ClubMaster branchRef;
	@OneToOne
	@JoinColumn(nullable = false, name = "dept_fk")
	private DeptMaster deptRef;
	@Column(nullable = false, name = "sector")
	private String sector;
	@Column(nullable = false, name = "mode_of_traveling")
	private String modeOfTraveling;
	@Column(nullable = false, name = "booking_date")
	private Date bookingDate;
	@Column(nullable = false, name = "travel_period_from")
	private Date travelPeriodFrom;
	@Column(nullable = false, name = "travel_period_to")
	private Date travelPeriodTo;
	@Column(nullable = false, name = "location")
	private String location;
	@Column(nullable = false, name = "approval")
	private String approval;
	@OneToOne
	@JoinColumn(nullable = false, name = "vendor_fk")
	private VendorMaster vendorRef;
	@Column(nullable = false, name = "invoice_id" )
	private String invoiceId;
	@Column(nullable = false, name = "invoice_date")
	private Date invoiceDate;
	@Column(nullable = false, name = "invoice_amt")
	private Double invoiceAmt;
	@Column(nullable = false, name = "tax_amt")
	private Double taxAmt;
	@Column(nullable = false, name = "total_amt")
	private Double totalAmt;
	@Column(nullable = false, name = "credit_note_number")
	private String creditNoteNumber;
	@Column(nullable = false, name = "credit_note_amt")
	private Double creditNoteAmt;
	@Column(nullable = false, name = "total_payable")
	private Double totalPayable;
	@Column(nullable = false, name = "cheque_number")
	private Long chequeNumber;
	@Column(nullable = false, name = "cheque_date")
	private Date chequeDate;
	@Column(nullable = false, name = "cheque_amt")
	private Double chequeAmt;
	@Column(nullable = false, name = "received_on")
	private Date receivedOn;
	@Column(nullable = false, name = "remark")
	private String remark;
	@Column(nullable = false, name = "cheque_dispatched_date")
	private Date chequeDispatchedDate;
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
}
