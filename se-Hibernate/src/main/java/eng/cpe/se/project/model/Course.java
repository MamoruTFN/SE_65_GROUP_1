package eng.cpe.se.project.model;
// Generated Mar 1, 2023, 12:55:07 AM by Hibernate Tools 5.6.3.Final

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Course generated by hbm2java
 */
public class Course implements java.io.Serializable {

	private int courseId;
	private CourseCreator courseCreator;
	private Post post;
	private Type type;
	private String courseDetail;
	private int minimum;
	private int maximum;
	private float price;
	private String status;
	private Date firstEnrollDate;
	private Date lastEnrollDate;
	private Date eventDay;
	private String startTime;
	private String endTime;
	private List<ImgCourse> imgCourses = new ArrayList<ImgCourse>();
	private List<JoinCourse> joinCourses = new ArrayList<JoinCourse>();
	private List<Report> reports = new ArrayList<Report>();
	private List<RequestCourseDetail> requestCourseDetails = new ArrayList<RequestCourseDetail>();

	public Course() {
	}

	public Course(CourseCreator coursecreator, Type type, String courseDetail, int minimum, float price, String status,
			Date firstEnrollDate, Date lastEnrollDate, Date eventDay, String startTime, String endTime) {
		this.courseCreator = coursecreator;
		this.type = type;
		this.courseDetail = courseDetail;
		this.minimum = minimum;
		this.price = price;
		this.status = status;
		this.firstEnrollDate = firstEnrollDate;
		this.lastEnrollDate = lastEnrollDate;
		this.eventDay = eventDay;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Course(CourseCreator coursecreator, Post post, Type type, String courseDetail, int minimum, Integer maximum,
			float price, String status, Date firstEnrollDate, Date lastEnrollDate, Date eventDay, String startTime,
			String endTime, List<ImgCourse> imgcourses, List<JoinCourse> joincourses, List<Report> reports, List<RequestCourseDetail> requestcoursedetails) {
		this.courseCreator = coursecreator;
		this.post = post;
		this.type = type;
		this.courseDetail = courseDetail;
		this.minimum = minimum;
		this.maximum = maximum;
		this.price = price;
		this.status = status;
		this.firstEnrollDate = firstEnrollDate;
		this.lastEnrollDate = lastEnrollDate;
		this.eventDay = eventDay;
		this.startTime = startTime;
		this.endTime = endTime;
		this.imgCourses = imgcourses;
		this.joinCourses = joincourses;
		this.reports = reports;
		this.requestCourseDetails = requestcoursedetails;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public CourseCreator getCourseCreator() {
		return courseCreator;
	}

	public void setCourseCreator(CourseCreator courseCreator) {
		this.courseCreator = courseCreator;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFirstEnrollDate() {
		return firstEnrollDate;
	}

	public void setFirstEnrollDate(Date firstEnrollDate) {
		this.firstEnrollDate = firstEnrollDate;
	}

	public Date getLastEnrollDate() {
		return lastEnrollDate;
	}

	public void setLastEnrollDate(Date lastEnrollDate) {
		this.lastEnrollDate = lastEnrollDate;
	}

	public Date getEventDay() {
		return eventDay;
	}

	public void setEventDay(Date eventDay) {
		this.eventDay = eventDay;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<ImgCourse> getImgCourses() {
		return imgCourses;
	}

	public void setImgCourses(List<ImgCourse> imgCourses) {
		this.imgCourses = imgCourses;
	}

	public List<JoinCourse> getJoinCourses() {
		return joinCourses;
	}

	public void setJoinCourses(List<JoinCourse> joinCourses) {
		this.joinCourses = joinCourses;
	}

	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public List<RequestCourseDetail> getRequestCourseDetails() {
		return requestCourseDetails;
	}

	public void setRequestCourseDetails(List<RequestCourseDetail> requestCourseDetails) {
		this.requestCourseDetails = requestCourseDetails;
	}
	
}