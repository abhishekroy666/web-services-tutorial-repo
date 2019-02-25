package org.tempuri;

import org.tempuri.CalculatorStub.AddResponse;

public class DemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		CalculatorStub stub = new CalculatorStub();
		CalculatorStub.Add a = new CalculatorStub.Add();
		
		a.setIntA(10);
		a.setIntB(20);
		
		AddResponse res = stub.add(a);
		System.out.println(res.getAddResult());

	}

}
