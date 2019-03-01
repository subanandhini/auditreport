package com.paypal.erc.grc.common.dal.models.issue;

import static org.mockito.Mockito.doNothing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)

public class TestAuditService {
	@InjectMocks
	private AuditService as;
	@Mock
	private AuditReportDetail ard;
	
	@Mock
	private AuditReportDetailRepository ardr;
	
	List<ReportSource> ReportSources =null;

	 ReportSource r=new ReportSource();
	@Before
	public   void setUpBeforeClass() throws Exception {
		ReportSources =new ArrayList<>();
	}

	@Test
	public void TestAuditServices() {
		MockMvcRequestBuilders.post("/Report").accept(MediaType.APPLICATION_JSON); 
//	    when (as.AuditReport("five")).thenReturn(null);
//	    ReportSource response = null;
	   // Assert.assertEquals(as.AuditReport(),ReportSources );
	 //   Assert.assertEquals(as.AuditReport("six"),response );
	       }
	@Test
	public void TestAuditReport() {
	Mockito.when(ardr.findById("1")).thenReturn(Optional.of(new ReportSource()));
	as.AuditReport("1");
	Mockito.when(ardr.findAll()).thenReturn(ReportSources);
	as.AuditReport();
	Mockito.when(ardr.findById(null)).thenReturn(null);
	ardr.findById(null);
	
	}
	@Test
	public void AuditReportPost() {
		Mockito.when(ardr.save(r)).thenReturn(r);
		as.AuditReportPost(r);
	}
	@Test
	public void AuditReportPut() {
		Mockito.when(ardr.save(r)).thenReturn(r);
		as.AuditReportPut("one",r);
	}
	@Test
	public void AuditReportDelete() {
		doNothing().when(ardr).delete(r);
		
		ardr.delete(r);
		doNothing().when(ardr).delete(r);
		as.AuditReportDelete(null, r);
	}
 }


