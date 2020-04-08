/**
 * 
 */
package in.co.goldsgymindia.purchase.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "vendor_master")
public @Getter @Setter class VendorMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, name = "vendor_id")
	private Long vendorId;
	@Column(nullable = false, name = "company_name")
	private String companyName;
	@Column(nullable = false, name = "company_address")
	private String companyAddress;
	@Column(nullable = false, name = "city")
	private String city;
	@Column(nullable = false, name = "location")
	private String location;
	@Column(nullable = false, name = "category")
	private String category;
	@Column(nullable = false, name = "contact_person")
	private String contactPerson;
	@Column(nullable = false, name = "designation")
	private String designation;
	@Column(nullable = false, name = "contact_num")
	private Long contactNum;
	@Column(nullable = false, name = "official_email_id")
	private String officialEmailId;
	@Column(nullable = false, name = "website_address")
	private String websiteAddress;
	@Column(nullable = false, name = "pan_num")
	private String panNum;
	@Column(nullable = false, name = "gst_num")
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
}
