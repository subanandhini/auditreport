package com.paypal.erc.grc.common.dal.models.issue;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service 
public class AuditService {
	 java.util.logging.Logger logger = java.util.logging.Logger.getLogger("AuditService");
@Autowired
private AuditReportDetailRepository auditReportDetailRepository;
public List<ReportSource> AuditReport() {	
	logger.info(" Inside AuditReport executing Report without param");
	List<ReportSource> ReportSources =new ArrayList<>();
	  auditReportDetailRepository.findAll().
	     forEach(ReportSources::add);
		   return ReportSources;
		   
}
public ReportSource AuditReport(String id){
	logger.info(" Inside AuditReport executing Report param : " + id);
	if(auditReportDetailRepository.findById(id).isPresent()) {
		return auditReportDetailRepository.findById(id).get();
	}
	else
	return null;
}
public void AuditReportPost(ReportSource reportSource) {
	logger.info(" Inside AuditReportPost executing Report params : " + reportSource);
	auditReportDetailRepository.save(reportSource);
}

public void AuditReportPut(String id, ReportSource reportSource) {
	logger.info(" Inside AuditReportPut executing Report params : " + reportSource+" and id "+ id);
	auditReportDetailRepository.save(reportSource);
}
public void AuditReportDelete(String id ,ReportSource reportSource) {
	logger.info(" Inside AuditReportDelete executing Report params : " + reportSource+" and id "+ id);
	auditReportDetailRepository.delete(reportSource);
}

}