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
@Table(name = "order_item_details_master")
public @Getter @Setter class OrderItemMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_item_num")
	private Long orderItemNum;
	@ManyToOne
	@JoinColumn(name = "order_fk")
	private OrderMaster orderRef;
	@Column(name = "year")
	private String year;
	@OneToOne
	@JoinColumn(name = "gst_series_fk")
	private GstSeriesMaster gstSeriesRef;
	@Column(name = "invoice_num")
	private Long invoiceNum;
	@Column(name = "description")
	private String description;
	@Column(name = "quantity")
	private Long quantity;
	@Column(name = "units")
	private String units;
	@Column(name = "unit_rate")
	private Double unitRate;
	@Column(name = "vtax")
	private Double vtax;
	@Column(name = "stax")
	private Double stax;
	@Column(name = "gst")
	private Double gst;
	@Column(name = "total_amt")
	private Double totalAmount;
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
