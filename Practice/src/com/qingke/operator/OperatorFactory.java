package com.qingke.operator;

public class OperatorFactory {
 public Operator buildOperator(String operator){
	 if(operator.equals("+")){
		 return new AddOperator();
	 }
	 if(operator.equals("-")){
		 return new ReduceOperator();
	 }
	 if(operator.equals("*")){
		 return new MulipcationOperator();
	 }
	 if(operator.equals("/")){
		 return new DivisionOperator();
	 }
	return null;
 }
}
