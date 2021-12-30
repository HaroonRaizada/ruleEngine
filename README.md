# ruleEngine
Business Rule Engine program
This is a generic rule Engine Program.
With each new rule corresponds to a java file in rule package.

Steps to add a new rule.

Create a java class file in rule package and extends RuleExecutor interface or a custom abstract class which accomodates 
a common functionality between two rules. Like we extends AbstractEmailNotification class which has common functionality of sending email for membership and upgrade rules.

Add all pre requisites in executePreRule method and rule logic in executeRule.

Second step is to add switch case in TriggerRuleEngine file with newly added rule name.

Only above two steps will add a new rule.

To run and test this program follow below steps:

1. Clone this project and run mvn clean install. It will run all junit test cases, written for each rule.

2. Then execute mvn exec:java@someID -Dexec.args=<RuleName>. E.g  try with "Book","Physical Product" to test our rules.

mvn exec:java@someID -Dexec.args="Video" and see in console the expected output.

3. Below are the names of the rules:

Book, Physical Product,Membership,Upgrade,Video

