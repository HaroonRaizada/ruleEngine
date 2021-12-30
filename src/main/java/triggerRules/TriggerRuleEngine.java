package triggerRules;

import java.util.logging.Logger;

import model.MembershipDetails;
import model.RoyalityModel;
import model.VideoModel;
import rule.BookRule;
import rule.MembershipRule;
import rule.PhysicalProductRule;
import rule.RuleExecutor;
import rule.UpgradeRule;
import rule.VideoRule;

public class TriggerRuleEngine {
	public static Logger logger=Logger.getLogger("TriggerRuleEngine");
	public static void main(String[] args) throws Exception {
	
		if(args!=null&&args.length>0) {
		String orderType=args[0];
		
		executeRule(orderType);
		}else {
			throw new Exception("invalid input passed");
		}
	}
	public static void executeRule(String orderType) {
		RuleExecutor executor=null;
		switch (orderType) {
		case "Physical Product":
			//passing generic input to the rule
			executor=new PhysicalProductRule<String>();
			
			executor.executeRule(orderType);
			
			break;
		case "Book":
			executor=new BookRule<RoyalityModel>();
			//passing generic input to the rule
			RoyalityModel model=new RoyalityModel();
			model.setCustomerId("2000");
			executor.executeRule(model);
			
			break;
		case "Membership":
			executor=new MembershipRule<MembershipDetails>();
			MembershipDetails details=new MembershipDetails();
			//passing generic input to the rule
			
			details.setRecipientEmailId("reciep@g.com");
			executor.executeRule(details);
			
			break;
		case "Upgrade":
			executor=new UpgradeRule<MembershipDetails>();
			MembershipDetails detailsMembership=new MembershipDetails();
			//passing generic input to the rule
			
			detailsMembership.setRecipientEmailId("reciep@g.com");
			executor.executeRule(detailsMembership);
			
			break;
		case "Video":
			executor=new VideoRule<VideoModel>();
			VideoModel videoModel=new VideoModel();
			//passing generic input to the rule
			
			videoModel.setVideoType("Learning to Ski");
			executor.executeRule(videoModel);
			
			break;
		default:
			logger.info("Wrong input type passed");
			break;
		}
		
	}

}
