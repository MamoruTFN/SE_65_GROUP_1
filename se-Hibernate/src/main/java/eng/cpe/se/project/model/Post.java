package eng.cpe.se.project.model;
// Generated Mar 7, 2023, 9:28:55 AM by Hibernate Tools 5.6.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Post generated by hbm2java
 */
public class Post implements java.io.Serializable {

	private Integer postId;
	private Contenttype contenttype;
	private User user;
	private String postTopic;
	private String postDetail;
	private String reportStatus;
	private Date createDate;
	private Set bookmarks = new HashSet(0);
	private Set reports = new HashSet(0);
	private Set imgposts = new HashSet(0);
	private Set comments = new HashSet(0);
	private Set likeposts = new HashSet(0);

	public Post() {
	}

	public Post(Contenttype contenttype, User user, String postTopic, String postDetail, Date createDate) {
		this.contenttype = contenttype;
		this.user = user;
		this.postTopic = postTopic;
		this.postDetail = postDetail;
		this.createDate = createDate;
	}

	public Post(Contenttype contenttype, User user, String postTopic, String postDetail, String reportStatus,
			Date createDate, Set bookmarks, Set reports, Set imgposts, Set comments, Set likeposts) {
		this.contenttype = contenttype;
		this.user = user;
		this.postTopic = postTopic;
		this.postDetail = postDetail;
		this.reportStatus = reportStatus;
		this.createDate = createDate;
		this.bookmarks = bookmarks;
		this.reports = reports;
		this.imgposts = imgposts;
		this.comments = comments;
		this.likeposts = likeposts;
	}

	public Integer getPostId() {
		return this.postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Contenttype getContenttype() {
		return this.contenttype;
	}

	public void setContenttype(Contenttype contenttype) {
		this.contenttype = contenttype;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPostTopic() {
		return this.postTopic;
	}

	public void setPostTopic(String postTopic) {
		this.postTopic = postTopic;
	}

	public String getPostDetail() {
		return this.postDetail;
	}

	public void setPostDetail(String postDetail) {
		this.postDetail = postDetail;
	}

	public String getReportStatus() {
		return this.reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Set getBookmarks() {
		return this.bookmarks;
	}

	public void setBookmarks(Set bookmarks) {
		this.bookmarks = bookmarks;
	}

	public Set getReports() {
		return this.reports;
	}

	public void setReports(Set reports) {
		this.reports = reports;
	}

	public Set getImgposts() {
		return this.imgposts;
	}

	public void setImgposts(Set imgposts) {
		this.imgposts = imgposts;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getLikeposts() {
		return this.likeposts;
	}

	public void setLikeposts(Set likeposts) {
		this.likeposts = likeposts;
	}

}
