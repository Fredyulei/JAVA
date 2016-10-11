package com.qingke.operator;

public class DivisionOperator implements Operator {

	@Override
	public double dooperator(double a, double b) throws Exception {
		// TODO Auto-generated method stub
		if(b==0){
			throw new Exception("xxxx");
		}
		return a/b;
	}

}
