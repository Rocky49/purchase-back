/**
 * 
 */
package in.co.goldsgymindia.purchase.model;

import java.sql.Date;

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
@Table(name = "hotel_invoice_master")
public @Getter @Setter class HotelInvoiceMaster {
	
	@Id
	@Column(nullable = false, name = "hotel_invoice_id")
	private String hotelInvoiceId;
	@OneToOne
	@JoinColumn(nullable = false, name = "emp_fk")
	private EmpMaster empRef;
	@OneToOne
	@JoinColumn(nullable = false, name = "company_fk")
	private CompanyMaster companyRef;
	@OneToOne
	@JoinColumn(nullable = false, name = "division_fk")
	private DivisionMaster divisionRef;
	@Column(nullable = false, name = "traveler_name")
	private String travelerName;
	@OneToOne
	@JoinColumn(nullable = false, name = "branch_fk")
	private ClubMaster branchRef;
	@ManyToOne
	@JoinColumn(nullable = false, name = "dept_fk")
	private DeptMaster deptRef;
	@OneToOne
	@JoinColumn(nullable = false, name = "vendor_fk")
	private VendorMaster vendorRef;
	@Column(nullable = false, name = "booking_date")
	private Date bookingDate;
	@Column(nullable = false, name = "check_in_date")
	private Date checkInDate;
	@Column(nullable = false, name = "check_out_date")
	private Date checkOutDate;
	@Column(nullable = false, name = "location")
	private String location;
	@Column(nullable = false, name = "approval")
	private String approval;
	@Column(nullable = false, name = "invoiceId")
	private String invoiceId;
	@Column(nullable = false, name = "invoice_date")
	private Date invoiceDate;
	@Column(nullable = false, name = "invoice_amt")
	private Long invoiceAmt;
	@Column(nullable = false, name = "tax_amt")
	private Long taxAmt;
	@Column(nullable = false, name = "total_amt")
	private Long totalAmt;
	@Column(nullable = false, name = "credit_note_id")
	private String creditNoteId;
	@Column(nullable = false, name = "credit_note_amt")
	private Long creditNoteAmt;
	@Column(nullable = false, name = "total_payable")
	private Long totalPayable;
	@Column(nullable = false, name = "cheque_num")
	private Long chequeNum;
	@Column(nullable = false, name = "cheque_date")
	private Date chequeDate;
	@Column(nullable = false, name = "cheque_amt")
	private Long chequeAmt;
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
