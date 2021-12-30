package model;

public class RoyalityModel {

	private String customerId;
	private Double costToCustomer;
	private Boolean isCommission;
	private Double commissionCost;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Double getCostToCustomer() {
		return costToCustomer;
	}
	public void setCostToCustomer(Double costToCustomer) {
		this.costToCustomer = costToCustomer;
	}
	public Boolean getIsCommission() {
		return isCommission;
	}
	public void setIsCommission(Boolean isCommission) {
		this.isCommission = isCommission;
	}
	public Double getCommissionCost() {
		return commissionCost;
	}
	public void setCommissionCost(Double commissionCost) {
		this.commissionCost = commissionCost;
	}
	
}
