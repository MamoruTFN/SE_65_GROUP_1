package eng.cpe.se.project.model;
// Generated Mar 1, 2023, 12:55:07 AM by Hibernate Tools 5.6.3.Final

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int userId;
	@JsonIgnore
	private Account account;
	@JsonIgnore
	private User user;
	private String userName;
	private String verifyStatus;
	private String imgPath;
	@JsonIgnore
	private List<Bookmark> bookmarks = new ArrayList<Bookmark>();
	@JsonIgnore
	private List<RequestVerifyDetail> requestVerifyDetails = new ArrayList<RequestVerifyDetail>();
	@JsonIgnore
	private List<WithdrawReport> withdrawReports = new ArrayList<WithdrawReport>();
	@JsonIgnore
	private List<PostLike> postLikes = new ArrayList<PostLike>();
	@JsonIgnore
	private List<CommentLike> commentLikes = new ArrayList<CommentLike>();
	@JsonIgnore
	private List<Post> posts = new ArrayList<Post>();
	@JsonIgnore
	private List<PaymentCheck> paymentChecks = new ArrayList<PaymentCheck>();
	@JsonIgnore
	private List<RequestCourse> requestCourses = new ArrayList<RequestCourse>();
	@JsonIgnore
	private List<Report> reports = new ArrayList<Report>();
	@JsonIgnore
	private List<CourseCreator> courseCreators = new ArrayList<CourseCreator>();
	@JsonIgnore
	private List<Comment> comments = new ArrayList<Comment>();
	@JsonIgnore
	private List<User> users = new ArrayList<User>();

	public User() {
	}

	public User(Account account, User user, String userName, String verifyStatus, String imgPath) {
		this.account = account;
		this.user = user;
		this.userName = userName;
		this.verifyStatus = verifyStatus;
		this.imgPath = imgPath;
	}

	public User(Account account, User user, String userName, String verifyStatus, String imgPath, List<Bookmark> bookmarks,
			List<RequestVerifyDetail> requestverifydetails, List<WithdrawReport> withdrawreports, List<PostLike> postlikes, List<CommentLike> commentlikes, List<Post> posts,
			List<PaymentCheck> paymentchecks, List<RequestCourse> requestcourses, List<Report> reports, List<CourseCreator> coursecreators, List<Comment> comments, List<User> users) {
		this.account = account;
		this.user = user;
		this.userName = userName;
		this.verifyStatus = verifyStatus;
		this.imgPath = imgPath;
		this.bookmarks = bookmarks;
		this.requestVerifyDetails = requestverifydetails;
		this.withdrawReports = withdrawreports;
		this.postLikes = postlikes;
		this.commentLikes = commentlikes;
		this.posts = posts;
		this.paymentChecks = paymentchecks;
		this.requestCourses = requestcourses;
		this.reports = reports;
		this.courseCreators = coursecreators;
		this.comments = comments;
		this.users = users;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVerifyStatus() {
		return verifyStatus;
	}

	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public List<Bookmark> getBookmarks() {
		return bookmarks;
	}

	public void setBookmarks(List<Bookmark> bookmarks) {
		this.bookmarks = bookmarks;
	}

	public List<RequestVerifyDetail> getRequestVerifyDetails() {
		return requestVerifyDetails;
	}

	public void setRequestVerifyDetails(List<RequestVerifyDetail> requestVerifyDetails) {
		this.requestVerifyDetails = requestVerifyDetails;
	}

	public List<WithdrawReport> getWithdrawReports() {
		return withdrawReports;
	}

	public void setWithdrawReports(List<WithdrawReport> withdrawReports) {
		this.withdrawReports = withdrawReports;
	}

	public List<PostLike> getPostLikes() {
		return postLikes;
	}

	public void setPostLikes(List<PostLike> postLikes) {
		this.postLikes = postLikes;
	}

	public List<CommentLike> getCommentLikes() {
		return commentLikes;
	}

	public void setCommentLikes(List<CommentLike> commentLikes) {
		this.commentLikes = commentLikes;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public List<PaymentCheck> getPaymentChecks() {
		return paymentChecks;
	}

	public void setPaymentChecks(List<PaymentCheck> paymentChecks) {
		this.paymentChecks = paymentChecks;
	}

	public List<RequestCourse> getRequestCourses() {
		return requestCourses;
	}

	public void setRequestCourses(List<RequestCourse> requestCourses) {
		this.requestCourses = requestCourses;
	}

	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public List<CourseCreator> getCourseCreators() {
		return courseCreators;
	}

	public void setCourseCreators(List<CourseCreator> courseCreators) {
		this.courseCreators = courseCreators;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}


}