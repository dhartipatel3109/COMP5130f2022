package com.cms.UML_CMS.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class UserComplaint {
	private int Complaint_ID;
	// private String foreignEmail;
	private String ComplaintType;
	private String ComplaintCategory;
	private String SubCategory;
	private String AuthDept;
	private String ComplaintDetails;
	private Date ComplaintDate;
	private int user_id;
	private boolean isMerged;
	private int Merged_ID;
	private String status;
	private String feedback;

	public UserComplaint() {

	}
	public UserComplaint(int complaint_ID, String complaintType, String complaintCategory, String subCategory,
			String authDept, String complaintDetails, Date complaintDate, int user_id, boolean isMerged, int merged_ID,
			String status, String feedback) {

		Complaint_ID = complaint_ID;
		ComplaintType = complaintType;
		ComplaintCategory = complaintCategory;
		SubCategory = subCategory;
		AuthDept = authDept;
		ComplaintDetails = complaintDetails;
		ComplaintDate = complaintDate;
		this.user_id = user_id;
		this.isMerged = isMerged;
		Merged_ID = merged_ID;
		this.status = status;
		this.feedback = feedback;
	}

	public int getComplaint_ID() {
		return Complaint_ID;
	}

	public void setComplaint_ID(int complaint_ID) {
		Complaint_ID = complaint_ID;
	}

	public String getComplaintType() {
		return ComplaintType;
	}

	public void setComplaintType(String complaintType) {
		ComplaintType = complaintType;
	}

	public String getComplaintCategory() {
		return ComplaintCategory;
	}

	public void setComplaintCategory(String complaintCategory) {
		ComplaintCategory = complaintCategory;
	}

	public String getSubCategory() {
		return SubCategory;
	}

	public void setSubCategory(String subCategory) {
		SubCategory = subCategory;
	}

	public String getAuthDept() {
		return AuthDept;
	}

	public void setAuthDept(String authDept) {
		AuthDept = authDept;
	}

	public String getComplaintDetails() {
		return ComplaintDetails;
	}

	public void setComplaintDetails(String complaintDetails) {
		ComplaintDetails = complaintDetails;
	}

	public Date getComplaintDate() {
		return ComplaintDate;
	}

	public void setComplaintDate(Date complaintDate) {
		ComplaintDate = complaintDate;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public boolean isMerged() {
		return isMerged;
	}

	public void setMerged(boolean isMerged) {
		this.isMerged = isMerged;
	}

	public int getMerged_ID() {
		return Merged_ID;
	}

	public void setMerged_ID(int merged_ID) {
		Merged_ID = merged_ID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
