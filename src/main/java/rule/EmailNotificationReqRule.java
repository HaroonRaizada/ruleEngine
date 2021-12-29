package rule;

public abstract class EmailNotificationReqRule<T> implements RuleExecutor<T> {

	public T executePreRule(String orderType) {
		
	}

	 abstract public void executeRule(T inputIntance) ;
		

	
}
