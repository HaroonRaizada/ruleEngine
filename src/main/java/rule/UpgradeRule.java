package rule;

import java.util.logging.Logger;

import model.MembershipDetails;
import model.ShippingDetails;

public class UpgradeRule<T > extends AbstractEmailNotification<T > {
	Logger logger=Logger.getLogger("MembershipRule");

	@Override
	public ShippingDetails executePreRule(T inputIntance) {
		MembershipDetails mDetails=(MembershipDetails)inputIntance;
		ShippingDetails details=new ShippingDetails();
		details.setMessage(mDetails.getMessageBody());
		return details;
	}

	@Override
	public T executeRule(T inputIntance) {
		ShippingDetails details=executePreRule(inputIntance);
		//generate email for Membership
		generateEmail(details);
		logger.info("Upgrade that membership");
		return inputIntance;
		
		
	}

	

	
	
	
	


}
