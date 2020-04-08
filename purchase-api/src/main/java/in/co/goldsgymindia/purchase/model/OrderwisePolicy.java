/**
 * 
 */
package in.co.goldsgymindia.purchase.model;

import java.sql.Date;

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
@Table(name = "orderwise_policy")
public @Getter @Setter class OrderwisePolicy {
	
	@Id
	@Column(nullable = false, name = "orderwise_policy_num")
	private Long orderwisePolicyNum;
	@OneToOne
	@JoinColumn(nullable = false, name = "order_fk" )
	private OrderMaster orderRef;
	@Column(name = "policy_1")
	private String policy1;
	@Column(name = "policy_2")
	private String policy2;
	@Column(name = "policy_3")
	private String policy3;
	@Column(name = "policy_4")
	private String policy4;
	@Column(name = "policy_5")
	private String policy5;
	@Column(name = "policy_6")
	private String policy6;
	@Column(name = "policy_7")
	private String policy7;
	@Column(name = "policy_8")
	private String policy8;
	@Column(name = "policy_9")
	private String policy9;
	@Column(name = "policy_10")
	private String policy10;
	@Column(name = "policy_11")
	private String policy11;
	@Column(name = "policy_12")
	private String policy12;
	@Column(name = "policy_13")
	private String policy13;
	@Column(name = "policy_14")
	private String policy14;
	@Column(name = "policy_15")
	private String policy15;
	@Column(name = "policy_16")
	private String policy16;
	@Column(name = "policy_17")
	private String policy18;
	@Column(name = "policy_19")
	private String policy19;
	@Column(name = "policy_20")
	private String policy20;
	@Column(name = "policy_21")
	private String policy21;
	@Column(name = "policy_22")
	private String policy22;
	@Column(name = "policy_23")
	private String policy23;
	@Column(name = "policy_24")
	private String policy24;
	@Column(name = "policy_25")
	private String policy25;
	@Column(name = "policy_26")
	private String policy26;
	@Column(name = "policy_27")
	private String policy27;
	@Column(name = "policy_28")
	private String policy28;
	@Column(name = "policy_29")
	private String policy29;
	@Column(name = "policy_30")
	private String policy30;
	@Column(name = "policy_31")
	private String policy31;
	@Column(name = "policy_32")
	private String policy32;
	@Column(name = "policy_33")
	private String policy33;
	@Column(name = "policy_34")
	private String policy34;
	@Column(name = "policy_35")
	private String policy35;
	@Column(name = "policy_36")
	private String policy36;
	@Column(name = "policy_37")
	private String policy37;
	@Column(name = "policy_38")
	private String policy38;
	@Column(name = "policy_39")
	private String policy39;
	@Column(name = "policy_40")
	private String policy40;
	@Column(name = "policy_41")
	private String policy41;
	@Column(name = "policy_42")
	private String policy42;
	@Column(name = "policy_43")
	private String policy43;
	@Column(name = "policy_44")
	private String policy44;
	@Column(name = "policy_45")
	private String policy45;
	@Column(name = "policy_46")
	private String policy46;
	@Column(name = "policy_47")
	private String policy47;
	@Column(name = "policy_48")
	private String policy48;
	@Column(name = "policy_49")
	private String policy49;
	@Column(name = "policy_50")
	private String policy50;
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
