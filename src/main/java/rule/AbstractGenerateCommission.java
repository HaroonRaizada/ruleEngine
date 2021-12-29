package rule;

import java.util.logging.Logger;

import model.OrderSlip;

public abstract class AbstractGenerateCommission<S> implements RuleExecutor<S,OrderSlip> {
	

	Logger logger=Logger.getLogger("AbstractGenerateCommission");
	public OrderSlip setCommision(OrderSlip inputIntance) {
		logger.info("commission has been set for the agent");
		
		return inputIntance;
	}
	abstract public OrderSlip executePreRule(S inputIntance);
	abstract public S executeRule(S inputIntance);


}
