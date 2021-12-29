package rule;

public interface RuleExecutor<T,S> {
	
	public S executePreRule(T inputIntance);
	public T executeRule(T inputIntance);

}
