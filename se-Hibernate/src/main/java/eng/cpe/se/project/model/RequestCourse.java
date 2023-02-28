package eng.cpe.se.project.model;
// Generated Mar 1, 2023, 12:55:07 AM by Hibernate Tools 5.6.3.Final

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Requestcourse generated by hbm2java
 */
public class RequestCourse implements java.io.Serializable {

	private int requestCourseId;
	private Post post;
	private Staff staff;
	private User user;
	private String status;
	private Date dateApprove;
	private Date dateExprie;
	private List<RequestCourseDetail> requestCourseDetails = new ArrayList<RequestCourseDetail>();

	public RequestCourse() {
	}

	public RequestCourse(Post post, Staff staff, User user, String status, Date dateApprove, Date dateExprie) {
		this.post = post;
		this.staff = staff;
		this.user = user;
		this.status = status;
		this.dateApprove = dateApprove;
		this.dateExprie = dateExprie;
	}

	public RequestCourse(Post post, Staff staff, User user, String status, Date dateApprove, Date dateExprie,
			List<RequestCourseDetail> requestcoursedetails) {
		this.post = post;
		this.staff = staff;
		this.user = user;
		this.status = status;
		this.dateApprove = dateApprove;
		this.dateExprie = dateExprie;
		this.requestCourseDetails = requestcoursedetails;
	}

	public int getRequestCourseId() {
		return requestCourseId;
	}

	public void setRequestCourseId(int requestCourseId) {
		this.requestCourseId = requestCourseId;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateApprove() {
		return dateApprove;
	}

	public void setDateApprove(Date dateApprove) {
		this.dateApprove = dateApprove;
	}

	public Date getDateExprie() {
		return dateExprie;
	}

	public void setDateExprie(Date dateExprie) {
		this.dateExprie = dateExprie;
	}

	public List<RequestCourseDetail> getRequestCourseDetails() {
		return requestCourseDetails;
	}

	public void setRequestCourseDetails(List<RequestCourseDetail> requestCourseDetails) {
		this.requestCourseDetails = requestCourseDetails;
	}


}
