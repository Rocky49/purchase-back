/**
 * 
 */
package in.co.goldsgymindia.purchase.model;

import java.util.Calendar;
import java.util.Date;

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
@Table(name = "emp_master")
public @Setter @Getter class EmpMaster {
	
	@Id
	@Column(name = "emp_username")
	private String empUserName;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_num")
	private Long empNum;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "emp_password")
	private String empPassword;
	@Column(name = "emp_email")
	private String empEmail;
	@Column(name = "emp_branch")
	private String empBranch;
	@Column(name = "emp_role")
	private String empRole;
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
