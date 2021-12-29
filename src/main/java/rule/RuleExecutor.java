package rule;

public interface RuleExecutor<T> {
	
	public T executePreRule(String orderType);
	public void executeRule(T inputIntance);

}
