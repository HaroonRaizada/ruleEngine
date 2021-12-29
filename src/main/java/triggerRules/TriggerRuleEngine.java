package triggerRules;

import java.lang.reflect.InvocationTargetException;

import rule.PhysicalProductRule;
import rule.RuleExecutor;

public class TriggerRuleEngine {

	public static void main(String[] args) {
		String orderType="Physical Product";
		RuleExecutor executor=null;
		switch (orderType) {
		case "Physical Product":
			executor=new PhysicalProductRule<String>();
			
			executor.executeRule("a");
			
			break;
		default:
			break;
		}
	}

}
