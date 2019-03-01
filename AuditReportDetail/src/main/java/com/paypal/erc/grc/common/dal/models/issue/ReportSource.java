package com.paypal.erc.grc.common.dal.models.issue;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ReportSource{
@Id
private  String auditReportName;
private int auditPlanYear;
private  String auditReportDate;
private String opinion;
java.util.logging.Logger logger = java.util.logging.Logger.getLogger("ReportSource");
public ReportSource() {
	
}
@Id
public String getAuditReportName() {
	logger.info("Inside  getAuditReportName executing Report params : " );
	return auditReportName;
}
public void setAuditReportName(String auditReportName){
	logger.info("Inside setAuditReportName executing Report params : " );

	this.auditReportName = auditReportName;}
	

public int getAuditPlanYear() {
	logger.info("Inside getAuditPlanYear executing Report params : " );
	return auditPlanYear;
}

public void setAuditPlanYear(int auditPlanYear) {
	logger.info("Inside setAuditPlanYear executing Report params : " );
	this.auditPlanYear = auditPlanYear;
}
public String getAuditReportDate() {
	logger.info("Inside getAuditReportDate executing Report params : " );
	return auditReportDate;
}
public void setAuditReportDate(String auditReportDate) {
	logger.info("Inside setAuditReportDate executing Report params : " );
	this.auditReportDate = auditReportDate;
}
public String getOpinion() {
	logger.info("Inside getOpinion executing Report params : " );
	return opinion;
}
public void setOpinion(String opinion) {
	logger.info("Inside setOpinion executing Report params : " );
	this.opinion = opinion;
}
@Override
public String toString() {
	return "ReportSource [auditReportName=" + auditReportName + ", auditPlanYear=" + auditPlanYear
			+ ", auditReportDate=" + auditReportDate + ", opinion=" + opinion + "]";
}
}