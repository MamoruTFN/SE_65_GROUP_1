package eng.cpe.se.project.model;
// Generated Mar 7, 2023, 11:29:50 PM by Hibernate Tools 5.6.3.Final

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Paymentcheck generated by hbm2java
 */
public class PaymentCheck implements java.io.Serializable {

	private Integer paymentCheckId;
	@JsonIgnore
	private JoinCourse joinCourse;
	@JsonIgnore
	private User user;
	private String imgPath;
	private String status;

	public PaymentCheck() {
	}

	public PaymentCheck(Integer paymentCheckId, JoinCourse joinCourse, User user, String imgPath, String status) {
		super();
		this.paymentCheckId = paymentCheckId;
		this.joinCourse = joinCourse;
		this.user = user;
		this.imgPath = imgPath;
		this.status = status;
	}

	public Integer getPaymentCheckId() {
		return paymentCheckId;
	}

	public void setPaymentCheckId(Integer paymentCheckId) {
		this.paymentCheckId = paymentCheckId;
	}

	public JoinCourse getJoinCourse() {
		return joinCourse;
	}

	public void setJoinCourse(JoinCourse joinCourse) {
		this.joinCourse = joinCourse;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
