package rule;

import java.util.logging.Logger;

import model.OrderSlip;

public class PhysicalProductRule<String> extends AbstractGenerateCommission<String> {
	Logger logger=Logger.getLogger("PhysicalProductRule");

	@Override
	public OrderSlip executePreRule(String inputIntance) {
		logger.info("set details for input to rule");
		OrderSlip orderSlip =new OrderSlip();
		return orderSlip;
	}

	@Override
	public String executeRule(String inputIntance) {
		OrderSlip orderSlip=executePreRule(inputIntance);
		setCommision(orderSlip);
		logger.info("generate shipping slip for physical product");
		return (String) orderSlip.toString();
		
		
	}

	
	
	
	


}
