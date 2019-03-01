package com.paypal.erc.grc.common.dal.models.issue;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestAuditReportDetail {
	@Mock
	private AuditService as;
	@InjectMocks
	private AuditReportDetail ard;
	@Mock
	private ReportSource rs;

//	List<ReportSource> l =null;
	@BeforeClass
	public static void AuditDetail() {

		System.out.println("before class is running");
	}

	String rsa;
	String json;
	ArrayList<ReportSource> l= new ArrayList<ReportSource>();
	@Before
	public void AuditDetails() {
		// ard=new AuditReportDetail();
	    rs = mock(ReportSource.class);
		// as=mock(AuditService.class);
 
		ReportSource rs = new ReportSource();
		rs.setAuditReportDate("20.10.2018");
		rs.setAuditReportName("four");
		rs.setOpinion("approved");
		rs.setAuditPlanYear(0);
		rsa = rs.toString();
		
		l.add(rs);
	}

	@AfterClass
	public static void Aftermethod() {
		System.out.println(" Audit Report Method was completed");
	}

	@Test
	public void AuditReportDetail() {
		ReportSource reportSource = new ReportSource();
	    Assert.assertNull("not null method", ard.Report(rsa));
		Mockito.when(as.AuditReport("three")).thenThrow(NullPointerException.class);
		Assert.assertEquals(ard.Report("three"), null);
		Mockito.when(as.AuditReport("four")).thenReturn(reportSource);
		Assert.assertEquals(ard.Report("four"), reportSource);

	}
@Test
public void AuditReportPost() {
	ReportSource reportSource = new ReportSource();
	//Assert.assertEquals(  reportSource,);
	doNothing().when(as).AuditReportPost(reportSource);
	ard.AuditReportPost(reportSource);
	//Assert.assertEquals(as.AuditReportPost(rs),(reportSource));
	doThrow(NullPointerException.class).when(as).AuditReportPost(null);
	ard.AuditReportPost(null);
//	Mockito.when(as.AuditReportPost(null)).thenThrow(NullPointerException.class);
}
@Test
public void AuditReportPut() {
	ReportSource reportSource = new ReportSource();
	doNothing().when(as).AuditReportPut("three", reportSource);
	ard.AuditReportPut("three", reportSource);
	doThrow(NullPointerException.class).when(as).AuditReportPut("three", reportSource);
	ard.AuditReportPut("three", reportSource);
}
@Test
public void AuditReportDelete() {
	ReportSource reportSource = new ReportSource();
	doNothing().when(as).AuditReportDelete("four", reportSource);
	ard.AuditReportDelete("four", reportSource);
	doThrow(NullPointerException.class).when(as).AuditReportDelete("three",reportSource);
	ard.AuditReportDelete("three", reportSource);
}
@Test
public void Report() {
	Mockito.when (ard.Report()).thenReturn(l);
	ard.Report();
}
}