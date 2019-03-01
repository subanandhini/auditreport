package com.paypal.erc.grc.common.dal.models.issue;

import org.springframework.data.repository.CrudRepository;

public interface AuditReportDetailRepository extends CrudRepository <ReportSource, String>{

	//Iterable<ReportSource> findAll();
	 // java.util.logging.Logger logger = java.util.logging.Logger.getLogger("AuditReportDetailRepository");
	  
}