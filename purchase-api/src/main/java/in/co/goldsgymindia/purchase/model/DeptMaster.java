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
@Table(name = "dept_master")
public @Getter @Setter class DeptMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dept_id")
	private Long deptId;
	@Column(nullable = false, name = "dept_name")
	private String deptName;
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
