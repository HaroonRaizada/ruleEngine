package rule;

import java.util.logging.Logger;

import model.OrderSlip;
import model.RoyalityModel;

public class BookRule<T> extends AbstractGenerateCommission<T> {
	Logger logger=Logger.getLogger("BookRule");

	@Override
	public OrderSlip executePreRule(T inputIntance) {
		RoyalityModel royalityModel=(RoyalityModel)inputIntance;
		logger.info("set details for input to rule");
		OrderSlip orderSlip =new OrderSlip();
		orderSlip.setCustomerId(royalityModel.getCustomerId());
		return orderSlip;
	}

	@Override
	public T executeRule(T inputIntance) {
		OrderSlip orderSlip=executePreRule(inputIntance);
		setCommision(orderSlip);
		
		logger.info("created a duplicate packing slip for the royalty department");
		return  inputIntance;
		
		
	}

	
	
	
	


}
