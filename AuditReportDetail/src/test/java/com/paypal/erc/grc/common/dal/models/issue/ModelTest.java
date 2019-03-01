package com.paypal.erc.grc.common.dal.models.issue;

import org.junit.Test;
import org.agileware.test.PropertiesTester;

public class ModelTest {
@Test
public void passOnValidationPojo()throws Exception{
	
	
	PropertiesTester pr = new PropertiesTester();
	pr.testAll(ReportSource.class);
		
	
}
}
