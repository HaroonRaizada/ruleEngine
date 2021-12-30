package rule;

import java.util.logging.Logger;

import model.OrderSlip;
import model.RoyalityModel;
import model.VideoModel;

public class VideoRule<T> implements RuleExecutor<T, OrderSlip> {
	Logger logger=Logger.getLogger("VideoRule");

	@Override
	public OrderSlip executePreRule(T inputIntance) {
		VideoModel royalityModel=(VideoModel)inputIntance;
		logger.info("set details for input to rule");
		OrderSlip orderSlip =new OrderSlip();
		orderSlip.setCustomerId(royalityModel.getVideoName());
		return orderSlip;
	}

	@Override
	public T executeRule(T inputIntance) {
		VideoModel model=(VideoModel)inputIntance;
		
		OrderSlip orderSlip=executePreRule(inputIntance);
		
		if(("Learning to Ski").equalsIgnoreCase(model.getVideoType())) {
		logger.info("add a free “First Aid” video to the packing slip (the result of a court decision in 1997)");
		model.setVideoName(orderSlip.getCustomerId());
		}
		return  (T)model;
		
		
	}

	
	
	
	


}
