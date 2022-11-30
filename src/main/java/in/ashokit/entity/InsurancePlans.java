package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="INSURANCE_PLANS")
public class InsurancePlans 
{
	@Id
	@GeneratedValue
	private Integer planId;
	
	private String planName;
	private String planStatus;
	
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDate CreatedDate;
	
	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDate UpdatedDate;

	public InsurancePlans(String planName, String planStatus) 
	{
		this.planName = planName;
		this.planStatus = planStatus;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public LocalDate getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		CreatedDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		UpdatedDate = updatedDate;
	}

	public InsurancePlans() 
	{
		
	}
	
	
	
	

}
