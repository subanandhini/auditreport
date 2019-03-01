package com.paypal.erc.grc.common.dal.models.issue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest(classes =AuditReportDetailApplication.class)
public class AuditReportDetailApplicationTests {

java.util.logging.Logger logger = java.util.logging.Logger.getLogger("AuditReportDetailApplicationTests ");
	@Test
	public void AuditReportDetailApplicationTestsMethod() {
		 logger.info("Inside AuditReportDetailApplicationTestsMethod");
		 String [] args= {" "};
		 AuditReportDetailApplication.main(args);
	}
}
