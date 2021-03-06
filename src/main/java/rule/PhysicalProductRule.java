package rule;

import java.util.logging.Logger;

import model.OrderSlip;

public class PhysicalProductRule<T> extends AbstractGenerateCommission<T> {
	Logger logger=Logger.getLogger("PhysicalProductRule");

	@Override
	public OrderSlip executePreRule(T inputIntance) {
		logger.info("set details for input to rule");
		OrderSlip orderSlip =new OrderSlip();
		return orderSlip;
	}

	@Override
	public T executeRule(T inputIntance) {
		OrderSlip orderSlip=executePreRule(inputIntance);
		setCommision(orderSlip);
		logger.info("generate shipping slip for physical product");
		
		return inputIntance;
		
		
		
	}

	
	
	
	


}
