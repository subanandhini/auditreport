package com.paypal.erc.grc.common.dal.models.issue;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
public class TestReportSource {
	ReportSource rs;
	ReportSource rsm;
	@Before
	public void beforeTestReportSource() {
    rs=new ReportSource();
	rsm= mock(ReportSource.class);}
@Test
public void TestReportSources() {
	rs.setAuditPlanYear(2020);
	rs.setAuditReportDate("20.10.2018");
    rs.setAuditReportName("four");
	rs.setOpinion("approved");
	rs.getAuditPlanYear();
	rs.getAuditReportDate();
	rs.getAuditReportName();
	rs.getOpinion();
	rs.setAuditReportDate(null);
   
  }
}