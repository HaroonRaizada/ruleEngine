package rule;

import java.util.logging.Logger;

import model.MembershipDetails;
import model.ShippingDetails;

public class MembershipRule<T> extends AbstractEmailNotification<T> {
	Logger logger=Logger.getLogger("MembershipRule");

	@Override
	public ShippingDetails executePreRule(T inputIntance) {
		MembershipDetails membershipDetails=(MembershipDetails)inputIntance;
		ShippingDetails details=new ShippingDetails();
		details.setCost(membershipDetails.getCost());
		return details;
	}

	@Override
	public T executeRule(T inputIntance) {
		ShippingDetails details=executePreRule(inputIntance);
		//generate email for Membership
		generateEmail(details);
		logger.info("Activate that membership");
		return inputIntance;
		
		
	}

	

	
	
	
	


}
