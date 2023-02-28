package eng.cpe.se.project.model;
// Generated Mar 1, 2023, 12:55:07 AM by Hibernate Tools 5.6.3.Final

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Approvewithdraw generated by hbm2java
 */
public class ApproveWithdraw implements java.io.Serializable {

	private int approveWithdrawId;
	private Staff staff;
	private Date dateApprove;
	private String status;
	private List<ApproveWithdrawDetail> approveWithdrawDetails = new ArrayList<ApproveWithdrawDetail>();

	public ApproveWithdraw() {
	}

	public ApproveWithdraw(Staff staff, Date dateApprove, String status) {
		this.setStaff(staff);
		this.setDateApprove(dateApprove);
		this.setStatus(status);
	}

	public ApproveWithdraw(Staff staff, Date dateApprove, String status, List<ApproveWithdrawDetail> approvewithdrawdetails) {
		this.setStaff(staff);
		this.setDateApprove(dateApprove);
		this.setStatus(status);
		this.setApproveWithdrawDetails(approvewithdrawdetails);
	}

	public int getApproveWithdrawId() {
		return approveWithdrawId;
	}

	public void setApproveWithdrawId(int approveWithdrawId) {
		this.approveWithdrawId = approveWithdrawId;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Date getDateApprove() {
		return dateApprove;
	}

	public void setDateApprove(Date dateApprove) {
		this.dateApprove = dateApprove;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ApproveWithdrawDetail> getApproveWithdrawDetails() {
		return approveWithdrawDetails;
	}

	public void setApproveWithdrawDetails(List<ApproveWithdrawDetail> approveWithdrawDetails) {
		this.approveWithdrawDetails = approveWithdrawDetails;
	}

	
}
