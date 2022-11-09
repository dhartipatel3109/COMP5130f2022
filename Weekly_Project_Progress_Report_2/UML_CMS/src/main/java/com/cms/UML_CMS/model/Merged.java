package com.cms.UML_CMS.model;

import javax.persistence.Entity;

@Entity
public class Merged {
	private int Merged_ID;
	private int Complaint_ID;
	private int user_id;
	private String ComplaintType;
	private String ComplaintCategory;
	// private String SubCategory;
	// private String AuthDept;
	private String status;
	private String Remarks;

	public Merged() {

	}
	public Merged(int merged_ID, int complaint_ID, int user_id, String complaintType, String complaintCategory,
			String status, String remarks) {

		Merged_ID = merged_ID;
		Complaint_ID = complaint_ID;
		this.user_id = user_id;
		ComplaintType = complaintType;
		ComplaintCategory = complaintCategory;
		this.status = status;
		Remarks = remarks;
	}

	public int getMerged_ID() {
		return Merged_ID;
	}

	public void setMerged_ID(int merged_ID) {
		Merged_ID = merged_ID;
	}

	public int getComplaint_ID() {
		return Complaint_ID;
	}

	public void setComplaint_ID(int complaint_ID) {
		Complaint_ID = complaint_ID;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

}
