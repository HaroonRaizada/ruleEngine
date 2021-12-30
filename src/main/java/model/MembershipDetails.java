package model;

public class MembershipDetails {

	private String firstName;
	private String lastName;
	private Double cost;
	private String shippingAddress;
	private String recipientEmailId;
	private String messageBody;

	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	public String getRecipientEmailId() {
		return recipientEmailId;
	}
	public void setRecipientEmailId(String recipientEmailId) {
		this.recipientEmailId = recipientEmailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
}
